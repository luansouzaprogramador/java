/*
package faculdade.pratica.modulo1.expressoesbooleanas;

import java.util.Scanner;

public class C06ex04 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, situacaoCorporal;
		double altura, peso, imc;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cálculo de IMC");
		System.out.print("Informe seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Informe sua altura, em metros: ");
		altura = teclado.nextDouble();
		System.out.print("Informe seu peso, em kg: ");
		peso = teclado.nextDouble();
		imc = peso/Math.pow(altura,2);
		
		if (imc < 18) {
			situacaoCorporal = "está desnutrido(a).";
		} else if (imc < 20) {
			situacaoCorporal = "está abaixo do peso.";
		} else if (imc <= 25) {
			situacaoCorporal = "está no peso ideal.";
		} else if (imc <= 27) {
			situacaoCorporal = "está acima do peso.";
		} else {
			situacaoCorporal = "está obeso(a).";
		}
		
		System.out.println("\n"+nome+", você "+situacaoCorporal);
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo1.expressoesbooleanas;

import javax.swing.JOptionPane;

public class C06ex04 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, alturaStr, pesoStr, situacaoCorporal;
		double altura, peso, imc;
		
		nome = JOptionPane.showInputDialog(null, "Informe seu nome:", "Cálculo de IMC", JOptionPane.QUESTION_MESSAGE);
		alturaStr = JOptionPane.showInputDialog(null, "Informe sua altura, em metros:", "Cálculo de IMC", JOptionPane.QUESTION_MESSAGE);
		altura = Double.valueOf(alturaStr);
		pesoStr = JOptionPane.showInputDialog(null, "Informe seu peso, em kg:", "Cálculo de IMC", JOptionPane.QUESTION_MESSAGE);
		peso = Double.valueOf(pesoStr);
		
		imc = peso/Math.pow(altura,2);
		
		if (imc < 18) {
			situacaoCorporal = "está desnutrido(a).";
		} else if (imc < 20) {
			situacaoCorporal = "está abaixo do peso.";
		} else if (imc <= 25) {
			situacaoCorporal = "está no peso ideal.";
		} else if (imc <= 27) {
			situacaoCorporal = "está acima do peso.";
		} else {
			situacaoCorporal = "está obeso(a).";
		}
		
		JOptionPane.showMessageDialog(null, nome+", você "+situacaoCorporal, "Cálculo de IMC", JOptionPane.INFORMATION_MESSAGE);
	}
}