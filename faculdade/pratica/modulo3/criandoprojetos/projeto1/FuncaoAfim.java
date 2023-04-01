package faculdade.pratica.modulo3.criandoprojetos.projeto1;

import javax.swing.JOptionPane;

public class FuncaoAfim {
	public static void CalculaFuncaoAfim() {
		String aStr, bStr;
		double a, b;
		
		JOptionPane.showMessageDialog(null, "Formula da funcao do 1o grau: f(x) = ax + b\n\nTendo como base a formula da funcao afim acima, informe a seguir os valores dos coeficientes a e b, respectivamente.", "Funcao do 1o Grau", JOptionPane.INFORMATION_MESSAGE);
		aStr = JOptionPane.showInputDialog(null, "A =", "Funcao Afim", JOptionPane.QUESTION_MESSAGE);
		bStr = JOptionPane.showInputDialog(null, "B =", "Funcao Afim", JOptionPane.QUESTION_MESSAGE);
		a = Double.valueOf(aStr);
		b = Double.valueOf(bStr);
		
		JOptionPane.showMessageDialog(null, String.format("Raiz da equacao = %.2f", (-b/a)), "Funcao do 1o grau", JOptionPane.INFORMATION_MESSAGE);
	}
}
