package faculdade.pratica.modulo1.scannereprint;

import java.util.Scanner;

public class C04ex01 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String primeiroNome, nomeMeio, sobrenome;
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe seu primeiro nome: ");
		primeiroNome = teclado.nextLine();
		System.out.print("Informe seu nome do meio: ");
		nomeMeio = teclado.nextLine();
		System.out.print("Informe seu sobrenome: ");
		sobrenome = teclado.nextLine();
		System.out.print("Informe a sua idade: ");
		idade = teclado.nextInt();
		// System.out.println("\n"+sobrenome+", "+primeiroNome+" "+nomeMeio+"\nIdade: "+idade+" anos.");
		System.out.printf("\n%s, %s %s\nIdade: %d anos.", sobrenome, primeiroNome, nomeMeio, idade);
		teclado.close();
	}
}