package faculdade.pratica.modulo3.modularizacao;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class C13EX01 {
	static double distancia;
	static double x1, y1, x2, y2;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		// double x1, y1, x2, y2;
		
		System.out.println("Informe a seguir os valores das coordenadas de dois pontos do plano cartesiano.\n");
		System.out.print("X1 = ");
		x1 = teclado.nextDouble();
		System.out.print("Y1 = ");
		y1 = teclado.nextDouble();
		System.out.print("X2 = ");
		x2 = teclado.nextDouble();
		System.out.print("Y2 = ");
		y2 = teclado.nextDouble();
		
		funcao();
		System.out.println("\nDistancia = "+new DecimalFormat("#0.0000").format(distancia));
		
		// System.out.println("\nDistancia = "+new DecimalFormat("#0.0000").format(funcao(x1, x2, y1, y2)));
		teclado.close();
	}
	
	// Metodo sem parametro
	static void funcao () {
		distancia = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
	}
	
	/*
	// Metodo com parametro
	static double funcao (double x1, double x2, double y1, double y2) {
		return Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
	}
	*/
}
