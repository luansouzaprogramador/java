/*
package faculdade.pratica.modulo2.comandofor;

import java.util.Scanner;

public class C08EX06 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int numero, somaDivisiveisPor4=0, quantDivisiveisPor3=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe abaixo 10 números inteiros.\n");
		for (int i=1; i<=10; i++) {
			System.out.print("Digite o "+i+"° número: ");
			numero = teclado.nextInt();
			if (numero%2 == 0)
				System.out.println("O número informado é PAR.");
			else
				System.out.println("O número informado é ÍMPAR.");
			System.out.println();
			
			if (numero%4 == 0)
				somaDivisiveisPor4 += numero;
			if (numero%3 == 0)
				quantDivisiveisPor3 +=1;
		}
		
		System.out.println("\nSoma dos números divisíveis por 4 = "+somaDivisiveisPor4);
		System.out.println("Quantidade de números divisíveis por 3 = "+quantDivisiveisPor3);
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;

public class C08EX06 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String numeroStr;
		int numero, somaDivisiveisPor4=0, quantDivisiveisPor3=0;
		
		JOptionPane.showMessageDialog(null, "Informe a seguir 10 números inteiros.", "Programa", JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=1; i<=10; i++) {
			numeroStr = JOptionPane.showInputDialog(null, "Digite o "+i+"° número:", "Programa", JOptionPane.QUESTION_MESSAGE);
			numero = Integer.valueOf(numeroStr);
			
			if (numero%2 == 0)
				JOptionPane.showMessageDialog(null, "O número informado é PAR.", "Programa", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "O número informado é ÍMPAR.", "Programa", JOptionPane.INFORMATION_MESSAGE);
			
			if (numero%4 == 0)
				somaDivisiveisPor4 += numero;
			if (numero%3 == 0)
				quantDivisiveisPor3 +=1;
		}
		
		JOptionPane.showMessageDialog(null, "Soma dos números divisíveis por 4 = "+somaDivisiveisPor4+"\n\nQuantidade de números divisíveis por 3 = "+quantDivisiveisPor3, "Programa", JOptionPane.INFORMATION_MESSAGE);
	}
}