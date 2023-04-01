package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;
// import java.util.Arrays;
// import java.util.Collections;

public class C12EX17 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vetor1 = new int[10];
		Integer[] vetor2 = new Integer[vetor1.length];
		
		System.out.println("Informe a seguir "+vetor1.length+" numeros inteiros.\n");
		for (int i=0; i<vetor1.length; i++) {
			System.out.print("Informe o "+(i+1)+"_o numero: ");
			vetor1[i] = teclado.nextInt();
			vetor2[i] = vetor1[vetor1.length-(i+1)];
		}
		
		// Collections.reverse(Arrays.asList(vetor2));
		
		for (int i=0; i<vetor2.length; i++) {
			vetor2[i] = vetor1[vetor1.length-(i+1)];
		}
		
		System.out.print("\n\nVetor 1 = ");
		for (int i=0; i<vetor1.length; i++) {
			System.out.print(vetor1[i]+" ");
		}
		
		System.out.print("\nVetor 2 = ");
		for (int i=0; i<vetor2.length; i++) {
			System.out.print(vetor2[i]+" ");
		}
		
		teclado.close();
	}
}
