package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;
import java.text.DecimalFormat;

public class C12EX04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		
		System.out.println("Informe a seguir 10 valores numericos inteiros.\n");
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Informe o "+(i+1)+"_o valor: ");
			numeros[i] = teclado.nextInt();
		}
		
		System.out.print("\nValores digitados elevados ao quadrado: ");
		for (int i=0; i<numeros.length; i++) {
			System.out.print(new DecimalFormat("#,##0 ").format(Math.pow(numeros[i], 2)));
		}
		
		teclado.close();
	}
}
