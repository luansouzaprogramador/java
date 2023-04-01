package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;

public class C08EX16 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int soma=0, quantImpares=0;
		double media;
		
		for (int i=1000; i<=2000; i++) {
			if (i%2 == 0) {
				soma += i;
				quantImpares++;
			}
		}
		
		media = (double) soma/quantImpares;
		JOptionPane.showMessageDialog(null, String.format("Média dos números ímpares: %1.1f", media), "Programa", JOptionPane.INFORMATION_MESSAGE);
	}
}