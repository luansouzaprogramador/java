package faculdade.pratica.modulo2.seriesmatematicas;

import javax.swing.JOptionPane;

public class C09EX11D {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double numerador, denominador, serie=0;
		
		for (int aux=1; aux<=100; aux++) {
			numerador = Math.pow(aux, 3);
			denominador = Math.pow(10, aux-1);
			serie += numerador/denominador;
		}
		
		JOptionPane.showMessageDialog(null, "Valor da Série D = "+serie, "SÉRIES Matemáticas", JOptionPane.INFORMATION_MESSAGE);
	}
}