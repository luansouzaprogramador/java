/*
package faculdade.pratica.modulo1.expressoesbooleanas;

import java.util.Scanner;

public class C06ex05 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int numero;
		String resultado;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número inteiro: ");
		numero = teclado.nextInt();
		System.out.println();
		
		if (numero%5==0 && numero%7==0) {
			resultado = " é ";
		} else {
			resultado = " não é ";
		}
		
		System.out.println(numero+resultado+"divisível por 5 e 7 simultaneamente.");
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo1.expressoesbooleanas;

import javax.swing.JOptionPane;

public class C06ex05 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String numeroStr, resultado;
		int numero;
		
		numeroStr = JOptionPane.showInputDialog(null, "Informe um número inteiro:", "Verificador", JOptionPane.QUESTION_MESSAGE);
		numero = Integer.valueOf(numeroStr);
		
		if (numero%5==0 && numero%7==0) {
			resultado = " é ";
		} else {
			resultado = " não é ";
		}
		
		JOptionPane.showMessageDialog(null, numero+resultado+"divisível por 5 e 7 simultaneamente.", "Verificador", JOptionPane.INFORMATION_MESSAGE);
	}
}