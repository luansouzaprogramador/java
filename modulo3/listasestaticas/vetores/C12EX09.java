package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;

public class C12EX09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int soma=0;
		
		System.out.println("Informe a seguir 10 numeros inteiros.\n");
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Informe o "+(i+1)+"_o numero: ");
			numeros[i] = teclado.nextInt();
			soma += numeros[i];
		}
		
		System.out.print("\nValores digitados divisores da soma de todos os numeros lidos: ");
		for (int i=0; i<numeros.length; i++) {
			if (soma%numeros[i]==0) {
				System.out.print(numeros[i]+" ");
			}
		}
		
		teclado.close();
	}
}
