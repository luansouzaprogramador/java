package faculdade.pratica.modulo3.modularizacao;

import java.util.Scanner;

public class C13EX11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		
		System.out.print("Informe o nome completo de uma pessoa: ");
		nome = teclado.nextLine();
		
		System.out.println("\nA penultima palavra do nome dessa pessoa e => "+PenultimoNome(nome));
		
		teclado.close();
	}
	
	static String PenultimoNome (String nome) {
		String[] nomes;
		nomes = nome.split(" ");
		
		return nomes[nomes.length-2].toUpperCase();
	}
}
