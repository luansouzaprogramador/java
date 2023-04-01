package faculdade.pratica.modelosdecodigos;

import java.util.Scanner;

public class C12EX09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[100];
		String nome;
		int[] pontosPerdidos = new int[nomes.length];
		int cont = pontosPerdidos.length-1, temp, posicao = -1;
		
		for (int i=0; i<nomes.length; i++) {
			System.out.print("Informe o nome do "+(i+1)+"_o competidor: ");
			nomes[i] = teclado.nextLine();
			System.out.print("Informe a quantidade de pontos perdidos: ");
			pontosPerdidos[i] = teclado.nextInt();
			teclado.nextLine();
		}
		
		for (int i=0; i<pontosPerdidos.length-1; i++) {
			for (int j=0; j<pontosPerdidos.length-1; j++) {
				if (pontosPerdidos[j]>pontosPerdidos[j+1]) {
					temp = pontosPerdidos[j];
					pontosPerdidos[j] = pontosPerdidos[j+1];
					pontosPerdidos[j+1] = temp;
				}
			}
			cont--;
		}
		
		System.out.println();
		do {
			System.out.print("Informe o nome do competidor que deseja procurar: ");
			nome = teclado.nextLine();
			for (int i=0; i<nomes.length; i++) {
				if (nome.equalsIgnoreCase(nomes[i])) {
					posicao = i;
				}
			}
			if (posicao!=-1) {
				break;
			} else {
				System.out.print("Valor invalido! ");
			}
		} while (posicao == -1);
		
		if (posicao>=0 && posicao<=3) {
			System.out.println("O jogador esta entre os top 10 do torneio!");
		} else {
			System.out.println("O jogador nao esta entre os dez primeiros colocados!");
		}
		
		teclado.close();
	}
}
