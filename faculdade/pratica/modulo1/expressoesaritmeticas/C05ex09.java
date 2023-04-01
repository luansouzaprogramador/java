/*
package faculdade.pratica.modulo1.expressoesaritmeticas;

import java.util.Scanner;

public class C05ex09 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		
		System.out.println("----------------------\n Aproveitamento Aluno \n----------------------");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nota 1 = ");
		nota1 = teclado.nextDouble();
		System.out.print("Nota 2 = ");
		nota2 = teclado.nextDouble();
		System.out.print("Nota 3 = ");
		nota3 = teclado.nextDouble();
		media = (nota1*2+nota2*3+nota3*5)/10;
		System.out.printf("\nMédia = %1.1f",media);
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo1.expressoesaritmeticas;

import javax.swing.JOptionPane;

public class C05ex09 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nota1Str, nota2Str, nota3Str;
		double nota1, nota2, nota3, media;
		
		nota1Str = JOptionPane.showInputDialog(null, "Nota 1:", "Aproveitamento Aluno", JOptionPane.QUESTION_MESSAGE);
		nota2Str = JOptionPane.showInputDialog(null, "Nota 2:", "Aproveitamento Aluno", JOptionPane.QUESTION_MESSAGE);
		nota3Str = JOptionPane.showInputDialog(null, "Nota 3:", "Aproveitamento Aluno", JOptionPane.QUESTION_MESSAGE);
		
		nota1 = Double.valueOf(nota1Str);
		nota2 = Double.valueOf(nota2Str);
		nota3 = Double.valueOf(nota3Str);
		media = (nota1*2+nota2*3+nota3*5)/10;
		
		JOptionPane.showMessageDialog(null, String.format("MÉDIA = %1.2f", media), "Aproveitamento Aluno", JOptionPane.INFORMATION_MESSAGE);
	}
}