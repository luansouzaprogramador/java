package faculdade.pratica.modulo2.seriesmatematicas;

import javax.swing.JOptionPane;

public class C09EX11A {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double numerador, denominador, serie=0;
		
		for (int aux=1; aux<=100; aux++) {
			numerador = aux + (7*aux-6);
			denominador = Math.pow(2, 2*(aux-1));
			serie += numerador/denominador;
		}
		
		serie = Math.cbrt(serie);
		JOptionPane.showMessageDialog(null, String.format("Valor da Série A = %.3f", serie), "SÉRIES Matemáticas", JOptionPane.INFORMATION_MESSAGE);
	}
}