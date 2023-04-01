package faculdade.pratica.modulo3.modularizacao;

import java.util.Scanner;

public class C13EX08 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nomeAutor;
		
		System.out.print("Informe o nome completo do autor do livro: ");
		nomeAutor = teclado.nextLine();
		
		System.out.println("\n=> "+NormatizaNome(nomeAutor));
		
		teclado.close();
	}
	
	static String NormatizaNome (String nomeAutor) {
		String[] nomesSeparados;
		String nomePadrao;
		
		nomesSeparados = nomeAutor.split(" ");
		nomePadrao = nomesSeparados[nomesSeparados.length-1].toUpperCase()+", ";
		
		for (int i=0; i<nomesSeparados.length-1; i++) {
			nomePadrao += nomesSeparados[i].substring(0, 1).toUpperCase()+". ";
		}
		
		return nomePadrao;
	}
}
