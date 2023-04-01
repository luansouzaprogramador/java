package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;

public class C12EX22 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[20];
		
		System.out.println("Informe a seguir "+numeros.length+" numeros inteiros quaisquer.\n");
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Informe o "+(i+1)+"_o numero: ");
			numeros[i] = teclado.nextInt();
		}
		
		System.out.print("\nNumeros informados = ");
		for (int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		
		System.out.print("\nNumeros impressos = ");
		for (int i=0; i<numeros.length; i+=2) {
			System.out.print(numeros[i]+" ");
		}
		for (int i=1; i<numeros.length; i+=2) {
			System.out.print(numeros[i]+" ");
		}
		
		teclado.close();
	}
}
