package faculdade.pratica.modulo1.expressoesbooleanas;

import java.util.Scanner;

public class C06ex07 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome;
		double salario, valorFixo, percentualSalario, plBruto, impostoRenda, plLiquido;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Distribuição dos lucros da empresa");
		System.out.print("\nInforme o nome do funcionário: ");
		nome = teclado.nextLine();
		System.out.print("Informe o valor do seu salário: R$");
		salario = teclado.nextDouble();
		
		if (salario<=300) {
			valorFixo = 500;
			percentualSalario = 0.7*salario;
		} else if (salario<=1000) {
			valorFixo = 200;
			percentualSalario = 0.5*salario;
		} else {
			valorFixo = 0;
			percentualSalario = 0.3*salario;
		}
		
		plBruto = valorFixo+percentualSalario;
		impostoRenda = 0.25*plBruto;
		plLiquido = plBruto-impostoRenda;
		
		System.out.printf("\nO funcionário, %s, tem R$%1.2f de participação nos lucros da empresa.", nome, plLiquido);
		teclado.close();
	}
}