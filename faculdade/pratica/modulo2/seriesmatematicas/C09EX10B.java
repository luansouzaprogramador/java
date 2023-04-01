package faculdade.pratica.modulo2.seriesmatematicas;

import javax.swing.JOptionPane;

public class C09EX10B {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double numerador, denominador, serie=0;
		
		for (int aux=1; aux<=100; aux++) {
			numerador = 2*aux;
			denominador = 3*aux;
			serie += numerador/denominador;
		}
		
		serie = 1 + Math.sqrt(serie);
		JOptionPane.showMessageDialog(null, String.format("Valor da Série B = %.3f", serie), "SÉRIES Matemáticas", JOptionPane.INFORMATION_MESSAGE);
	}
}