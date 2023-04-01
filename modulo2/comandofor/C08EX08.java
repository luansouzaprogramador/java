/*
package faculdade.pratica.modulo2.comandofor;

import java.util.Scanner;

public class C08EX08 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double notaFinal=0, mediaAprovados;
		int i, totalFaltas=0, contAprovados=0, somaAprovados=0, faltasMaiorQue16=0;
		
		System.out.println("Informe, a seguir, a nota final e o total de faltas de 50 alunos.\n");
		for (i=1; i<=3; i++) {
			System.out.print(i+"° Aluno\nNota final = ");
			notaFinal = teclado.nextDouble();
			if (notaFinal<0) {
				System.out.println("\nValor inválido!");
				break;
			}
			System.out.print("Total de faltas = ");
			totalFaltas = teclado.nextInt();
			if (totalFaltas<0) {
				System.out.println("\nValor inválido!");
				break;
			}
			if (notaFinal>=65 && totalFaltas<=16) {
				System.out.println("Situação = Aprovado\n");
				contAprovados++;
				somaAprovados += notaFinal;
			} else {
				System.out.println("Situação = Reprovado\n");
				if (totalFaltas>16)
					faltasMaiorQue16 += 1;
			}
		}
		
		if (!(notaFinal<0 || totalFaltas<0)) {
			mediaAprovados = (float) somaAprovados/contAprovados;
			System.out.println("\nSituação da Turma\nQuantidade de alunos aprovados: "+contAprovados+
					"\nQuantidade de alunos reprovados: "+(i-contAprovados-1)+
					String.format("\nMédia das notas dos aprovados = %1.1f", mediaAprovados)+
					"\nQuantidade de alunos com mais de 16 faltas = "+faltasMaiorQue16);
		}
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;

public class C08EX08 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String notaFinalStr, totalFaltasStr;
		double notaFinal=0, mediaAprovados;
		int i, totalFaltas=0, contAprovados=0, somaAprovados=0, faltasMaiorQue16=0;
		
		JOptionPane.showMessageDialog(null, "Informe, a seguir, a nota final e o total de faltas de 50 alunos.", "Escola", JOptionPane.INFORMATION_MESSAGE);
		
		for (i=1; i<=3; i++) {
			notaFinalStr = JOptionPane.showInputDialog(null, "Nota final:", i+"° aluno:", JOptionPane.QUESTION_MESSAGE);
			notaFinal = Double.valueOf(notaFinalStr);
			
			if (notaFinal<0) {
				JOptionPane.showMessageDialog(null, "Valor inválido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			totalFaltasStr = JOptionPane.showInputDialog(null, "Total de faltas:", i+"° aluno:", JOptionPane.QUESTION_MESSAGE);
			totalFaltas = Integer.valueOf(totalFaltasStr);
			
			if (totalFaltas<0) {
				JOptionPane.showMessageDialog(null, "Valor inválido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			if (notaFinal>=65 && totalFaltas<=16) {
				JOptionPane.showMessageDialog(null, "Aprovado(a)", "Situação", JOptionPane.INFORMATION_MESSAGE);
				contAprovados++;
				somaAprovados += notaFinal;
			} else {
				JOptionPane.showMessageDialog(null, "Reprovado(a)", "Situação", JOptionPane.INFORMATION_MESSAGE);
				if (totalFaltas>16)
					faltasMaiorQue16 += 1;
			}
		}
		
		if (!(notaFinal<0 || totalFaltas<0)) {
			mediaAprovados = (float) somaAprovados/contAprovados;
			JOptionPane.showMessageDialog(null, "Quantidade de alunos aprovados: "+contAprovados+
					"\n\nQuantidade de alunos reprovados: "+(i-contAprovados-1)+
					String.format("\n\nMédia das notas dos aprovados = %1.1f", mediaAprovados)+
					"\n\nQuantidade de alunos com mais de 16 faltas = "+faltasMaiorQue16, "Situação da Turma", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}