package faculdade.pratica.modelosdecodigos;

import java.util.Locale;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class SeparadorDeMilhar {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String numeroStr;
		int numero;
		double numeroDouble;
		
		numeroStr = JOptionPane.showInputDialog(null, "Informe um n�mero inteiro:", "Separador de Milhar", JOptionPane.QUESTION_MESSAGE);
		numero = Integer.valueOf(numeroStr);
		numeroStr = new DecimalFormat("#0.0").format(numero);
		//"#0" imprimir� o n�mero com nenhuma casa decimal
		//"#0.0" imprimir� o n�mero com uma casa decimal
		JOptionPane.showMessageDialog(null, "N�mero inteiro formatado = "+numeroStr, "Separador de Milhar", JOptionPane.INFORMATION_MESSAGE);
		
		numeroStr = JOptionPane.showInputDialog(null, "Informe um n�mero real:", "Sepador de Milhar", JOptionPane.QUESTION_MESSAGE);
		numeroDouble = Double.valueOf(numeroStr);
		numeroStr = new DecimalFormat("#0.00").format(numeroDouble);
		// "#0.00" imprimir� o n�mero com 2 casas decimais
		// "#0.0000" imprimir� o n�mero com 4 casas decimais
		JOptionPane.showMessageDialog(null, "N�mero real formatado = "+numeroStr, "Separador de Milhar", JOptionPane.INFORMATION_MESSAGE);
	}
}