package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class C08EX29 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String aStr, bStr, aVF, bVF, multiplicacaoVF;
		long a, b, multiplicacao=1;
		
		JOptionPane.showMessageDialog(null, "Considere a função f(x) = A^B.\n\nInforme, a seguir, valores inteiros positivos para A e B "+
				"e obtenha a imagem correspondente.", "Função Exponencial", JOptionPane.INFORMATION_MESSAGE);
		aStr = JOptionPane.showInputDialog(null, "Informe o valor de A:", "Função Exponencial", JOptionPane.QUESTION_MESSAGE);
		a = Integer.valueOf(aStr);
		
		if (a>0) {
			bStr = JOptionPane.showInputDialog(null, "Informe o valor de B:", "Função Exponencial", JOptionPane.QUESTION_MESSAGE);
			b = Integer.valueOf(bStr);
			
			if (b>0) {
				for (int aux=1; aux<=b; aux++) {
					multiplicacao *= a;
				}
				
				aVF = new DecimalFormat("#,##0").format(a);
				bVF = new DecimalFormat("#,##0").format(b);
				multiplicacaoVF = new DecimalFormat("#,##0").format(multiplicacao);
				JOptionPane.showMessageDialog(null, String.format("%s^%s = %s", aVF, bVF, multiplicacaoVF), "Função Exponenecial",
						JOptionPane.INFORMATION_MESSAGE);
			}
			else
				JOptionPane.showMessageDialog(null, "Valor inválido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
		}
		else
			JOptionPane.showMessageDialog(null, "Valor inválido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
	}
}