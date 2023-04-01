/*
package faculdade.pratica.modulo1.expressoesaritmeticas;

import java.util.Scanner;

public class C05ex06 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double a, b, c, x, y, reta, distancia;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para encontrar a distância entre um ponto e uma reta, informe o que se pede.");
		System.out.println("Sobre a reta");
		System.out.print("O valor de A = ");
		a = teclado.nextDouble();
		System.out.print("O valor de B = ");
		b = teclado.nextDouble();
		System.out.print("O valor de C = ");
		c = teclado.nextDouble();
		System.out.println("\nSobre as coordenadas do ponto");
		System.out.print("O valor de X = ");
		x = teclado.nextDouble();
		System.out.print("O valor de Y = ");
		y = teclado.nextDouble();
		reta = a*x + b*y + c;
		distancia = reta/(Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)));
		System.out.printf("\nDistância = %1.2f",distancia);
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo1.expressoesaritmeticas;

import javax.swing.JOptionPane;

public class C05ex06 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String aStr, bStr, cStr, xStr, yStr;
		double a, b, c, x, y, reta, distancia;
		
		JOptionPane.showMessageDialog(null, "Para encontrar a distância entre um ponto e uma reta, informe o que se pede.", "Distância", JOptionPane.INFORMATION_MESSAGE);
		
		aStr = JOptionPane.showInputDialog(null, "O valor de A = ", "Sobre a reta", JOptionPane.QUESTION_MESSAGE);
		bStr = JOptionPane.showInputDialog(null, "O valor de B = ", "Sobre a reta", JOptionPane.QUESTION_MESSAGE);
		cStr = JOptionPane.showInputDialog(null, "O valor de C = ", "Sobre a reta", JOptionPane.QUESTION_MESSAGE);
		xStr = JOptionPane.showInputDialog(null, "O valor de X = ", "Sobre as coordenadas do ponto", JOptionPane.QUESTION_MESSAGE);
		yStr = JOptionPane.showInputDialog(null, "O valor de Y = ", "Sobre as coordenadas do ponto", JOptionPane.QUESTION_MESSAGE);
		
		a = Double.valueOf(aStr);
		b = Double.valueOf(bStr);
		c = Double.valueOf(cStr);
		x = Double.valueOf(xStr);
		y = Double.valueOf(yStr);
		reta = a*x + b*y + c;
		distancia = reta/(Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)));
		
		JOptionPane.showMessageDialog(null, String.format("Distância = %1.1f", distancia), "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}