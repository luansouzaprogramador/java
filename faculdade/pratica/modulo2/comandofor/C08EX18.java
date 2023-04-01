package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;

public class C08EX18 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] rags) {
		String numeroStr;
		int numero;
		numeroStr = JOptionPane.showInputDialog(null, "Informe um número inteiro de 1 a 9:", "Programa", JOptionPane.QUESTION_MESSAGE);
		numero = Integer.valueOf(numeroStr);
		
		if (numero>0 && numero<10) {
			for (int i=1; i<=9; i++)
				System.out.println(i+" X "+numero+" = "+i*numero);
		}
		else
			JOptionPane.showMessageDialog(null, "Valor inválido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
	}
}