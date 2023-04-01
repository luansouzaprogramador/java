/*
package faculdade.pratica.modulo1.expressoesbooleanas;

import java.util.Scanner;

public class C06ex16 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, resultadoFinal;
		int idade, faltas;
		double nota1, nota2, nota3, trabalhoFinal, peso1, peso2, notaFinal;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escola de Línguas");
		System.out.print("\nInforme o nome completo do(a) aluno(a): ");
		nome = teclado.nextLine();
		System.out.print("Informe a idade: ");
		idade = teclado.nextInt();
		System.out.print("Informe o número de faltas: ");
		faltas = teclado.nextInt();
		System.out.print("Informe a nota da primeira prova: ");
		nota1 = teclado.nextDouble();
		System.out.print("Informe a nota da segunda prova: ");
		nota2 = teclado.nextDouble();
		System.out.print("Informe a nota da terceira prova: ");
		nota3 = teclado.nextDouble();
		System.out.print("Informe a nota do trabalho final: ");
		trabalhoFinal = teclado.nextDouble();
		
		if (faltas<=5) {
			peso1 = 3;
		} else if (faltas<=10) {
			peso1 = 2;
		} else {
			peso1 = 1;
		}
		
		if (idade<=17) {
			peso2 = 1;
		} else if (idade<=50) {
			peso2 = 2;
		} else {
			peso2 = 3;
		}
		
		if (nota1+nota2>nota3) {
			notaFinal = (nota1+nota2)/2*peso1+trabalhoFinal*peso2;
		} else if (nota1+nota3>nota2) {
			notaFinal = (nota1+nota3)/2*peso1+trabalhoFinal*peso2;
		} else {
			notaFinal = (nota2+nota3)/2*peso1+trabalhoFinal*peso2;
		}
		
		if (notaFinal<=50) {
			resultadoFinal = "Reprovado";
		} else if (notaFinal<=70) {
			resultadoFinal = "Regular";
		} else if (notaFinal<=80) {
			resultadoFinal = "Bom";
		} else if (notaFinal<=90) {
			resultadoFinal = "Muito Bom";
		} else {
			resultadoFinal = "Excelente";
		}
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Aluno(a):         "+nome+"\nNota Final:       "+notaFinal+"\nResultado Final:  "+resultadoFinal);
	}
}
*/
package faculdade.pratica.modulo1.expressoesbooleanas;

import javax.swing.JOptionPane;

public class C06ex16 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, idadeStr, faltasStr, nota1Str, nota2Str, nota3Str, trabalhoFinalStr, resultadoFinal;
		int idade, faltas;
		double nota1, nota2, nota3, trabalhoFinal, peso1, peso2, notaFinal;
		
		nome = JOptionPane.showInputDialog(null, "Informe o nome completo do(a) aluno(a):", "Escola de Línguas", JOptionPane.QUESTION_MESSAGE);
		idadeStr = JOptionPane.showInputDialog(null, "Informe a idade:", "Escola de Línguas", JOptionPane.QUESTION_MESSAGE);
		faltasStr = JOptionPane.showInputDialog(null, "Informe o número de faltas:", "Escola de Línguas", JOptionPane.QUESTION_MESSAGE);
		nota1Str = JOptionPane.showInputDialog(null, "Informe a nota da primeira prova:", "Escola de Línguas", JOptionPane.QUESTION_MESSAGE);
		nota2Str = JOptionPane.showInputDialog(null, "Informe a nota da segunda prova:", "Escola de Línguas", JOptionPane.QUESTION_MESSAGE);
		nota3Str = JOptionPane.showInputDialog(null, "Informe a nota da terceira prova:", "Escola de Línguas", JOptionPane.QUESTION_MESSAGE);
		trabalhoFinalStr = JOptionPane.showInputDialog(null, "Informe a nota do trabalho final:", "Escola de Línguas", JOptionPane.QUESTION_MESSAGE);
		
		idade = Integer.valueOf(idadeStr);
		faltas = Integer.valueOf(faltasStr);
		nota1 = Double.valueOf(nota1Str);
		nota2 = Double.valueOf(nota2Str);
		nota3 = Double.valueOf(nota3Str);
		trabalhoFinal = Double.valueOf(trabalhoFinalStr);
		
		if (faltas<=5) {
			peso1 = 3;
		} else if (faltas<=10) {
			peso1 = 2;
		} else {
			peso1 = 1;
		}
		
		if (idade<=17) {
			peso2 = 1;
		} else if (idade<=50) {
			peso2 = 2;
		} else {
			peso2 = 3;
		}
		
		if (nota1+nota2>nota3) {
			notaFinal = (nota1+nota2)/2*peso1+trabalhoFinal*peso2;
		} else if (nota1+nota3>nota2) {
			notaFinal = (nota1+nota3)/2*peso1+trabalhoFinal*peso2;
		} else {
			notaFinal = (nota2+nota3)/2*peso1+trabalhoFinal*peso2;
		}
		
		if (notaFinal<=50) {
			resultadoFinal = "Reprovado";
		} else if (notaFinal<=70) {
			resultadoFinal = "Regular";
		} else if (notaFinal<=80) {
			resultadoFinal = "Bom";
		} else if (notaFinal<=90) {
			resultadoFinal = "Muito Bom";
		} else {
			resultadoFinal = "Excelente";
		}
		
		JOptionPane.showMessageDialog(null, "Aluno(a):               "+nome+"\nNota Final:            "+notaFinal+"\nResultado Final:  "+resultadoFinal, "Escola de Línguas", JOptionPane.INFORMATION_MESSAGE);
	}
}