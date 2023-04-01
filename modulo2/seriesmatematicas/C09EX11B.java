package faculdade.pratica.modulo2.seriesmatematicas;

import javax.swing.JOptionPane;

public class C09EX11B {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double numerador, denominador, serie=0;
		
		for (int aux=1; aux<=100; aux++) {
			numerador = 3*aux-2;
			denominador = Math.sqrt(3*aux+4);
			serie += numerador/denominador;
		}
		
		serie = (5/3.0) * serie;
		JOptionPane.showMessageDialog(null, String.format("Valor da Série B = %.3f", serie), "SÉRIES Matemáticas", JOptionPane.INFORMATION_MESSAGE);
	}
}