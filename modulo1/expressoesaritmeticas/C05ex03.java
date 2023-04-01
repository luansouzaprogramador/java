/*
package faculdade.pratica.modulo1.expressoesaritmeticas;

import java.util.Scanner;

public class C05ex03 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double salario, salarioLiquido, impostoRenda;
		int numeroDependentes;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----------------------\n    RECEITA FEDERAL    \n-----------------------");
		System.out.print("Informe o valor do seu salário: R$");
		salario = teclado.nextDouble();
		System.out.print("Informe o número de dependentes: ");
		numeroDependentes = teclado.nextInt();
		salarioLiquido = salario - numeroDependentes*60;
		impostoRenda = 0.15*salarioLiquido;
		System.out.printf("\nO valor a ser retido referente ao seu Imposto de Renda é de R$%1.2f.",impostoRenda);
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo1.expressoesaritmeticas;

import javax.swing.JOptionPane;

public class C05ex03 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String salarioStr, numeroDependentesStr;
		double salario, salarioLiquido, impostoRenda;
		int numeroDependentes;
		
		salarioStr = JOptionPane.showInputDialog(null, "Informe o valor do seu salário: R$", "Receita Federal", JOptionPane.QUESTION_MESSAGE);
		numeroDependentesStr = JOptionPane.showInputDialog(null, "Informe o número de dependentes: ", "Receira Federal", JOptionPane.QUESTION_MESSAGE);
		
		salario = Double.valueOf(salarioStr);
		numeroDependentes = Integer.valueOf(numeroDependentesStr);
		salarioLiquido = salario - numeroDependentes*60;
		impostoRenda = 0.15*salarioLiquido;
		
		JOptionPane.showMessageDialog(null, String.format("O valor a ser retido referente ao seu Imposto de Renda é de R$%1.2f", impostoRenda), "Receita Federal", JOptionPane.INFORMATION_MESSAGE);
	}
}