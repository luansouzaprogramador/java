package faculdade.pratica.modulo3.modularizacao;

import java.util.Scanner;

public class C13EX09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		
		System.out.print("Digite uma frase curta qualquer: ");
		frase = teclado.nextLine();
		
		System.out.println("\n=> "+fraseFormatada(frase));
		
		teclado.close();
	}
	
	static String fraseFormatada (String frase) {
		String[] palavras;
		String fraseFormatada;
		palavras = frase.split(" ");
		fraseFormatada = palavras[0].substring(0, 1).toUpperCase()+palavras[0].substring(1)+" ";
		for (int i=1; i<palavras.length; i++) {
			fraseFormatada += palavras[i].substring(0, 1).toUpperCase()+palavras[i].substring(1)+" ";
		}
		return fraseFormatada;
	}
}
