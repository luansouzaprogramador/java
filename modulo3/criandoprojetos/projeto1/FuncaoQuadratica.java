package faculdade.pratica.modulo3.criandoprojetos.projeto1;

import java.util.Locale;
import javax.swing.JOptionPane;

public class FuncaoQuadratica {
	public static void CalculaFuncaoQuadratica() {
		Locale.setDefault(Locale.US);
		String aStr, bStr, cStr, resultado;
		double a, b, c, delta, x1, x2;
		
		JOptionPane.showMessageDialog(null, "Em relacao a funcao quadratica f(x) = ax^2 + bx + c, informe os valores de seus coeficientes.", "Funcao Quadratica", JOptionPane.INFORMATION_MESSAGE);
		
		aStr = JOptionPane.showInputDialog(null, "A =", "Funcao Quadratica", JOptionPane.QUESTION_MESSAGE);
		bStr = JOptionPane.showInputDialog(null, "B =", "Funcao Quadratica", JOptionPane.QUESTION_MESSAGE);
		cStr = JOptionPane.showInputDialog(null, "C =", "Funcao Quadratica", JOptionPane.QUESTION_MESSAGE);
		
		a = Double.valueOf(aStr);
		b = Double.valueOf(bStr);
		c = Double.valueOf(cStr);
		
		delta = Math.pow(b,2)-4*a*c;
		
		if (delta<0) {
			resultado = "A funcao nao possui raizes reais.";
		} else {
			x1 = (-b+Math.sqrt(delta))/(2*a);
			x2 = (-b-Math.sqrt(delta))/(2*a);
			if (delta == 0) {
				resultado = String.format("A funcao possui duas raizes reais e iguais a %.2f", x1);
			} else {
				resultado = String.format("A funcao possui duas raizes reais e distintas iguais a %.2f e %.2f", x1, x2);
			}
		}
		
		JOptionPane.showMessageDialog(null, resultado, "Funcao Quadratica", JOptionPane.INFORMATION_MESSAGE);
	}
}
