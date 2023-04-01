package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;

public class C12EX01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int qtdeDivisoresDe5E7=0;
		
		System.out.println("Informe a seguir 10 valores numericos inteiros.\n");
		
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Informe o "+(i+1)+"_o valor: ");
			numeros[i] = teclado.nextInt();
			if (numeros[i]%5==0 && numeros[i]%7==0) {
				qtdeDivisoresDe5E7++;
			}
		}
		
		System.out.println("\nQuantidade de divisores de 5 e 7 ao mesmo tempo: "+qtdeDivisoresDe5E7);
		
		teclado.close();
	}
}
