package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;

public class C12EX07 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[50];
		String[] conceitos = new String[nomes.length];
		double[] notas = new double[nomes.length];
		
		System.out.println("Informe a seguir o nome e a nota final dos "+nomes.length+" alunos da turma.\n");
		for (int i=0; i<nomes.length; i++) {
			System.out.print("Informe o nome do "+(i+1)+"_o aluno: ");
			nomes[i] = teclado.nextLine();
			System.out.print("Informe a nota final de "+nomes[i]+": ");
			notas[i] = teclado.nextDouble();
			System.out.println();
			teclado.nextLine();
		}
		
		System.out.println("Nome de todos os alunos da turma e seus respectivos conceitos.\n");
		for (int i=0; i<nomes.length; i++) {
			if (notas[i]<=30) {
				conceitos[i] = "D";
			} else if (notas[i]<=60) {
				conceitos[i] = "C";
			} else if(notas[i]<=80) {
				conceitos[i] = "B";
			} else {
				conceitos[i] = "A";
			}
			System.out.printf("Nome: %-15s | Conceito: %s\n", nomes[i], conceitos[i]);
		}
		
		teclado.close();
	}
}
