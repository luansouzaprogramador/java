package faculdade.pratica.modulo1.dadosevariaveis;

import java.util.Scanner;

public class CalculaFatorial {
	// Função: Calcular o fatorial de um número
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		long numero, fatorial;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número: ");
		numero = teclado.nextLong();
		fatorial = 1L;
		
		for (long contador = 2; contador <= numero; contador++) {
			fatorial = fatorial*contador;
		}
		System.out.print("O fatorial de " + numero + " é igual a " + fatorial);
		teclado.close();
	}
}