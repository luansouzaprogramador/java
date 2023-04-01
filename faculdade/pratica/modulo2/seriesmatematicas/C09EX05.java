package faculdade.pratica.modulo2.seriesmatematicas;

import javax.swing.JOptionPane;

public class C09EX05 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String termosStr;
		int termos;
		double numerador, denominador, serie=0;
		
		termosStr = JOptionPane.showInputDialog(null, "Informe a quantidade de termos:", "SÉRIES Matemáticas", JOptionPane.QUESTION_MESSAGE);
		termos = Integer.valueOf(termosStr);
		
		for (int aux=1; aux<=termos; aux++) {
			numerador = (aux-1)*2 + 3*aux;
			denominador = 6*aux+1;
			serie += numerador/denominador;
		}
		
		serie *= 5;
		JOptionPane.showMessageDialog(null, String.format("Valor da Série = %.4f", serie), "SÉRIES Matemáticas", JOptionPane.INFORMATION_MESSAGE);
	}
}