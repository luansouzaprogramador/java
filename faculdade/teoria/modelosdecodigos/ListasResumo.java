package faculdade.pratica.modelosdecodigos;

import java.util.Scanner;
import java.util.ArrayList;

public class ListasResumo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// declaracao
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		// adicionar
		for (int i=0; i<10; i++) {
			System.out.print("Informe o "+(i+1)+"_o numero: ");
			numeros.add(teclado.nextInt());
		}
		
		// ordenacao crescente com numeros - metodo sort
		numeros.sort(null);
		System.out.print("\nOrdem crescente: ");
		for (int i=0; i<numeros.size(); i++) {
			System.out.print(numeros.get(i)+" ");
		}
		
		// ordenacao crescente - metodo da bolha
		int temp;
		int cont = numeros.size()-1;
		for (int i=0; i<numeros.size()-1; i++) {
			for (int j=0; j<numeros.size()-1; j++) {
				if (numeros.get(j)>numeros.get(j+1)) {
					temp = numeros.get(j);
					numeros.set(j, numeros.get(j+1));
					numeros.set(j+1, temp);
				}
			}
			cont--;
		}
		
		System.out.print("\nOrdem crescente: ");
		for (int i=0; i<numeros.size(); i++) {
			System.out.print(numeros.get(i)+" ");
		}
		
		// ordenacao decrescente - metodo da bolha
		int temp2;
		int cont2 = numeros.size()-1;
		for (int i=0; i<numeros.size()-1; i++) {
			for (int j=0; j<numeros.size()-1; j++) {
				if (numeros.get(j)<numeros.get(j+1)) {
					temp2 = numeros.get(j);
					numeros.set(j, numeros.get(j+1));
					numeros.set(j+1, temp2);
				}
			}
			cont2--;
		}
		
		System.out.print("\nOrdem decrescente: ");
		for (int i=0; i<numeros.size(); i++) {
			System.out.print(numeros.get(i)+" ");
		}
		
		// ordenacao alfabetica crescente - metodo da bolha
		ArrayList<String> nomes = new ArrayList<String>();
		
		teclado.nextLine();
		System.out.println("----------------------------------\n");
		for (int i=0; i<5; i++) {
			System.out.print("Informe o nome da "+(i+1)+"_a pessoa: ");
			nomes.add(teclado.nextLine());
		}
		
		String temp3;
		int cont3 = nomes.size()-1;
		for (int i=0; i<nomes.size()-1; i++) {
			for (int j=0; j<nomes.size()-1; j++) {
				if (nomes.get(j).compareToIgnoreCase(nomes.get(j+1))>0) {
					temp3 = nomes.get(j);
					nomes.set(j, nomes.get(j+1));
					nomes.set(j+1, temp3);
				}
			}
			cont3--;
		}
		
		System.out.print("\nOrdem alfabetica crescente: ");
		for (int i=0; i<nomes.size(); i++) {
			System.out.print(nomes.get(i)+" ");
		}
		
		// ordenacao crescente com palavras - metodo sort
		ArrayList<String> nomes2 = new ArrayList<String>();
		
		System.out.println();
		for (int i=0; i<5; i++) {
			System.out.print("Informe o nome da "+(i+1)+"_a pessoa: ");
			nomes2.add(teclado.nextLine());
		}
		
		nomes2.sort(null);
		System.out.print("\nOrdem alfabetica crescente: ");
		for (int i=0; i<nomes2.size(); i++) {
			System.out.print(nomes2.get(i)+" ");
		}
		
		// ordenacao alfabetica decrescente - metodo da bolha
		ArrayList<String> nomes3 = new ArrayList<String>();
		
		System.out.println();
		for (int i=0; i<5; i++) {
			System.out.print("Informe o nome da "+(i+1)+"_a pessoa: ");
			nomes3.add(teclado.nextLine());
		}
		
		String temp4;
		int cont4 = nomes3.size()-1;
		for (int i=0; i<nomes3.size()-1; i++) {
			for (int j=0; j<nomes3.size()-1; j++) {
				if (nomes3.get(j).compareToIgnoreCase(nomes3.get(j+1))<=0) {
					temp4 = nomes3.get(j);
					nomes3.set(j, nomes3.get(j+1));
					nomes3.set(j+1, temp4);
				}
			}
			cont4--;
		}
		
		System.out.print("\nOrdem alfabetica decrescente: ");
		for (int i=0; i<nomes3.size(); i++) {
			System.out.print(nomes3.get(i)+" ");
		}
		
		// pesquisar e remover elementos da lista - metodos indexOf e remove
		ArrayList<String> nomes4 = new ArrayList<String>();
		String nome;
		
		System.out.println();
		for (int i=0; i<5; i++) {
			System.out.print("Informe o nome da "+(i+1)+"_a pessoa: ");
			nomes4.add(teclado.nextLine());
		}
		
		System.out.println();
		do {
			System.out.print("Informe o nome que deseja remover da lista: ");
			nome = teclado.nextLine();
			if (nomes4.indexOf(nome) == -1) {
				System.out.print("Valor invalido! ");
			} else {
				nomes4.remove(nomes4.indexOf(nome));
				System.out.println("Nome removido com sucesso!");
				break;
			}
		} while(nomes4.indexOf(nome) == -1);
		
		System.out.print("\nNomes: ");
		for (int i=0; i<nomes4.size(); i++) {
			System.out.print(nomes4.get(i)+" ");
		}
		
		// limpar
		nomes4.clear();
		System.out.println("\nQuantidade de nomes = "+nomes4.size());
		teclado.close();
	}
}
