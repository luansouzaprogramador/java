package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;

public class C12EX12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[50];
		double[] notas = new double[nomes.length];
		
		System.out.println("Informe a seguir o nome e a nota dos "+nomes.length+" alunos da turma.\n");
		for (int i=0; i<nomes.length; i++) {
			System.out.print("Informe o nome do "+(i+1)+"_o aluno: ");
			nomes[i] = teclado.nextLine();
			System.out.print("Informe a nota de "+nomes[i]+": ");
			notas[i] = teclado.nextDouble();
			System.out.println();
			teclado.nextLine();
		}
		
		int maiorNota = 0;
		for (int i=1; i<nomes.length; i++) {
			if (notas[i]>notas[maiorNota]) {
				maiorNota = i;
			}
		}
		
		System.out.print("Aluno(s) que obteve/obtiveram a maior nota: ");
		for (int i=0; i<nomes.length; i++) {
			if (notas[i]==notas[maiorNota]) {
				System.out.println(nomes[i]);
			}
		}
		
		teclado.close();
	}
}
