/*
package faculdade.pratica.modulo1.expressoesaritmeticas;

import java.util.Scanner;

public class C05ex07 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double x, y;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Seja a função f(x) = ((x/4+1)^2 + x/5)^(1/2).\nInsira um valor para x e obtenha o y correspondente: ");
		x = teclado.nextDouble();
		y = Math.sqrt(Math.pow((x/4+1),2) + x/5);
		System.out.printf("\nf(%s) = %1.2f", x, y);
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo1.expressoesaritmeticas;

import javax.swing.JOptionPane;

public class C05ex07 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String xStr;
		double x, y;
		
		xStr = JOptionPane.showInputDialog(null, "Seja a função f(x) = ((x/4+1)^2 + x/5)^(1/2).\nInsira um valor para x e obtenha o y correspondente: ", "Função do 1° grau", JOptionPane.QUESTION_MESSAGE);
		
		x = Double.valueOf(xStr);
		y = Math.sqrt(Math.pow((x/4+1),2) + x/5);
		
		JOptionPane.showMessageDialog(null, String.format("f("+x+") = %1.2f", y), "Função Afim", JOptionPane.INFORMATION_MESSAGE);
	}
}