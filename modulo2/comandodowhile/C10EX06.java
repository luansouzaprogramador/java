package faculdade.pratica.modulo2.comandodowhile;

import javax.swing.JOptionPane;

public class C10EX06 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String aStr, bStr, cStr, xStr, yStr, tema="Plano Cartesiano";
		double a, b, c, x, y, distancia;
		
		JOptionPane.showMessageDialog(null, "Tendo como base as fórmulas abaixo, o programa será interrompido quando se achar "+
				"um ponto P que coincida com a reta R.\n\nR = Ax + By + C\nP(X, Y)\nDistância = (Ax + By + C) / sqrt(A^2 + B^2)"+
				"\n\nInforme a seguir os valores de A, B e C de uma reta R.\n\n", tema, JOptionPane.INFORMATION_MESSAGE);
		aStr = JOptionPane.showInputDialog(null, "A =", tema, JOptionPane.QUESTION_MESSAGE);
		a = Double.valueOf(aStr);
		bStr = JOptionPane.showInputDialog(null, "B =", tema, JOptionPane.QUESTION_MESSAGE);
		b = Double.valueOf(bStr);
		cStr = JOptionPane.showInputDialog(null, "C =", tema, JOptionPane.QUESTION_MESSAGE);
		c = Double.valueOf(cStr);
		
		do {
			JOptionPane.showMessageDialog(null, "A seguir, informe as coordenadas X e Y de vários pontos P quaisquer.", tema, JOptionPane.INFORMATION_MESSAGE);
			xStr = JOptionPane.showInputDialog(null, "X =", tema, JOptionPane.QUESTION_MESSAGE);
			x = Double.valueOf(xStr);
			yStr = JOptionPane.showInputDialog(null, "Y =", tema, JOptionPane.QUESTION_MESSAGE);
			y = Double.valueOf(yStr);
			distancia = (a*x + b*y + c) / (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
			if (distancia!=0)
				JOptionPane.showMessageDialog(null, String.format("Distância = %.5f\n\n", distancia), "Resultados", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, String.format("Distância = %.0f\n\n", distancia)+"Valor do ponto coincidente com a reta = P ("+x+", "+y+")", "Resultados", JOptionPane.INFORMATION_MESSAGE);
		} while (distancia!=0);
	}
}
