package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;
// import java.util.Arrays;

public class C12EX18 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[10];
		String nome;
		int posicao=-1;
		
		System.out.println("Informe a seguir o nome das "+nomes.length+" pessoas da fila, na ordem em que se encontram.\n");
		for (int i=0; i<nomes.length; i++) {
			System.out.print("Informe o nome da "+(i+1)+"_a pessoa: ");
			nomes[i] = teclado.nextLine();
		}
		
		System.out.print("\nInforme o nome da pessoa que deseja procurar: ");
		nome = teclado.nextLine();
		
		for (int i=0; i<nomes.length; i++) {
			if (nome.equalsIgnoreCase(nomes[i])) {
				posicao = i;
				break;
			}
		}
		if (posicao == -1) {
			System.out.println("\nA pessoa informada nao se encontra na fila.");
		} else {
			System.out.println("\nA pessoa informada esta em "+(posicao+1)+"_o lugar na fila.");
		}
		
		/*
		posicao = Arrays.binarySearch(nomes, nome);
		if (posicao<0) {
			System.out.println("\nA pessoa informada nao se encontra na fila.");
		} else {
			System.out.println("\nA pessoa informada esta em "+(posicao+1)+"_o lugar da fila.");
		}
		*/
		
		teclado.close();
	}
}
