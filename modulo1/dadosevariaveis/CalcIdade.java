package faculdade.pratica.modulo1.dadosevariaveis;

import java.util.Scanner;

public class CalcIdade {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome;
		int anoNascimento, anoAtual, idade;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu nome completo: ");
		nome = teclado.nextLine();
		System.out.print("Digite o ano em que você nasceu: ");
		anoNascimento = teclado.nextInt();
		System.out.print("Digite o ano em que estamos: ");
		anoAtual = teclado.nextInt();
		idade = anoAtual-anoNascimento;
		System.out.print(nome+", você tem/terá "+idade+" anos em "+anoAtual+".");
		teclado.close();
	}
}