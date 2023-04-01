package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;
import java.util.Arrays;

public class C12EX19 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] numeros = new String[100];
		String numero;
		int posicao=-1;
		
		System.out.println("Informe abaixo os numeros dos "+numeros.length+" bilhetes comprados pela pessoa.\n");
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Informe o numero do "+(i+1)+"_o bilhete: ");
			numeros[i] = teclado.nextLine();
		}
		
		System.out.print("\nAgora, informe o numero do bilhete sorteado no premio: ");
		numero = teclado.nextLine();
		/*
		for (int i=0; i<numeros.length; i++) {
			if (numero.equalsIgnoreCase(numeros[i])) {
				posicao = i;
				break;
			}
		}
		if (posicao == -1) {
			System.out.println("Infelizmente, a pessoa nao foi premiada!");
		} else {
			System.out.println("\nParabens, a pessoa foi premiada!");
		}
		*/
		
		Arrays.sort(numeros);
		posicao = Arrays.binarySearch(numeros, numero);
		if (posicao<0) {
			System.out.println("Infelizmente, a pessoa nao foi premiada!");
		} else {
			System.out.println("\nParabens, a pessoa foi premiada!");
		}
		
		teclado.close();
	}
}
