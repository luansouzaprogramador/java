package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;
// import java.util.Arrays;

public class C12EX25 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomesEquipes = new String[20];
		String auxNome, nomeEquipe, situacao=null;
		int[] pontuacoes = new int[nomesEquipes.length];
		int cont = pontuacoes.length-1, aux, posicao = -1;
		
		System.out.println("Informe a seguir o nome e a pontuacao final das "+nomesEquipes.length+" equipes que compoem a serie A do campeonato brasileiro de futebol.\n");
		for (int i=0; i<nomesEquipes.length; i++) {
			System.out.print("Informe o nome da "+(i+1)+"_a equipe: ");
			nomesEquipes[i] = teclado.nextLine();
			do {
				System.out.print("Informe a pontuacao final do time: ");
				pontuacoes[i] = teclado.nextInt();
				if (pontuacoes[i]<0) {
					System.out.println("Valor invalido, tente novamente!");
				}
			} while (pontuacoes[i]<0);
			System.out.println();
			teclado.nextLine();
		}
		
		
		for (int i=0; i<pontuacoes.length-1; i++) {
			for (int j=0; j<pontuacoes.length-1; j++) {
				if (pontuacoes[j]<pontuacoes[j+1]) {
					aux = pontuacoes[j];
					pontuacoes[j] = pontuacoes[j+1];
					pontuacoes[j+1] = aux;
					auxNome = nomesEquipes[j];
					nomesEquipes[j] = nomesEquipes[j+1];
					nomesEquipes[j+1] = auxNome;
				}
			}
			cont--;
		}
		
		System.out.println("---------------------------------------------");
		
		do {
			System.out.print("Informe o nome de uma equipe: ");
			nomeEquipe = teclado.nextLine();
			for (int i=0; i<nomesEquipes.length; i++) {
				if (nomeEquipe.equalsIgnoreCase(nomesEquipes[i])) {
					posicao = i;
					break;
				}
			}
			// posicao = Arrays.binarySearch(nomesEquipes, nomeEquipe);
			
			if (posicao == -1) {
				System.out.println("Valor invalido, tente novamente!");
			} else {
				posicao+=1;
				if (posicao<=4) {
					situacao = "Copa Libertadores";
				}
				if (posicao>=5 && posicao<=12) {
					situacao = "Copa Sul-americana";
				}
				if (posicao>=17 && posicao<=20) {
					situacao = "Rebaixada";
				}
				
				System.out.printf("\nPosicao do time informado = %-20dSituacao = %s\n", posicao, situacao);
			}
		} while(posicao<0);
		
		teclado.close();
	}
}
