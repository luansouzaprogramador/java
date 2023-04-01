package faculdade.pratica.modulo2.comandodowhile;

import javax.swing.JOptionPane;

public class C10EX02 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String valorStr;
		double valor, soma=0;
		int cont=0, acimaDe1000=0;
		
		do {
			valorStr = JOptionPane.showInputDialog(null, "Informe o valor do serviço prestado ou digite 0 para encerrar o programa:", "Empresa | Setor Financeiro", JOptionPane.QUESTION_MESSAGE);
			valor = Double.valueOf(valorStr);
			if (valor!=0) {
				soma += valor;
				cont++;
			}
			if (valor>1000) {
				acimaDe1000++;
			}
		} while (valor!=0);
		
		JOptionPane.showMessageDialog(null, String.format("Valor total recebido = R$ %.2f\n\nMédia dos valores recebidos = R$ %.2f\n\nQuantidade de valores acima de R$ 1.000,00 = %d", soma, soma/cont, acimaDe1000), "Empresa | Setor Financeiro", JOptionPane.INFORMATION_MESSAGE);
	}
}