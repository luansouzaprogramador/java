package faculdade.pratica.modulo1.dadosevariaveis;

import java.util.Scanner;

public class CalculaHipotenusa {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double cateto1, cateto2, hipotenusa;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor do cateto 1: ");
		cateto1 = teclado.nextDouble();
		System.out.print("Informe o valor do cateto 2: ");
		cateto2 = teclado.nextDouble();
		hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
		System.out.print("O valor da hipotenusa é igual a "+hipotenusa);
		teclado.close();
	}
}