package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class C08EX19 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String somaVF;
		long soma=0;
		
		for (int i=1; i<=100; i++) {
			soma += Math.pow(i, 2);
		}
		
		somaVF = new DecimalFormat("#,##0").format(soma);
		JOptionPane.showMessageDialog(null, "Soma dos 100 primeiros termos: "+somaVF, "Programa", JOptionPane.INFORMATION_MESSAGE);
	}
}