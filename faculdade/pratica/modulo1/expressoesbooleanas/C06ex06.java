/*
package faculdade.pratica.modulo1.expressoesbooleanas;

import java.util.Scanner;

public class C06ex06 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double a, b, c, delta, x1, x2;
		String resultado;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Em relação a função quadrática f(x) = ax^2 + bx + c, informe os valores de seus coeficientes:");
		System.out.print("A = ");
		a = teclado.nextDouble();
		System.out.print("B = ");
		b = teclado.nextDouble();
		System.out.print("C = ");
		c = teclado.nextDouble();
		delta = Math.pow(b,2)-4*a*c;
		System.out.println();
		
		if (delta<0) {
			resultado = "A função não possui raízes reais.";
		} else {
			x1 = (-b+Math.sqrt(delta))/(2*a);
			x2 = (-b-Math.sqrt(delta))/(2*a);
			if (delta == 0) {
				resultado = "A função possui duas raízes reais e iguais a "+x1;
			} else {
				resultado = "A função possui duas raízes reais e distintas iguais a "+x1+" e "+x2;
			}
		}
		System.out.println(resultado);
	}
}
*/
package faculdade.pratica.modulo1.expressoesbooleanas;

import javax.swing.JOptionPane;

public class C06ex06 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String aStr, bStr, cStr, resultado;
		double a, b, c, delta, x1, x2;
		
		JOptionPane.showMessageDialog(null, "Em relação a função quadrática f(x) = ax^2 + bx + c, informe os valores de seus coeficientes.", "Função Quadrática", JOptionPane.INFORMATION_MESSAGE);
		
		aStr = JOptionPane.showInputDialog(null, "A =", "Função Quadrática", JOptionPane.QUESTION_MESSAGE);
		bStr = JOptionPane.showInputDialog(null, "B =", "Função Quadrática", JOptionPane.QUESTION_MESSAGE);
		cStr = JOptionPane.showInputDialog(null, "C =", "Função Quadrática", JOptionPane.QUESTION_MESSAGE);
		
		a = Double.valueOf(aStr);
		b = Double.valueOf(bStr);
		c = Double.valueOf(cStr);
		
		delta = Math.pow(b,2)-4*a*c;
		
		if (delta<0) {
			resultado = "A função não possui raízes reais.";
		} else {
			x1 = (-b+Math.sqrt(delta))/(2*a);
			x2 = (-b-Math.sqrt(delta))/(2*a);
			if (delta == 0) {
				resultado = String.format("A função possui duas raízes reais e iguais a %1.2f", x1);
			} else {
				resultado = String.format("A função possui duas raízes reais e distintas iguais a %1.2f e %1.2f", x1, x2);
			}
		}
		
		JOptionPane.showMessageDialog(null, resultado, "Função Quadrática", JOptionPane.INFORMATION_MESSAGE);
	}
}