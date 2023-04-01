package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;

public class C08EX23 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int n1, n2, n3, n4, soma=0, quantPalindromo=0;
		double media;
		
		for (int i=1000; i<=9999; i++) {
			n1 = i/1000;
			n2 = i/100%10;
			n3 = i%100/10;
			n4 = i%10;
			if (n1==n4 && n2==n3) {
				soma += i;
				quantPalindromo++;
			}
		}
		
		media = (double) soma/quantPalindromo;
		
		JOptionPane.showMessageDialog(null, String.format("Média de todos os palíndromos compreendidos entre 1000 e 9999 = %1.1f", media), "Palíndromo", JOptionPane.INFORMATION_MESSAGE);
	}
}