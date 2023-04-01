package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class C08EX12 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String codigoStr, faturamento;
		int codigo=0, quantProduto1=0, quantProduto2=0, quantProduto3=0, quantProduto4=0, quantProduto5=0;
		double precoUnitario1=0, precoUnitario2=0, precoUnitario3=0, precoUnitario4=0, precoUnitario5=0;
		
		JOptionPane.showMessageDialog(null, "Tendo como base a tabela abaixo, informe a seguir o código do produto comprado de 1000 clientes.\n\n"+
				"                                                 Modelo    Código     Preço Unitário\n"+
				"                                                 A2450        1               R$1.565,00\n"+
				"                                                 B2356        2               R$1.890,00\n"+
				"                                                 C3900        3               R$2.150,00\n"+
				"                                                 D4100        4               R$2.953,00\n"+
				"                                                 E6749        5               R$3.750,00\n",
				"Indústria produtora de máquinas agrícolas",
				JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=1; i<=10; i++) {
			codigoStr = JOptionPane.showInputDialog(null, "Informe o código do produto comprado:", i+"° Cliente", JOptionPane.QUESTION_MESSAGE);
			codigo = Integer.valueOf(codigoStr);
			
			if (codigo>0 && codigo<6) {
				switch (codigo) {
					case 1:
						precoUnitario1 = 1565;
						quantProduto1++;
						break;
					case 2:
						precoUnitario2 = 1890;
						quantProduto2++;
						break;
					case 3:
						precoUnitario3 = 2150;
						quantProduto3++;
						break;
					case 4:
						precoUnitario4 = 2963;
						quantProduto4++;
						break;
					case 5:
						precoUnitario5 = 3750;
						quantProduto5++;
						break;
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Valor inválido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		}
		
		if (codigo>0 && codigo<6) {
			faturamento = new DecimalFormat("R$#,##0.00").format(precoUnitario1*quantProduto1 + precoUnitario2*quantProduto2 + precoUnitario3*quantProduto3 + precoUnitario4*quantProduto4 + precoUnitario5*quantProduto5);
			JOptionPane.showMessageDialog(null, String.format("Faturamento = %s", faturamento), "Indústria | Setor Financeiro", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}