package faculdade.pratica.modulo2.comandodowhile;

import javax.swing.JOptionPane;

public class C10EX01 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String valorStr;
		double valor, multa, soma=0, media;
		int cont=0;
		
		do {
			valorStr = JOptionPane.showInputDialog(null, "Informe o valor financeiro sobre o qual a multa será aplicada:\n"
					+"Digite -1, caso queira encerrar o programa: ", "Sistema de Multas", JOptionPane.QUESTION_MESSAGE);
			valor = Double.valueOf(valorStr);
			if (valor!=-1) {
				multa = 0.1*valor;
				soma += multa;
				cont++;
				JOptionPane.showMessageDialog(null, String.format("Valor = %.2f", multa), "Sistemas de Multas",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} while (valor!=-1);
		
		media = soma/cont;
		
		JOptionPane.showMessageDialog(null, String.format("Média = %.2f", media), "Sistema de Multas", JOptionPane.INFORMATION_MESSAGE);
	}
}