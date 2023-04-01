package faculdade.pratica.modulo2.comandodowhile;

import javax.swing.JOptionPane;

public class C10EX03 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String anguloStr, raioStr;
		double angulo, raio;
		
		anguloStr = JOptionPane.showInputDialog(null, "Informe o valor do ângulo:", "Setor Circular", JOptionPane.QUESTION_MESSAGE);
		angulo = Double.valueOf(anguloStr);
		
		do {
			raioStr = JOptionPane.showInputDialog(null, "Informe o valor do raio ou digite -1 para encerrar o programa:", "Setor Circular", JOptionPane.QUESTION_MESSAGE);
			raio = Double.valueOf(raioStr);
			if (raio!=-1)
				JOptionPane.showMessageDialog(null, String.format("Área = %.4f", angulo*3.1416*Math.pow(raio,2)/360), "Setor Circular", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "Fim do programa!", "Setor Circular", JOptionPane.INFORMATION_MESSAGE);
		} while (raio!=-1);
	}
}