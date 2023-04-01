/*
package faculdade.pratica.modulo1.expressoesbooleanas;

import java.util.Scanner;

public class C06ex03 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double valorVendas, salario;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor mensal das vendas do funcionário: ");
		valorVendas = teclado.nextDouble();
		
		if (valorVendas <= 1000) {
			salario = 240;
		} else if (valorVendas <= 10000) {
			salario = 240+0.1*valorVendas;
		} else {
			salario = 1240;
		}
		
		System.out.printf("\nO salário do vendedor será de R$%1.2f",salario);
	}
}
*/
package faculdade.pratica.modulo1.expressoesbooleanas;

import javax.swing.JOptionPane;

public class C06ex03 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String valorVendasStr;
		double valorVendas, salario;
		
		valorVendasStr = JOptionPane.showInputDialog(null, "Informe o valor mensal das vendas do funcionário:", "Setor Financeiro", JOptionPane.QUESTION_MESSAGE);
		valorVendas = Double.valueOf(valorVendasStr);
		
		if (valorVendas <= 1000) {
			salario = 240;
		} else if (valorVendas <= 10000) {
			salario = 240+0.1*valorVendas;
		} else {
			salario = 1240;
		}
		
		JOptionPane.showMessageDialog(null, String.format("O salário do vendedor será de R$%1.2f", salario), "Setor Financeiro", JOptionPane.INFORMATION_MESSAGE);
	}
}