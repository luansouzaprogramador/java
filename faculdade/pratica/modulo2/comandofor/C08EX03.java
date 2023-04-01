/*
package faculdade.pratica.modulo2.comandofor;

import java.util.Scanner;

public class C08EX03 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		double notaFinal=0;
		int i, totalFaltas=0, contAprovados=0;
		
		for (i=1; i<=50; i++) {
			System.out.print("Digite o nome do "+i+"° aluno: ");
			nome = teclado.nextLine();
			System.out.print("Digite a nota final de "+nome+": ");
			notaFinal = teclado.nextDouble();
			
			if (notaFinal<0) {
				System.out.println("\nValor inválido!");
				break;
			}
			
			System.out.print("Digite o total de faltas de "+nome+": ");
			totalFaltas = teclado.nextInt();
			
			if (totalFaltas<0) {
				System.out.println("\nValor inválido!");
				break;
			}
			
			if (notaFinal>=65 && totalFaltas<=16) {
				System.out.println("Situação = Aprovado(a)\n");
				contAprovados++;
			}
			else
				System.out.println("Situação = Reprovado(a)\n");
			teclado.nextLine();
		}
		
		if (!(notaFinal<0 || totalFaltas<0)) {
			System.out.println("Situação da Turma"); 
			System.out.println("Quantidade de alunos aprovados: "+contAprovados);
			System.out.println("Quantidade de alunos reprovados: "+(i-contAprovados-1));
		}
		
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;

public class C08EX03 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, notaFinalStr, totalFaltasStr;
		double notaFinal=0;
		int i, totalFaltas=0, contAprovados=0;
		
		for (i=1; i<=50; i++) {
			nome = JOptionPane.showInputDialog(null, "Digite o nome do "+i+"° aluno:", "Informações do Estudante", JOptionPane.QUESTION_MESSAGE);
			
			notaFinalStr = JOptionPane.showInputDialog(null, "Digite a nota final de "+nome+":", "Informações do Estudante", JOptionPane.QUESTION_MESSAGE);
			notaFinal = Double.valueOf(notaFinalStr);
			
			if (notaFinal<0) {
				JOptionPane.showMessageDialog(null, "Valor inválido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			totalFaltasStr = JOptionPane.showInputDialog(null, "Digite o total de faltas de "+nome+":", "Informações do Estudante", JOptionPane.QUESTION_MESSAGE);
			totalFaltas = Integer.valueOf(totalFaltasStr);
			
			if (totalFaltas<0) {
				JOptionPane.showMessageDialog(null, "Valor inválido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			if (notaFinal>=65 && totalFaltas<=16) {
				JOptionPane.showMessageDialog(null, "APROVADO(A)", "Situação", JOptionPane.INFORMATION_MESSAGE);
				contAprovados++;
			}
			else
				JOptionPane.showMessageDialog(null, "REPROVADO(A)", "Situação", JOptionPane.INFORMATION_MESSAGE);
		}
		
		if (!(notaFinal<0 || totalFaltas<0)) {
			JOptionPane.showMessageDialog(null, "Quantidade de alunos aprovados: "+contAprovados+"\n\n"+"Quantidade de alunos reprovados: "+(i-contAprovados-1), "Situação da Turma", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}