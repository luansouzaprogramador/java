/*
package faculdade.pratica.modulo1.expressoesaritmeticas;

import java.util.Scanner;

public class C05ex10 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número inteiro de 5 algarismos: ");
		numero = teclado.nextInt();
		System.out.println("\n"+numero/10000+"\n"+numero/1000%10+"\n"+numero/100%10+"\n"+numero/10%10+"\n"+numero%10);
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo1.expressoesaritmeticas;

import javax.swing.JOptionPane;

public class C05ex10 {
	// Autor: Luan Marcelino de Souza;
	public static void main(String[] args) {
		String numeroStr;
		int numero, n1, n2, n3, n4, n5;
		
		numeroStr = JOptionPane.showInputDialog(null, "Informe um número inteiro de 5 algarismos: ", "Decomposição Numérica", JOptionPane.QUESTION_MESSAGE);
		numero = Integer.valueOf(numeroStr);
		
		n1 = numero/10000;
		n2 = numero/1000%10;
		n3 = numero/100%10;
		n4 = numero/10%10;
		n5 = numero%10;
		
		JOptionPane.showMessageDialog(null, n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n5, "Decomosição Numérica", JOptionPane.INFORMATION_MESSAGE);
	}
}