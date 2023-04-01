/*
package faculdade.pratica.modulo2.comandofor;

import java.util.Scanner;

public class C08EX01 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double raio, area;
		
		for (int i=1; i<=10; i++) {
			System.out.print("Entre com o valor do raio de uma circunferência e obtenha sua área: ");
			raio = teclado.nextDouble();
			if (raio<0) {
				System.out.println("\nValor inválido!");
				break;
			}
			
			area = Math.PI*Math.pow(raio, 2);
			System.out.printf("Área = %1.2f\n\n", area);
		}
		
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;

public class C08EX01 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String raioStr;
		double raio, area;
		
		for (int i=1; i<=10; i++) {
			raioStr = JOptionPane.showInputDialog(null, "Entre com o valor do raio de uma circunferência e obtenha sua área:", "Geometria", JOptionPane.QUESTION_MESSAGE);
			raio = Double.valueOf(raioStr);
			if (raio<0) {
				JOptionPane.showMessageDialog(null, "Valor inválido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			area = Math.PI*Math.pow(raio, 2);
			JOptionPane.showMessageDialog(null, String.format("Área = %1.2f", area), "Geometria", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}