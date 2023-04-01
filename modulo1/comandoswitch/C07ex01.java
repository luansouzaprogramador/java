package faculdade.pratica.modulo1.comandoswitch;

import java.util.Scanner;

public class C07ex01 {
	public static void main(String[] args) {
		String nome;
		int jogosGanhos;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o nome do apostador: ");
		nome = teclado.nextLine();
		System.out.print("Informe a quantidade de jogos que ele ganhou: ");
		jogosGanhos = teclado.nextInt();
		System.out.println();
		switch (jogosGanhos) {
			case 1: case 2: case 3: case 4: case 5:
				System.out.println("Apostador: "+nome+"\nPrêmio: Nenhum");
				break;
			case 6: case 7: case 8: case 9: case 10:
				System.out.println("Apostador: "+nome+"\nPrêmio: Outro cartão para apostar!");
				break;
			case 11:
				System.out.println("Apostador: "+nome+"\nPrêmio: R$100,00");
				break;
			case 12:
				System.out.println("Apostador: "+nome+"\nPrêmio: R$1.000,00");
				break;
			case 13:
				System.out.println("Apostador: "+nome+"\nPrêmio: R$50.000,00");
				break;
			default:
				System.out.println("Valor inválido para o número de jogos.");
				break;
		}
		teclado.close();
	}
}