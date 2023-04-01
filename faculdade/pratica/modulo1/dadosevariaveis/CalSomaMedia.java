package faculdade.pratica.modulo1.dadosevariaveis;

import java.util.Scanner;

public class CalSomaMedia {
	// Função: Calcula a média de três números inteiros
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		long n1, n2, n3, soma;
		double media;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número: ");
		n1 = teclado.nextLong();
		System.out.print("Informe outro número: ");
		n2 = teclado.nextLong();
		System.out.print("Informe mais um número: ");
		n3 = teclado.nextLong();
		soma = n1+n2+n3;
		media = soma/3.0;
		System.out.printf("A média entre os números digitados é %3.1f",media);
		teclado.close();
	}
}