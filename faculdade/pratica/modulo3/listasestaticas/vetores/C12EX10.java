package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;

public class C12EX10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[50];
		double[] notas = new double[nomes.length];
		int soma=0;
		double media;
		
		System.out.println("Informe a seguir o nome e a nota da prova dos "+nomes.length+" alunos da turma.\n");
		for (int i=0; i<nomes.length; i++) {
			System.out.print("Informe o nome do "+(i+1)+"_o aluno: ");
			nomes[i] = teclado.nextLine();
			System.out.print("Informe a nota de "+nomes[i]+": ");
			notas[i] = teclado.nextDouble();
			System.out.println();
			soma += notas[i];
			teclado.nextLine();
		}
		
		media = (float) soma/nomes.length;
		System.out.println("Nome dos alunos cuja nota ficou acima da media:");
		for (int i=0; i<nomes.length; i++) {
			if (notas[i]>media) {
				System.out.println(nomes[i]);
			}
		}
		
		teclado.close();
	}
}
