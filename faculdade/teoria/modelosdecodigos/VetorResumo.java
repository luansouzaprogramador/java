package faculdade.pratica.modelosdecodigos;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class VetorResumo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// declaracao
		int[] numeros = new int[10];
		
		// preenchimento
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Informe o "+(i+1)+"_o numero: ");
			numeros[i] = teclado.nextInt();
		}
		
		// somatorio
		int soma=0;
		for (int i=0; i<numeros.length; i++) {
			soma += numeros[i];
		}
		
		// media
		double media;
		media = soma/numeros.length;
		
		// maior valor
		int maiorValor = numeros[0];
		for (int i=1; i<numeros.length; i++) {
			if (numeros[i]>maiorValor) {
				maiorValor = numeros[i];
			}
		}
		System.out.println("\nMaior valor = "+maiorValor);
		
		// menor valor
		int menorValor = numeros[0];
		for (int i=1; i<numeros.length; i++) {
			if (numeros[i]<menorValor) {
				menorValor = numeros[i];
			}
		}
		System.out.println("Menor valor = "+menorValor);
		
		// ordem inversa
		System.out.print("Ordem inversa: ");
		for (int i=numeros.length-1; i>=0; i--) {
			System.out.print(numeros[i]+" ");
		}
		
		// ordem crescente
		int temp;
		int cont = numeros.length-1;
		for (int i=0; i<numeros.length-1; i++) {
			for (int j=0; j<numeros.length-1; j++) {
				if (numeros[j]>numeros[j+1]) {
					temp = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = temp;
				}
			}
			cont--;
		}
		
		System.out.print("\nOrdem crescenete: ");
		for (int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		
		// ordem decrescente
		int temp2;
		int cont2 = numeros.length-1;
		for (int i=0; i<numeros.length-1; i++) {
			for (int j=0; j<numeros.length-1; j++) {
				if (numeros[j]<numeros[j+1]) {
					temp2 = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = temp2;
				}
			}
			cont2--;
		}
		
		System.out.print("\nOrdem decrescente: ");
		for (int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		
		// ordem alfabetica crescente - metodo da bolha
		String[] nomes = new String[5];
		
		teclado.nextLine();
		System.out.println("\n---------------------------------------------\n");
		for (int i=0; i<nomes.length; i++) {
			System.out.print("Informe o nome da "+(i+1)+"_a pessoa: ");
			nomes[i] = teclado.nextLine();
		}
		
		String temp3;
		int cont3 = nomes.length-1;
		for (int i=0; i<nomes.length-1; i++) {
			for (int j=0; j<nomes.length-1; j++) {
				if (nomes[j].compareToIgnoreCase(nomes[j+1])>0) {
					temp3 = nomes[j];
					nomes[j] = nomes[j+1];
					nomes[j+1] = temp3;
				}
			}
			cont3--;
		}
		
		System.out.print("Nomes em ordem alfabetica crescente: ");
		for (int i=0; i<nomes.length; i++) {
			System.out.print(nomes[i]+" ");
		}
		
		// ordem alfabetica decrescente - metodo da bolha
		String[] nomes2 = new String[5];
		
		System.out.println("\n");
		for (int i=0; i<nomes2.length; i++) {
			System.out.print("Informe o nome da "+(i+1)+"_a pessoa: ");
			nomes2[i] = teclado.nextLine();
		}
		
		String temp4;
		int cont4 = nomes2.length-1;
		for (int i=0; i<nomes2.length-1; i++) {
			for (int j=0; j<nomes2.length-1; j++) {
				if (nomes2[j].compareToIgnoreCase(nomes2[j+1])<=0) {
					temp4 = nomes2[j];
					nomes2[j] = nomes2[j+1];
					nomes2[j+1] = temp4;
				}
			}
			cont4--;
		}
		
		System.out.print("Nomes em ordem alfabetica decrescente: ");
		for (int i=0; i<nomes2.length; i++) {
			System.out.print(nomes2[i]+" ");
		}
		
		// ordem alfabetica crescente - metodo sort
		String[] nomes3 = new String[5];
		
		System.out.println("\n");
		for (int i=0; i<nomes3.length; i++) {
			System.out.print("Informe o nome da "+(i+1)+"_a pessoa: ");
			nomes3[i] = teclado.nextLine();
		}
		
		Arrays.sort(nomes3);
		System.out.print("Nomes em ordem alfabetica crescente: ");
		for (int i=0; i<nomes3.length; i++) {
			System.out.print(nomes3[i]+" ");
		}
		
		// ordem alfabetica decrescente - metodo sort
		String[] nomes4 = new String[5];
		
		System.out.println("\n");
		for (int i=0; i<nomes4.length; i++) {
			System.out.print("Informe o nome da "+(i+1)+"_a pessoa: ");
			nomes4[i] = teclado.nextLine();
		}
		
		Arrays.sort(nomes4, Collections.reverseOrder());
		System.out.print("Nomes em ordem alfabetica decrescente: ");
		for (int i=0; i<nomes4.length; i++) {
			System.out.print(nomes4[i]+" ");
		}
		
		teclado.close();
	}
}
