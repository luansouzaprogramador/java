package faculdade.pratica.modulo3.modularizacao;

import java.util.Scanner;

public class C13EX06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nomeFamilia;
		String[] nomes = new String[100];
		
		System.out.print("Informe o sobrenome de uma familia: ");
		nomeFamilia = teclado.nextLine();
		
		System.out.println("Informe a seguir o nome completo de "+nomes.length+" pessoas e saiba quantas delas podem pertencer a mesma familia.\n");
		for (int i=0; i<nomes.length; i++) {
			System.out.print("Informe o nome da "+(i+1)+"_a pessoa: ");
			nomes[i] = teclado.nextLine();
		}
		
		System.out.println("\nEntre as "+nomes.length+" pessoas informadas, provavelmente "+MesmaFamilia(nomeFamilia, nomes)+" delas pertencem a familia "+nomeFamilia+".");
		teclado.close();
	}
	
	static int MesmaFamilia (String nomeFamilia, String[] nomes) {
		String[] nomesSeparados;
		int cont=0;
		for (int i=0; i<nomes.length; i++) {
			nomesSeparados = nomes[i].split(" ");
			if (nomesSeparados[nomesSeparados.length-1].equalsIgnoreCase(nomeFamilia)) {
				cont++;
			}
		}
		return cont;
	}
}
