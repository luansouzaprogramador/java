package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;

public class C12EX03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		
		System.out.println("Informe a seguir 10 valores numericos inteiros.\n");
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Informe o "+(i+1)+"_o valor: ");
			numeros[i] = teclado.nextInt();
		}
		
		System.out.print("\nNumeros digitados divisores de 34: ");
		for (int i=0; i<numeros.length; i++) {
			if (34%numeros[i]==0) {
				System.out.print(numeros[i]+" ");
			}
		}
		
		teclado.close();
	}
}
