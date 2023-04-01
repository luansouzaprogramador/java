package faculdade.pratica.modelosdecodigos;

import java.util.Scanner;

public class C12EX03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long numero;
		int posicao;
		
		do {
			System.out.print("Informe um numero inteiro que esteja entre 0 e 999999999: ");
			numero = teclado.nextLong();
			if (numero>=0 && numero<=999999999) {
				break;
			} else {
				System.out.print("Valor invalido! ");
			}
		} while (numero<0 || numero>999999999);
		
		System.out.print("Informe a posicao do digito que deseja visualizar em ordem inversa: ");
		posicao = teclado.nextInt();
		System.out.println("=> "+posicaoInversa(numero, posicao));
		teclado.close();
	}
	
	public static char posicaoInversa(long numero, int posicao) {
		String numeroStr;
		numeroStr = String.valueOf(numero);
		return numeroStr.charAt(numeroStr.length()-posicao);
	}
}
