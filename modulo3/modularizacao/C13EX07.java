package faculdade.pratica.modulo3.modularizacao;

import java.util.Scanner;

public class C13EX07 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nomeCompleto;
		
		System.out.print("Informe o nome completo de uma pessoa: ");
		nomeCompleto = teclado.nextLine();
		
		System.out.println("\nO nome de familia (ultimo sobrenome) desta pessoa e => "+NomeFamilia(nomeCompleto));
		
		teclado.close();
	}
	
	static String NomeFamilia (String nomeCompleto) {
		String[] nomesSeparados;
		nomesSeparados = nomeCompleto.split(" ");
		
		return nomesSeparados[nomesSeparados.length-1];
	}
}
