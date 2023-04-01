package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;

public class C12EX26 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		String[] palavras;
		
		System.out.print("Digite uma frase curta: ");
		frase = teclado.nextLine();
		palavras = frase.split(" ");
		
		System.out.println("--------------------------");
		System.out.println("Impressao:");
		for (int i=0; i<palavras.length; i++) {
			System.out.println(palavras[i].substring(0,1).toUpperCase()+palavras[i].substring(1));
		}
		
		teclado.close();
	}
}
