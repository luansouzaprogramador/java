package faculdade.pratica.modulo3.criandoprojetos.projeto1;

import java.util.Locale;
import javax.swing.JOptionPane;

public class IMC {
	public static void CalculaIMC() {
		Locale.setDefault(Locale.US);
		String pesoStr, alturaStr, situacaoCorporal;
		double peso, altura, imc;
		
		JOptionPane.showMessageDialog(null, "O calulo do IMC (Indice de Massa Corporal) e feito com base no peso e na altura de uma pessoa.\nAssim sendo, informe a seguir o peso e a altura de uma pessoa e obtenha o resultado do seu IMC juntamente com sua situacao corporal.", "Calulo de IMC", JOptionPane.INFORMATION_MESSAGE);
		pesoStr = JOptionPane.showInputDialog(null, "Peso =", "Calculo de IMC", JOptionPane.QUESTION_MESSAGE);
		peso = Double.valueOf(pesoStr);
		while (peso<0) {
			pesoStr = JOptionPane.showInputDialog(null, "Valor invalido!\nInforme o peso novamente:", "Calculo de IMC", JOptionPane.QUESTION_MESSAGE);
			peso = Double.valueOf(pesoStr);
		}
		alturaStr = JOptionPane.showInputDialog(null, "Altura =", "Calculo de IMC", JOptionPane.QUESTION_MESSAGE);
		altura = Double.valueOf(alturaStr);
		while (altura<0) {
			alturaStr = JOptionPane.showInputDialog(null, "Valor invalido!\nInforme a altura novamente:", "Calculo de IMC", JOptionPane.QUESTION_MESSAGE);
			altura = Double.valueOf(alturaStr);
		}
		imc = peso/Math.pow(altura, 2);
		
		if (imc<=17) {
			situacaoCorporal = "Muito abaixo do peso";
		} else if (imc<=18.5) {
			situacaoCorporal = "Abaixo do peso";
		} else if (imc<=25) {
			situacaoCorporal = "Peso ideal";
		} else if (imc<=30) {
			situacaoCorporal = "Sobrepeso";
		} else if (imc<=35) {
			situacaoCorporal = "Obesidade";
		} else if (imc<=40) {
			situacaoCorporal = "Obesidade Severa";
		} else {
			situacaoCorporal = "Obesidade Morbida";
		}
		
		JOptionPane.showMessageDialog(null, String.format("IMC = %.2f\n\nSituacao Corporal = %s", imc, situacaoCorporal), "Resultados Obtidos", JOptionPane.INFORMATION_MESSAGE);
	}
}
