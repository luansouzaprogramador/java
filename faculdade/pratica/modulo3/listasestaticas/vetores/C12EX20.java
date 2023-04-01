package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class C12EX20 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int numMaiorQueUltimo=0;
		double media=0;
		
		System.out.println("Informe abaixo "+numeros.length+" numeros inteiros quaisquer.\n");
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Informe o "+(i+1)+"_o numero: ");
			numeros[i] = teclado.nextInt();
		}
		
		System.out.print("\nValores informados = ");
		for (int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		
		System.out.print("\nValores maiores que o ultimo valor informado ("+numeros[numeros.length-1]+") = ");
		for (int i=0; i<numeros.length; i++) {
			if (numeros[i]>numeros[numeros.length-1]) {
				System.out.print(numeros[i]+" ");
				media += numeros[i];
				numMaiorQueUltimo++;
			}
		}
		media = media/numMaiorQueUltimo;
		
		System.out.println("\nMedia dos numeros impressos = "+new DecimalFormat("#.0").format(media));
		
		teclado.close();
	}
}
