package faculdade.pratica.modulo1.expressoesbooleanas;

import java.util.Scanner;

public class C06ex10 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double capitalAplicado, taxaDiaria, rendimento, impostoRenda, valorResgatado;
		int numeroDias;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Sobre sua aplicação financeira, informe o que se pede.");
		System.out.print("\nQual é o capital aplicado: R$");
		capitalAplicado = teclado.nextDouble();
		System.out.print("Informe o número de dias que o dinheiro ficou aplicado: ");
		numeroDias = teclado.nextInt();
		System.out.print("Digite a taxa de rendimento diária: ");
		taxaDiaria = teclado.nextDouble();
		
		rendimento = capitalAplicado*(taxaDiaria/100)*numeroDias;
		impostoRenda = 0.15*rendimento;
		valorResgatado = capitalAplicado + rendimento - impostoRenda - 10;
		
		System.out.print("\n\nO rendimento sobre o capital de R$"+capitalAplicado+", aplicado a uma taxa diária de "+taxaDiaria+"% por um período de "+numeroDias+" dias, é de R$"+rendimento);
		System.out.printf("\nValor a ser pago de Imposto de Renda: R$%1.2f",impostoRenda);
		System.out.printf("\nQuantia a ser resgatada: R$%1.2f",valorResgatado);
		teclado.close();
	}
}