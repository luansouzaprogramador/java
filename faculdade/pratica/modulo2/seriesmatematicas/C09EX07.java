package faculdade.pratica.modulo2.seriesmatematicas;

import javax.swing.JOptionPane;

public class C09EX07 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double numerador, denominador, serie=0;
		
		for (int aux=1; aux<=6; aux++) {
			numerador = 2*(aux-1) + (3*aux);
			denominador = 6*aux + 1;
			serie += numerador/denominador;
		}
		
		JOptionPane.showMessageDialog(null, String.format("Valor da Série = %.4f", serie), "SÉRIES Matemáticas", JOptionPane.INFORMATION_MESSAGE);
	}
}