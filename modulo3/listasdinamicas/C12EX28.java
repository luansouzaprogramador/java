package faculdade.pratica.modulo3.listasdinamicas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class C12EX28 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<String> nomes = new ArrayList<String>();
		List<String> registrosAcademicos = new ArrayList<String>();
		String nome, registroAcademico, auxNome, auxRA;
		int quantAlunos, posicao=-1, cont;
		
		System.out.print("Informe a quantidade de alunos da turma: ");
		quantAlunos = teclado.nextInt();
		if (quantAlunos>0) {
			teclado.nextLine();
			System.out.println("Informe a seguir o nome e o RA (registro academico) dos "+quantAlunos+" alunos da turma.\n");
			for (int i=0; i<quantAlunos; i++) {
				System.out.print("Informe o nome do "+(i+1)+"o aluno: ");
				nome = teclado.nextLine();
				nomes.add(nome);
				System.out.print("Informe o RA de "+nomes.get(i)+": ");
				registroAcademico = teclado.nextLine();
				registrosAcademicos.add(registroAcademico);
				System.out.println();
			}
			
			cont = nomes.size()-1;
			for (int i=0; i<nomes.size()-1; i++) {
				for (int j=0; j<cont; j++) {
					if (nomes.get(j).compareTo(nomes.get(j+1)) > 0) {
						auxNome = nomes.get(j);
						nomes.set(j, nomes.get(j+1));
						nomes.set(j+1, auxNome);
						auxRA = registrosAcademicos.get(j);
						registrosAcademicos.set(j, registrosAcademicos.get(j+1));
						registrosAcademicos.set(j+1, auxRA);
					}
				}
				cont--;
			}
			
			System.out.print("Informe o nome do aluno que esta procurando: ");
			nome = teclado.nextLine();
			
			for (int i=0; i<nomes.size(); i++) {
				if (nome.equalsIgnoreCase(nomes.get(i))) {
					posicao = i;
					break;
				}
			}
			
			if (posicao==-1) {
				System.out.println("NOME NAO ENCONTRADO!");
			} else {
				System.out.printf("\nRA de %s: %-20sSua posicao na listagem da turma: %d\n", nomes.get(posicao), registrosAcademicos.get(posicao), posicao+1);
			}
		} else {
			System.out.println("Valor invalido!");
		}
		
		teclado.close();
	}
}
