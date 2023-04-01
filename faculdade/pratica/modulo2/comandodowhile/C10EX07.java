package faculdade.pratica.modulo2.comandodowhile;

import javax.swing.JOptionPane;

public class C10EX07 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String populacaoStr, nome;
		int populacao, tempo=0;
		double contaminacao=1;
		
		nome = JOptionPane.showInputDialog(null, "Informe o nome da cidade em que a pesquisa foi feita:", "Contaminação", JOptionPane.QUESTION_MESSAGE);
		populacaoStr = JOptionPane.showInputDialog(null, "Informe a quantidade de pessoas de "+nome+":", "Contaminação", JOptionPane.QUESTION_MESSAGE);
		populacao = Integer.valueOf(populacaoStr);
		
		do {
			contaminacao += 0.003*contaminacao;
			tempo++;
		} while (contaminacao<populacao);
		
		JOptionPane.showMessageDialog(null, "Em "+tempo/365+" anos, "+tempo%365/30+" meses e "+tempo%365%30+" dias toda a população de "+nome+" estará infectada com o vírus.", "Contaminação", JOptionPane.INFORMATION_MESSAGE);
	}
}