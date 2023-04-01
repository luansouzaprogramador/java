package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class C12EX16 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		double numero;
		
		System.out.println("Informe abaixo "+numeros.length+" numeros inteiros quaisquer, os quais preenchera um vetor inteiro de "+numeros.length+" posicoes.\n");
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Informe o "+(i+1)+"_o numero: ");
			numeros[i] = teclado.nextInt();
		}
		
		System.out.print("\nPor fim, informe um numero real aleatorio: ");
		numero = teclado.nextDouble();
		
		System.out.print("\nValores informados = ");
		for (int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		
		System.out.print("\n\nValores informados inicialmente multiplicados pelo valor real informado posteriormente = ");
		for (int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]*numero+"  ");
		}
		
		teclado.close();
	}
}
