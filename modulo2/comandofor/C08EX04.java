/*
package faculdade.pratica.modulo2.comandofor;

import java.util.Scanner;

public class C08EX04 {
	public static void main(String[] args) {
		String nome;
		int i, idade=0, contAcimaDe18=0;
		
		Scanner teclado = new Scanner(System.in);
		
		for (i=1; i<=50; i++) {
			System.out.print("Informe o nome do "+i+"° aluno: ");
			nome = teclado.nextLine();
			System.out.print("Informe a idade de "+nome+": ");
			idade = teclado.nextInt();
			
			if (idade<0) {
				System.out.println("\nValor inválido!");
				break;
			}
			
			if (idade>18)
				contAcimaDe18++;
			teclado.nextLine();
			System.out.println();
		}
		
		if (!(idade<0)) {
			System.out.println("Essa turma tem "+(i-contAcimaDe18-1)+" aluno(s) de até 18 anos e "+contAcimaDe18+" aluno(s) acima de 18 anos.");
		}
		
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;

public class C08EX04 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, idadeStr;
		int i, idade=0, contAcimaDe18=0;
		
		for (i=1; i<=50; i++) {
			nome = JOptionPane.showInputDialog(null, "Informe o nome do "+i+"° aluno:", "Pesquisa", JOptionPane.QUESTION_MESSAGE);
			
			idadeStr = JOptionPane.showInputDialog(null, "Informe a idade de "+nome+":", "Pesquisa", JOptionPane.QUESTION_MESSAGE);
			idade = Integer.valueOf(idadeStr);
			
			if (idade<0) {
				JOptionPane.showMessageDialog(null, "Valor inválido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			if (idade>18)
				contAcimaDe18++;
		}
		
		if (!(idade<0))
			JOptionPane.showMessageDialog(null, "Essa turma tem "+(i-contAcimaDe18-1)+" aluno(s) de até 18 anos e "+contAcimaDe18+" aluno(s) acima de 18 anos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}