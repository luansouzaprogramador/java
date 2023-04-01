package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;

public class C12EX08 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[20];
		
		System.out.println("Informe abaixo "+numeros.length+" numeros inteiros.\n");
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Informe o "+(i+1)+"_o numero: ");
			numeros[i] = teclado.nextInt();
		}
		
		System.out.println("\nSomas intercaladas.\n");
		for (int i=0; i<numeros.length/2; i++) {
			System.out.println(numeros[i]+" + "+numeros[numeros.length/2+i]+" = "+(numeros[i] + numeros[numeros.length/2+i]));
		}
		
		teclado.close();
	}
}
