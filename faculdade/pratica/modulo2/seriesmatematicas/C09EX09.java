package faculdade.pratica.modulo2.seriesmatematicas;

import javax.swing.JOptionPane;

public class C09EX09 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String termosStr;
		int termos;
		double numerador, denominador, serie=0;
		
		termosStr = JOptionPane.showInputDialog(null, "Informe a quantidade de termos:", "SÉRIES Matemáticas", JOptionPane.INFORMATION_MESSAGE);
		termos = Integer.valueOf(termosStr);
		
		for (int aux=1; aux<=termos; aux++) {
			numerador = Math.pow(3, aux+1);
			denominador = (9+aux) * Math.sqrt(Math.pow(aux, 4));
			serie += numerador/denominador;
		}
		
		serie = 100 - Math.pow(serie, 3);
		JOptionPane.showMessageDialog(null, "Valor da Série = "+serie, "SÉRIES Matemáticas", JOptionPane.INFORMATION_MESSAGE);
	}
}