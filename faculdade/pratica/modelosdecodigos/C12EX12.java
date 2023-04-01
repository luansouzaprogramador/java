package faculdade.pratica.modelosdecodigos;

import java.util.Scanner;

public class C12EX12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[8];
		double[] notas = new double[nomes.length];
		double maiorNota=0;
		
		for (int i=0; i<nomes.length; i++) {
			System.out.print("Informe o nome do "+(i+1)+"_o aluno: ");
			nomes[i] = teclado.nextLine();
			System.out.print("Informe a nota de "+nomes[i]+": ");
			notas[i] = teclado.nextDouble();
			teclado.nextLine();
		}
		
		for (int i=0; i<notas.length; i++) {
			if (i==0 || notas[i]>maiorNota) {
				maiorNota = notas[i];
			}
		}
		
		System.out.println("\nAluno(s) que obteve/obtiveram a maior nota: ");
		for (int i=0; i<notas.length-1; i++) {
			if (maiorNota==notas[i]) {
				System.out.println(nomes[i]);
			}
		}
		
		/*
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
		*/
		
		teclado.close();
	}
}
