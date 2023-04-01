/*
package faculdade.pratica.modulo1.expressoesaritmeticas;

import java.util.Scanner;

public class C05ex01 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double x, y;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Seja a função f(x) = x^3 + 4x + 10.\nInsira um valor para x e obtenha o y correspondente: ");
		x = teclado.nextDouble();
		y = Math.pow(x,3) + 4*x + 10;
		System.out.println("\nf("+x+") = "+y);
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo1.expressoesaritmeticas;

import javax.swing.JOptionPane;

public class C05ex01 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String xStr;
		double x, y;
		
		xStr = JOptionPane.showInputDialog(null, "Seja a função f(x) = x^3 + 4x + 10.\nInsira um valor para x e obtenha o y correspondente: ", "Função do 1° grau", JOptionPane.QUESTION_MESSAGE);
		
		x = Double.valueOf(xStr);
		y = Math.pow(x,3) + 4*x + 10;
		
		JOptionPane.showMessageDialog(null, String.format("f("+x+") = %1.1f", y), "Função Afim", JOptionPane.INFORMATION_MESSAGE);
	}
}