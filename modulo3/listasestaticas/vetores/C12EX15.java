package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class C12EX15 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int soma=0, qtdeNumPares=0;
		
		System.out.println("Informe abaixo "+numeros.length+" numeros inteiros quaisquer, os quais preenchera um vetor inteiro de "+numeros.length+" posicoes.\n");
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Informe o "+(i+1)+"_o numero: ");
			numeros[i] = teclado.nextInt();
		}
		
		System.out.print("\nValores informados = ");
		for (int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		
		System.out.print("\nNumeros pares = ");
		for (int i=0; i<numeros.length; i++) {
			if (numeros[i]%2 == 0) {
				System.out.print(numeros[i]+" ");
				soma += numeros[i];
				qtdeNumPares++;
			}
		}
		System.out.printf("\nMedia dos numeros pares = %.1f", (double) soma/qtdeNumPares);
		
		teclado.close();
	}
}
