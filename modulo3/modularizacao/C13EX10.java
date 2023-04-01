package faculdade.pratica.modulo3.modularizacao;

import java.util.Scanner;

public class C13EX10 {
	static String nome;
	static String [] letras;
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o nome completo de uma pessoa: ");
		nome = teclado.nextLine();
		ImpressaoVertical();
		
		teclado.close();
	}
	
	static void ImpressaoVertical() {
		String[] letras;
		nome = nome.toUpperCase();
		letras = nome.split("");
		
		System.out.println("\nImpressao vertical do nome:\n");
		for (int i=0; i<letras.length; i++) {
			System.out.println(letras[i]);
		}
	}
}
