package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;

public class C12EX24 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[vetor1.length];
		int aux=0;
		
		System.out.println("Informe a seguir "+vetor1.length+" numeros inteiros.\n");
		for (int i=0; i<vetor1.length; i++) {
			System.out.print("Informe o "+(i+1)+"_o numero: ");
			vetor1[i] = teclado.nextInt();
		}
		
		for (int i=0; i<vetor1.length; i++) {
			if (vetor1[i]%3 == 0) {
				vetor2[aux] = vetor1[i];
				aux++;
			}
		}
		
		System.out.print("\nVetor 1 = ");
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
