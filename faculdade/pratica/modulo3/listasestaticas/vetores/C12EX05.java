package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;

public class C12EX05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int maiorValor=0;
		
		System.out.println("Informe a seguir 10 numeros inteiros.\n");
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Informe o "+(i+1)+"_o numero: ");
			numeros[i] = teclado.nextInt();
		}
		
		for (int i=0; i<numeros.length; i++) {
			if (i==0 || numeros[i]>maiorValor) {
				maiorValor = numeros[i];
			}
		}
		System.out.println("\nMaior valor: "+maiorValor);
		
		teclado.close();
	}
}
