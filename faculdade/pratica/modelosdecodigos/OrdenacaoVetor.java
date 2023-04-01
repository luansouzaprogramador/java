package faculdade.pratica.modelosdecodigos;

import java.util.Scanner;

public class OrdenacaoVetor {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[6];
		int i, j, cont=numeros.length-1, temp;
		
		System.out.println("Informe, a seguir, "+numeros.length+" valores num�ricos inteiros.\n");
		for (i=0; i<numeros.length; i++) {
			System.out.print("Informe o "+(i+1)+"� valor: ");
			numeros[i] = teclado.nextInt();
		}
		
		
		for (i=0; i<numeros.length-1; i++) {
			for (j=0; j<cont; j++) {
				if (numeros[j]>numeros[j+1]) {
					temp = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = temp;
				}
			}
			cont--;
		}
		
		// Arrays.sort(vetor2); // ordena o vetor em ordem crescente
		// Arrays.sort(vetor2, Collections.reverseOrder()); // ordena o vetor em ordem decrescente
		// Collections.reverse(Arrays.asList(vetor2)); // inverte a ordem do vetor
		
		System.out.print("\nOrdem crescente dos valores digitados: ");
		for (i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		
		teclado.close();
	}
}
