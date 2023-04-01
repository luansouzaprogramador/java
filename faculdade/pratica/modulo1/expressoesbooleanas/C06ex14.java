/*
package faculdade.pratica.modulo1.expressoesbooleanas;

import java.util.Scanner;

public class C06ex14 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número inteiro de 4 algarismos: ");
		numero = teclado.nextInt();
		System.out.println();
		
		if (numero/1000 >= 1 && numero/1000 < 10) {
			System.out.println("O número "+numero+" de trás para frente é "+numero%10+numero%100/10+numero%1000/10/10+numero/1000+".");
		} else {
			System.out.println("O número informado deve ter 4 dígitos.");
		}
	}
}
*/
package faculdade.pratica.modulo1.expressoesbooleanas;

import javax.swing.JOptionPane;

public class C06ex14 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String numeroStr;
		int numero;
		
		numeroStr = JOptionPane.showInputDialog(null, "Informe um número inteiro de 4 algarismos:", "Preencha o campo abaixo", JOptionPane.QUESTION_MESSAGE);
		numero = Integer.valueOf(numeroStr);
		
		if (numero/1000 >= 1 && numero/1000 < 10) {
			JOptionPane.showMessageDialog(null, "O número "+numero+" de trás para frente é "+numero%10+numero%100/10+numero%1000/10/10+numero/1000+".", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "O número informado deve ter 4 dígitos.", "Erro", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}