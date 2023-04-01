package faculdade.pratica.modulo1.comandoswitch;

import java.util.Scanner;

public class C07ex04 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o nome da equipe de futebol: ");
		nome = teclado.nextLine();
		System.out.println();
		switch (nome) {
			case "América": case "Atlético": case "Cruzeiro": case "Villa Nova":
				System.out.println("O time pertence à Minas Gerais.");
				break;
			case "Botafogo": case "Flamengo": case "Fluminense": case "Vasco":
				System.out.println("O time pertence ao Rio de Janeiro.");
				break;
			case "Corinthians": case "Palmeiras": case "Santos": case "São Paulo":
				System.out.println("O time pertence à São Paulo.");
				break;
			case "Grêmio": case "Internacional": case "Juventude":
				System.out.println("O time pertence ao Rio Grande do Sul.");
				break;
			case "Náutico": case "Santa Cruz": case "Sport":
				System.out.println("O time pertence à Pernambuco.");
				break;
			default:
				System.out.println("Time Inválido!");
		}
		teclado.close();
	}
}