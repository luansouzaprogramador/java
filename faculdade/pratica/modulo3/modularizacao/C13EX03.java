package faculdade.pratica.modulo3.modularizacao;

import java.util.Scanner;
// import java.util.Arrays;
// import java.util.Collections;

public class C13EX03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long numero;
		int posicao;
		
		System.out.print("Informe um numero inteiro qualquer entre 0 e 999999999: ");
		numero = teclado.nextLong();
		System.out.println();
		
		if (numero>=0 && numero<=999999999) {
			System.out.print("Informe a posicao do digito que deseja visualizar em ordem inversa: ");
			posicao = teclado.nextInt();
			System.out.println("\nO numero que se encontra na posicao "+posicao+", de tres para frente, e igual a "+Decomposicao(numero, posicao));
		} else {
			do {
				System.out.print("Valor invalido! Informe um numero inteiro qualquer entre 0 e 999999999: ");
				numero = teclado.nextLong();
				if (numero>=0 && numero<=999999999) {
					System.out.print("\nInforme a posicao do digito que deseja visualizar em ordem inversa: ");
					posicao = teclado.nextInt();
					System.out.println("\nO numero que se encontra na posicao "+posicao+", de tres para frente, e igual a "+Decomposicao(numero, posicao));
				}
			} while (!(numero>=0 && numero<=999999999));
		}
		teclado.close();
	}
	
	static String Decomposicao (long num1, int num2) {
		String[] valores;
		String aux;
		
		valores = String.valueOf(num1).split("");
		
		// Collections.reverse(Arrays.asList(valores));
		for (int i=0; i<valores.length/2; i++) {
			aux = valores[i];
			valores[i] = valores[valores.length-(i+1)];
			valores[valores.length-(i+1)] = aux;
		}
		
		return valores[num2-1];
	}
}
