package faculdade.pratica.modulo2.seriesmatematicas;

import javax.swing.JOptionPane;

public class C09EX11E {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double numerador, denominador, serie=0;
		
		for (int aux=1; aux<=100; aux++) {
			numerador = Math.pow(aux, 2)*Math.sqrt(2*aux + 3);
			denominador = Math.pow(aux+1, aux);
			serie += numerador/denominador;
		}
		
		serie = (2/3.0) * serie;
		JOptionPane.showMessageDialog(null, String.format("Valor da Série E = %.3f", serie), "SÉRIES Matemáticas", JOptionPane.INFORMATION_MESSAGE);
	}
}