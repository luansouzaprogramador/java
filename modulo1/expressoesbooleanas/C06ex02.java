/*
package faculdade.pratica.modulo1.expressoesbooleanas;

import java.util.Scanner;

public class C06ex02 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double quantidadePoluente, valorMulta;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a quantidade de poluentes emitidos pela empresa em [mg/(t*m^2)]: ");
		quantidadePoluente = teclado.nextDouble();
		
		if (quantidadePoluente<=1500) {
			valorMulta = 0;
		} else if (quantidadePoluente<3500) {
			valorMulta = 3000;
		} else {
			valorMulta = 5000*quantidadePoluente;
		}
		
		System.out.printf("\nValor da Multa: R$%1.2f",valorMulta);
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo1.expressoesbooleanas;

import javax.swing.JOptionPane;

public class C06ex02 {
	// Autor: Luan arcelino de Souza
	public static void main(String[] args) {
		String quantidadePoluenteStr;
		double quantidadePoluente, valorMulta;
		
		quantidadePoluenteStr = JOptionPane.showInputDialog(null, "Informe a quantidade de poluentes emitidos pela empresa em [mg/(t*m^2)]:", "Secretaria do Meio Ambiente", JOptionPane.QUESTION_MESSAGE);
		quantidadePoluente = Double.valueOf(quantidadePoluenteStr);
		
		if (quantidadePoluente<=1500) {
			valorMulta = 0;
		} else if (quantidadePoluente<3500) {
			valorMulta = 3000;
		} else {
			valorMulta = 5000*quantidadePoluente;
		}
		
		JOptionPane.showMessageDialog(null, String.format("Valor da Multa: R$%.2f",valorMulta), "Secretaria do Meio Ambiente", JOptionPane.INFORMATION_MESSAGE);
	}
}