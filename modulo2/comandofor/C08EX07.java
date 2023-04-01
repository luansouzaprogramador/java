/*
package faculdade.pratica.modulo2.comandofor;

import java.util.Scanner;

public class C08EX07 {
	public static void main(String[] args) {
		String nome;
		int i, idade=0, alunosAte12=0, alunosAcima30=0, soma=0;
		double media;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nome e a idade de 50 alunos de uma turma.\n");
		
		for (i=1; i<=5; i++) {
			System.out.println(i+"° aluno(a)");
			System.out.print("Nome = ");
			nome = teclado.nextLine();
			System.out.print("Informe a idade de "+nome+": ");
			idade = teclado.nextInt();
			System.out.println();
			
			if (idade<0) {
				System.out.println("Valor inválido!");
				break;
			}
			if (idade<=12)
				alunosAte12 += 1;
			if (idade>30)
				alunosAcima30 += 1;
			soma += idade;
			teclado.nextLine();
		}
				
		if (!(idade<0)) {
			media = (float) soma/(i-1);
			System.out.println("Alunos que tem até 12 anos = "+alunosAte12);
			System.out.println("Alunos que tem acima de 30 anos = "+alunosAcima30);
			System.out.printf("Média das idades informadas = %1.1f", media);
		}
		
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;

public class C08EX07 {
	public static void main(String[] args) {
		String nome, idadeStr;
		int i, idade=0, alunosAte12=0, alunosAcima30=0, soma=0;
		double media;
		
		JOptionPane.showMessageDialog(null, "Informe o nome e a idade de 50 alunos de uma turma.", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
		
		for (i=1; i<=50; i++) {
			nome = JOptionPane.showInputDialog(null, "Nome:", i+"° aluno(a)", JOptionPane.QUESTION_MESSAGE);
			
			idadeStr = JOptionPane.showInputDialog(null, "Informe a idade de "+nome+":", i+"° aluno(a)", JOptionPane.QUESTION_MESSAGE);
			idade = Integer.valueOf(idadeStr);
			
			if (idade<0) {
				JOptionPane.showMessageDialog(null, "Valor inválido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			if (idade<=12)
				alunosAte12 += 1;
			if (idade>30)
				alunosAcima30 += 1;
			
			soma += idade;
		}
		
		if (!(idade<0)) {
			media = (float) soma/(i-1);
			JOptionPane.showMessageDialog(null, String.format("Alunos que tem até 12 anos = %d\n\nAlunos que tem acima de 30 anos = %d\n\nMédia das idades informadas = %1.1f", alunosAte12, alunosAcima30, media), "Resultado da Pesquisa", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}