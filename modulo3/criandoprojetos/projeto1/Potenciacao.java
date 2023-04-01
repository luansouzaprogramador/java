package faculdade.pratica.modulo3.criandoprojetos.projeto1;

import javax.swing.JOptionPane;

public class Potenciacao {
	public static void CalculaPotenciacao() {
		String xStr, yStr;
		double x, y;
		
		JOptionPane.showMessageDialog(null, "Formula da potencia de um numero: Potencia = x^y\n\nSabe-se que a potencia de um numero e dada por dois valores, a base e o expoente.\nConforme o exemplo acima a base e o numero x e o expoente o y.\n\nInforme a seguir os valores de x e y, respectivamente.", "Potenciacao", JOptionPane.INFORMATION_MESSAGE);
		xStr = JOptionPane.showInputDialog(null, "X =", "Potenciacao", JOptionPane.QUESTION_MESSAGE);
		yStr = JOptionPane.showInputDialog(null, "Y =", "Potenciacao", JOptionPane.QUESTION_MESSAGE);
		x = Double.valueOf(xStr);
		y = Double.valueOf(yStr);
		
		JOptionPane.showMessageDialog(null, x+" ^ "+y+" = "+Math.pow(x, y), "Potenciacao", JOptionPane.INFORMATION_MESSAGE);
	}
}
