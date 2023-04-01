package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;

public class C12EX11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String [] nomes = new String[50];
		double notas[] = new double[nomes.length];
		
//		Leitura de dados
		System.out.println("Informe a seguir o nome e a nota dos "+nomes.length+" alunos da turma.\n");
		for (int i=0; i<nomes.length; i++) {
			System.out.print("Informe o nome do "+(i+1)+"_o aluno: ");
			nomes[i] = teclado.nextLine();
			System.out.print("Informe a nota de "+nomes[i]+": ");
			notas[i] = teclado.nextDouble();
			System.out.println();
			teclado.nextLine();
		}
		
//		Saida de dados / processamento
		/*
//		Solucao Convencional (pesquisa o maior valor)
		double maiorNota=0;
		String nomeMaiorNota=null;
		for (int i=0; i<nomes.length; i++) {
			if (i==0 || notas[i]>maiorNota) {
				maiorNota = notas[i];
				nomeMaiorNota = nomes[i];
			}
		}
		System.out.println("Aluno(a) que obteve a maior nota: "+nomeMaiorNota);
		*/
		
		/*
//		Solucao Convencional (melhorada)
//		Apos a leitura dos dados do Array a ser analisado, declare a variavel auxiliar que armazenara a maior nota
		double maiorNota = notas[0];
		String nomeMaiorNota = null;
		for (int i=1; i<nomes.length; i++) {
			if (notas[i]>maiorNota) {
				maiorNota = notas[i];
				nomeMaiorNota = nomes[i];
			}
		}
		System.out.print("Aluno(a) que obteve a maior nota: "+nomeMaiorNota);
		*/
		
		
//		Solucao alternativa (pesquisar a POSICAO do maior valor)
		int maiorNota = 0;
		for (int i=1; i<nomes.length; i++) {
			if (notas[i]>notas[maiorNota]) {
				maiorNota = i;
			}
		}
		System.out.println("Aluno(a) que obteve a maior nota: "+nomes[maiorNota]);
		
		
		teclado.close();
	}
}
