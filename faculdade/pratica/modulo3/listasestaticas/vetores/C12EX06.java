package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;

public class C12EX06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] meses = new String[12];
		
		System.out.println("Informe a seguir o nome dos 12 meses do ano em ordem cronologica.\n");
		for (int i=0; i<meses.length; i++) {
			System.out.print(i+1+"_o mes: ");
			meses[i] = teclado.nextLine();
		}
		
		System.out.print("\nNomes dos meses do ano em ordem inversa: | ");
		for (int i=meses.length-1; i>=0; i--) {
			System.out.print(meses[i]+" | ");
		}
		
		teclado.close();
	}
}
