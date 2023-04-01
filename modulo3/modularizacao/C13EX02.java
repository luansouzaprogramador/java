package faculdade.pratica.modulo3.modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class C13EX02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		double x;
		
		do {
			System.out.print("Informe o valor de X (digite -1 para encerrar): ");
			x = teclado.nextDouble();
			if (x!=-1) {
				System.out.printf("f("+x+") = %.4f\n\n", funcao(x));
			}
		} while (x!=-1);
		
		System.out.println("Fim do programa!");
		teclado.close();
	}
	
	static double funcao (double x) {
		double y;
		if (x<4) {
			y = (5*x+3)/Math.sqrt(16-Math.pow(x, 2));
		} else if (x==4) {
			y=0;
		} else {
			y = (5*x+3)/Math.sqrt(Math.pow(x, 2)-16);
		}
		return y;
	}
}
