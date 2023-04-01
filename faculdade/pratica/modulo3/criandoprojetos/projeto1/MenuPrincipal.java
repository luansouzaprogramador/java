package faculdade.pratica.modulo3.criandoprojetos.projeto1;

import javax.swing.JOptionPane;

public class MenuPrincipal {
	public static void main(String[] args) {
		String opcaoStr;
		int opcao;
		
		do {
			opcaoStr = JOptionPane.showInputDialog(null, "Informe a opcao desejada:\n\n1 - Calcula Potenciacao\n2 - Calcula Funcao Afim\n3 - Calcula Funcao Quadratica\n4 - Calcula Distancia Entre Dois Pontos\n5 - Calcula IMC\n6 - Sair", "Menu Principal", JOptionPane.QUESTION_MESSAGE);
			opcao = Integer.valueOf(opcaoStr);
			switch (opcao) {
			case 1:
				Potenciacao.CalculaPotenciacao();
				break;
			case 2:
				FuncaoAfim.CalculaFuncaoAfim();
				break;
			case 3:
				FuncaoQuadratica.CalculaFuncaoQuadratica();
				break;
			case 4:
				DistanciaEntreDoisPontos.CalculaDistanciaEntreDoisPontos();
				break;
			case 5:
				IMC.CalculaIMC();
				break;
			case 6:
				break;
			default:
				JOptionPane.showMessageDialog(null, "OPCAO INVALIDA!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		} while (opcao!=6);
		
		JOptionPane.showMessageDialog(null, "Volte sempre, e um prazer ter voce por aqui!", "FIM DO PROGRAMA!", JOptionPane.INFORMATION_MESSAGE);
	}
}
