package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;

public class C12EX02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		
		System.out.println("Informe a seguir 10 valores numericos inteiros.\n");
		
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Informe o "+(i+1)+"_o valor: ");
			numeros[i] = teclado.nextInt();
		}
		
		System.out.print("\nValores digitados maiores que 5 e menores que 10: ");
		for (int i=0; i<numeros.length; i++) {
			if (numeros[i]>5 && numeros[i]<10) {
				System.out.print(numeros[i]+" ");;
			}
		}
		
		teclado.close();
	}
}
