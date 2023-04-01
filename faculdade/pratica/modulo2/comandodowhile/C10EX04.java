package faculdade.pratica.modulo2.comandodowhile;

import javax.swing.JOptionPane;

public class C10EX04 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String taxaStr, nome, quantMaterialStr, precoUnitarioStr;
		int quantMaterial;
		double custoParcial, precoUnitario, custoTotal=0, taxa;
		
		taxaStr = JOptionPane.showInputDialog(null, "Informe a taxa de BDI da empresa:", "Indústria", JOptionPane.QUESTION_MESSAGE);
		taxa = Double.valueOf(taxaStr)/100;
		
		do {
			nome = JOptionPane.showInputDialog(null, "Informe o nome do material (Digite 'FIM' para finalizar o programa):", "Indústria", JOptionPane.QUESTION_MESSAGE);
			if (!nome.equalsIgnoreCase("FIM")) {
				quantMaterialStr = JOptionPane.showInputDialog(null, "Informe a quantidade de "+nome+":", "Indústria", JOptionPane.QUESTION_MESSAGE);
				quantMaterial = Integer.valueOf(quantMaterialStr);
				precoUnitarioStr = JOptionPane.showInputDialog(null, "Informe o preço unitário do produto:", "Indústria", JOptionPane.QUESTION_MESSAGE);
				precoUnitario = Double.valueOf(precoUnitarioStr);
				custoParcial = quantMaterial*precoUnitario;
				JOptionPane.showMessageDialog(null, String.format("Custo Parcial = R$ %.2f", custoParcial), "Indústria", JOptionPane.INFORMATION_MESSAGE);
				custoTotal += custoParcial;
			}
		} while (!nome.equalsIgnoreCase("FIM"));
		
		JOptionPane.showMessageDialog(null, String.format("Preço Final = R$ %.2f", custoTotal+custoTotal*taxa), "Indústria", JOptionPane.INFORMATION_MESSAGE);
	}
}