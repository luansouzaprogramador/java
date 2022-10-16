package faculdade.pratica.modelosdecodigos;

import java.util.Scanner;

public class OrdenacaoVetoresNotas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[5];
		String tempNome;
		double[] notas = new double[nomes.length];
		double nota1, nota2, nota3, temp;
		int i, j, cont=nomes.length-1;
		
		System.out.println("Informe as notas dos 3 trabalhos de cada um dos "+nomes.length+" alunos do curso de mestrado de uma universidade.\n");
		for (i=0; i<nomes.length; i++) {
			System.out.print("Informe o nome do "+(i+1)+"� aluno: ");
			nomes[i] = teclado.nextLine();
			System.out.print("Informe a nota do 1� trabalho de "+nomes[i]+": ");
			nota1 = teclado.nextDouble();
			System.out.print("Informe a nota do 2� trabalho de "+nomes[i]+": ");
			nota2 = teclado.nextDouble();
			System.out.print("Informe a nota do 3� trabalho de "+nomes[i]+": ");
			nota3 = teclado.nextDouble();
			notas[i] = (nota1+nota2+nota3)/3;
			System.out.println();
			teclado.nextLine();
		}
		
		for (i=0; i<nomes.length-1; i++) {
			for (j=0; j<cont; j++) {
				if (notas[j]<notas[j+1]) {
					temp = notas[j];
					notas[j] = notas[j+1];
					notas[j+1] = temp;
					tempNome = nomes[j];
					nomes[j] = nomes[j+1];
					nomes[j+1] = tempNome;
				}
			}
			cont--;
		}
		
		System.out.println("\nLista decrescente de notas dos alunos da turma.");
		System.out.printf("\n%-30s%s\n", "Nomes", "Notas");
		for (i=0; i<nomes.length; i++) {
			System.out.printf("%-30s%.1f\n", nomes[i], notas[i]);
		}
		
		teclado.close();
	}
}
