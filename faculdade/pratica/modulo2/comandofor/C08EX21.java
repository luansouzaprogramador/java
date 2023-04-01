package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;

public class C08EX21 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String alturaStr, situacaoCorporea;
		double altura, imc, peso;
		
		alturaStr = JOptionPane.showInputDialog(null, "Informe sua altura, em metros:", "Cálculo de IMC", JOptionPane.QUESTION_MESSAGE);
		altura = Double.valueOf(alturaStr);
		
		System.out.println("Peso       IMC       Situação Corpórea\n");
		for (peso=60; peso<=100; peso++) {
			imc = peso/Math.pow(altura, 2);
			if (imc<20) {
				situacaoCorporea = "Abaixo do peso";
			} else if (imc<=25) {
				situacaoCorporea = "Peso Ideal";
			} else {
				situacaoCorporea = "Acima do peso";
			}
			System.out.println(peso+String.format("       %1.2f      %s", imc, situacaoCorporea));
		}
	}
}