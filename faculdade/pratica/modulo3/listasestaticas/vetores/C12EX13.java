package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;
import java.util.Arrays;

public class C12EX13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] meses = new String[12];
		
		System.out.println("Informe a seguir o nome dos 12 meses do ano em ordem cronologica.\n");
		for (int i=0; i<meses.length; i++) {
			System.out.print(i+1+"_o mes: ");
			meses[i] = teclado.nextLine();
		}
		Arrays.sort(meses);
		
		System.out.print("\nMeses do ano em ordem alfabetica: ");
		for (int i=0; i<meses.length; i++) {
			System.out.print(meses[i]+"  ");
		}
		
		teclado.close();
	}
}
