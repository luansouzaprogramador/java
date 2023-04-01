package faculdade.pratica.modulo1.comandoswitch;

import java.util.Scanner;

public class C07ex03 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double valorImposto, valorMulta;
		int diasAtraso;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor do imposto: R$");
		valorImposto = teclado.nextDouble();
		System.out.print("Informe o número de dias de atraso: ");
		diasAtraso = teclado.nextInt();
		switch (diasAtraso) {
			case 1: case 2: case 3: case 4: case 5:
				valorMulta = 0;
				break;
			case 6: case 7: case 8:
				valorMulta = 0.02*valorImposto;
				break;
			case 9: case 10:
				valorMulta = 0.1*valorImposto + 0.05*valorImposto*diasAtraso;
				break;
			default:
				valorMulta = 1.5*valorImposto + diasAtraso;
				break;
		}
		System.out.printf("O valor da multa é de: R$%.2"+valorMulta);
		teclado.close();
	}
}