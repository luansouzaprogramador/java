/*
package faculdade.pratica.modulo1.expressoesaritmeticas;

import java.util.Scanner;

public class C05ex02 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double raio, area, volume;
		
		Scanner teclado =  new Scanner(System.in);
		System.out.print("Informe o raio de uma esfera e obtenha sua ·rea e volume: ");
		
		raio = teclado.nextDouble();
		area = 4*Math.PI*Math.pow(raio,2);
		volume = 4*Math.PI*Math.pow(raio,3)/3;
		
		System.out.println("\n¡rea = "+area+"\nVolume = "+volume);
	}
}
*/
package faculdade.pratica.modulo1.expressoesaritmeticas;

import javax.swing.JOptionPane;

public class C05ex02 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String raioStr;
		double raio, area, volume;
		
		raioStr = JOptionPane.showInputDialog(null, "Informe o raio de uma esfera e obtenha sua ·rea e volume:", "Geometria", JOptionPane.QUESTION_MESSAGE);
		
		raio = Double.valueOf(raioStr);
		area = 4*Math.PI*Math.pow(raio,2);
		volume = 4*Math.PI*Math.pow(raio,3)/3;
		
		JOptionPane.showMessageDialog(null, String.format("¡rea = %1.1f\nVolume = %1.1f", area, volume), "Geometria", JOptionPane.INFORMATION_MESSAGE);
	}
}