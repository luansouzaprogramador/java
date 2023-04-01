package faculdade.pratica.modulo2.comandofor;

import java.util.Scanner;

public  class C08EX14 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int numero;
		char simbolo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro entre 1 e 20: ");
		numero = teclado.nextInt();
		
		if (numero>0 && numero<21) {
			System.out.print("Digite um símbolo qualquer (apenas um caractere): ");
			simbolo = teclado.next().charAt(0);
			System.out.println("\nMatriz\n");
			
			for (int i=1; i<=numero; i++) {
				for (int j=1; j<=numero; j++) {
					System.out.print(simbolo+" ");
				}
				System.out.println();
			}
		} else
			System.out.println("\nValor inválido!");
		teclado.close();
	}
}