/*
package faculdade.pratica.modulo1.expressoesaritmeticas;

import java.util.Scanner;

public class C05ex11 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		long numeroCheque;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o número do cheque: ");
		numeroCheque = teclado.nextLong();
		System.out.println("\nInformações Bancárias");
		System.out.println("Banco      = "+numeroCheque/1000000);
		System.out.println("Agência    = "+numeroCheque%1000000/1000);
		System.out.println("Sequencial = "+numeroCheque%1000);
	}
}
*/
package faculdade.pratica.modulo1.expressoesaritmeticas;

import javax.swing.JOptionPane;

public class C05ex11 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String numeroChequeStr;
		int numeroCheque, banco, agencia, sequencial;
		
		numeroChequeStr = JOptionPane.showInputDialog(null, "Informe o número do cheque:", "Cheque Bancário", JOptionPane.QUESTION_MESSAGE);
		numeroCheque = Integer.valueOf(numeroChequeStr);
		
		banco = numeroCheque/1000000;
		agencia = numeroCheque%1000000/1000;
		sequencial = numeroCheque%1000;
		
		JOptionPane.showMessageDialog(null, "Banco          =  "+banco+"\nAgência       =  "+agencia+"\nSequencial =  "+sequencial, "Informações Bancárias", JOptionPane.INFORMATION_MESSAGE);
	}
}