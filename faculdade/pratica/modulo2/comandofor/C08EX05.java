/*
package faculdade.pratica.modulo2.comandofor;

import java.util.Scanner;

public class C08EX05 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int voto=0, fulano=0, ciclano=0, beltrano=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Eleições\nDigite 1 para FULANO, 2 para CICLANO ou 3 para BELTRANO.\n");
		
		for (int i=1; i<=100; i++) {
			System.out.println(i+"° pessoa votando");
			System.out.print("Informe seu voto: ");
			voto = teclado.nextInt();
			System.out.println();
			
			if (!(voto==1 || voto==2 || voto==3)) {
				System.out.println("Voto Inválido!");
				break;
			}
			
			switch (voto) {
				case 1:
					fulano++;
					break;
				case 2:
					ciclano++;
					break;
				case 3:
					beltrano++;
					break;
			}
		}
		
		if ((voto==1 || voto==2 || voto==3)) {
			System.out.println("FULANO:   "+fulano);
			System.out.println("CICLANO:  "+ciclano);
			System.out.println("BELTRANO: "+beltrano);
		}
		
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;

public class C08EX05 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String votoStr;
		int voto=0, fulano=0, ciclano=0, beltrano=0;
		
		JOptionPane.showMessageDialog(null, "Digite 1 para FULANO, 2 para CICLANO ou 3 para BELTRANO.", "Eleições", JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=1; i<=100; i++) {
			votoStr = JOptionPane.showInputDialog(null, "Informe seu voto:", i+"° pessoa votando", JOptionPane.QUESTION_MESSAGE);
			voto = Integer.valueOf(votoStr);
			
			if (!(voto==1 || voto==2 || voto==3)) {
				JOptionPane.showMessageDialog(null, "Voto Inválido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			switch (voto) {
				case 1:
					fulano++;
					break;
				case 2:
					ciclano++;
					break;
				case 3:
					beltrano++;
					break;
			}
		}
		
		if ((voto==1 || voto==2 || voto==3)) {
			JOptionPane.showMessageDialog(null, "FULANO:      "+fulano+"\nCICLANO:     "+ciclano+"\nBELTRANO: "+beltrano, "Resultado das Eleições", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}