package faculdade.pratica.modulo1.expressoesbooleanas;

import java.util.Scanner;

public class C06ex11 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome1, nome2;
		int sets1, sets2, pontuacao1=0, pontuacao2=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nome da Equipe 1: ");
		nome1 = teclado.nextLine();
		System.out.print("Nome da Equipe 2: ");
		nome2 = teclado.nextLine();
		System.out.print("Sets da Equipe 1: ");
		sets1 = teclado.nextInt();
		System.out.print("Sets da Equipe 2: ");
		sets2 = teclado.nextInt();
		
		if (((sets1==3 && sets2==0) || (sets1==3 && sets2==1)) || ((sets2==3 && sets1==0) || (sets2==3 && sets1==1)) || (sets1==3 && sets2==2) || (sets2==3 && sets1==2)) {
			if ((sets1==3 && sets2==0) || (sets1==3 && sets2==1)) {
				pontuacao1 = 3;
				pontuacao2 = 0;
			}
			if ((sets2==3 && sets1==0) || (sets2==3 && sets1==1)) {
				pontuacao2 = 3;
				pontuacao1 = 0;
			}

			if (sets1==3 && sets2==2) {
				pontuacao1 = 2;
				pontuacao2 = 1;
			}
			if (sets2==3 && sets1==2) {
				pontuacao2 = 2;
				pontuacao1 = 1;
			}
			
			System.out.println("\n--------------------------------------------------\n                      Placar\n--------------------------------------------------");
			System.out.println("Pontos "+nome1+" = "+pontuacao1+"     X     Pontos "+nome2+" = "+pontuacao2);
		} else {
			System.out.println("--------------------------------------------------\nValores de sets inválidos!");
		}
		teclado.close();
	}
}