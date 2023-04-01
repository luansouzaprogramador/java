package faculdade.pratica.modulo3.modularizacao;

import java.util.Scanner;

public class C13EX05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double angulo;
		
		System.out.print("Informe a medida de um angulo em graus: ");
		angulo = teclado.nextDouble();
		
		System.out.println("\nSeno de "+angulo+" graus = "+seno(angulo));
		System.out.println("\nCossseno de "+angulo+" graus = "+cosseno(angulo));
		System.out.println("\nTangente de "+angulo+" graus = "+tangente(angulo));
		System.out.println("\nArco seno de "+angulo+" graus = "+ArcoSeno(angulo));
		System.out.println("\nArco cosseno de "+angulo+" graus = "+ArcoCosseno(angulo));
		System.out.println("\nArco tangente de "+angulo+" graus = "+ArcoTangente(angulo));
		
		teclado.close();
	}
	
	static double seno (double angulo) {
		return Math.sin(Math.toRadians(angulo));
	}
	
	static double cosseno (double angulo) {
		return Math.cos(Math.toRadians(angulo));
	}
	
	static double tangente (double angulo) {
		return Math.tan(Math.toRadians(angulo));
	}
	
	static double ArcoSeno (double angulo) {
		return 1/seno(angulo);
	}
	
	static double ArcoCosseno (double angulo) {
		return 1/cosseno(angulo);
	}
	
	static double ArcoTangente (double angulo) {
		return 1/tangente(angulo);
	}
}
