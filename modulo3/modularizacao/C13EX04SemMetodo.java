package faculdade.pratica.modulo3.modularizacao;

import java.util.Scanner;
import java.util.Random;

public class C13EX04SemMetodo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		int numero, cont=0, numeroGerado = random.nextInt(100);
		
		do {
			System.out.print("Informe um numero inteiro qualquer: ");
			numero = teclado.nextInt();
			cont++;
			if (numero>numeroGerado) {
				System.out.println("O numero informado esta acima do numero gerado pelo computador, tente novamente.");
			} else if (numero<numeroGerado) {
				System.out.println("O numero informado esta abaixo do numero gerado pelo computador, tente novamente.");
			} else {
				System.out.println("Parabens, voce acertou!\nForam necessarias "+cont+" tentativas ate se chegar ao numero gerado.");
			}
			System.out.println();
		} while (numero!=numeroGerado);
		
		teclado.close();
	}
}
