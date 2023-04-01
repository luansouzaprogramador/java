package faculdade.pratica.modulo3.modularizacao;

import java.util.Scanner;
import java.util.Random;

public class C13EX04ComMetodoSemParametro {
	static Random random = new Random();
	static int numero, cont, numeroGerado = random.nextInt(100);
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.print("Informe um numero inteiro qualquer: ");
			numero = teclado.nextInt();
			cont++;
			TenteAcertar();
		} while (numero!=numeroGerado);
		
		teclado.close();
	}
	
	static void TenteAcertar() {
		if (numero>numeroGerado) {
			System.out.println("O numero informado esta acima do numero gerado pelo computador, tente novamente.");
		} else if (numero<numeroGerado) {
			System.out.println("O numero informado esta abaixo do numero gerado pelo computador, tente novamente.");
		} else {
			System.out.println("Parabens, voce acertou!\nForam necessarias "+cont+" tentativas ate se chegar ao numero gerado.");
		}
		System.out.println();
	}
}
