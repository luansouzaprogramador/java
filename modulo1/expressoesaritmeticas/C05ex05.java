/*
package faculdade.pratica.modulo1.expressoesaritmeticas;

import java.util.Scanner;

public class C05ex05 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double tempCelsius, tempKelvin, tempFahrenheit;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("-------------------------------------\n      Conversor de temperaturas      \n-------------------------------------");
		System.out.print("Informe a temperatura em Celsius (°C): ");
		tempCelsius = teclado.nextDouble();
		tempKelvin = tempCelsius + 273;
		tempFahrenheit = (tempCelsius*9+160)/5;
		System.out.printf("\n%1.1f °C equivale a %1.1f K e %1.1f °F.",tempCelsius, tempKelvin, tempFahrenheit);
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo1.expressoesaritmeticas;

import javax.swing.JOptionPane;

public class C05ex05 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String tempCelsiusStr;
		double tempCelsius, tempKelvin, tempFahrenheit;
		
		tempCelsiusStr = JOptionPane.showInputDialog(null, "Informe a temperatura em Celsius (°C): ", "Conversor de temperaturas", JOptionPane.QUESTION_MESSAGE);
		
		tempCelsius = Double.valueOf(tempCelsiusStr);
		tempKelvin = tempCelsius + 273;
		tempFahrenheit = (tempCelsius*9+160)/5;
		
		JOptionPane.showMessageDialog(null, String.format("%1.1f °C equivale a %1.1f K e %1.1f K e °F.", tempCelsius, tempKelvin, tempFahrenheit), "Conversor de temperaturas", JOptionPane.INFORMATION_MESSAGE);
	}
}