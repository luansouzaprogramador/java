package faculdade.pratica.modulo2.seriesmatematicas;

import javax.swing.JOptionPane;

public class C09EX13 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double numerador, denominador, serie=0;
		
		for (int aux=1; aux<=10; aux++) {
			numerador = 1;
			for (int aux2=aux; aux2>=1; aux2--) {
				numerador *= aux2;
			}
			
			denominador = Math.pow(2, aux) - 1;
			
			if (aux%2==1)
				serie += numerador/denominador;
			else
				serie -= numerador/denominador;
		}
		
		JOptionPane.showMessageDialog(null, "Valor da Série = "+serie, "SÉRIES Matemáticas", JOptionPane.INFORMATION_MESSAGE);
	}
}