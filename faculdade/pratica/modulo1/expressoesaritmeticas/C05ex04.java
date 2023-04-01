/*
package faculdade.pratica.modulo1.expressoesaritmeticas;

import java.util.Scanner;

public class C05ex04 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double x1, y1, x2, y2, distancia;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe as coordenadas X e Y de dois pontos no plano cartesiano e saiba a distância entre eles.");
		System.out.println("1° ponto");
		System.out.print("X: ");
		x1 = teclado.nextDouble();
		System.out.print("Y: ");
		y1 = teclado.nextDouble();
		System.out.println();
		System.out.println("2° ponto");
		System.out.print("X: ");
		x2 = teclado.nextDouble();
		System.out.print("Y: ");
		y2 = teclado.nextDouble();
		distancia = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
		System.out.printf("\nA distância entre os pontos informados é %1.2f",distancia);
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo1.expressoesaritmeticas;

import javax.swing.JOptionPane;

public class C05ex04 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String x1Str, y1Str, x2Str, y2Str;
		double x1, y1, x2, y2, distancia;
		
		JOptionPane.showMessageDialog(null, "Informe as coordenadas X e Y de dois pontos no plano cartesiano e saiba a distância entre eles.", "Plano Cartesiano", JOptionPane.INFORMATION_MESSAGE);
		
		x1Str = JOptionPane.showInputDialog(null, "X: ", "1° ponto", JOptionPane.QUESTION_MESSAGE);
		y1Str = JOptionPane.showInputDialog(null, "Y: ", "1° ponto", JOptionPane.QUESTION_MESSAGE);
		x2Str = JOptionPane.showInputDialog(null, "X: ", "2° ponto", JOptionPane.QUESTION_MESSAGE);
		y2Str = JOptionPane.showInputDialog(null, "Y: ", "2° ponto", JOptionPane.QUESTION_MESSAGE);
		
		x1 = Double.valueOf(x1Str);
		y1 = Double.valueOf(y1Str);
		x2 = Double.valueOf(x2Str);
		y2 = Double.valueOf(y2Str);
		distancia = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
		
		JOptionPane.showMessageDialog(null, String.format("A distância entre os pontos informados é %1.1f", distancia), "Plano Cartesiano", JOptionPane.INFORMATION_MESSAGE);
	}
}