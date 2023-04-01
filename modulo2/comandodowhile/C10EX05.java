package faculdade.pratica.modulo2.comandodowhile;

import javax.swing.JOptionPane;

public class C10EX05 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String alturaStr, pesoStr, sexo;
		int quantP=0, h=0, m=0, mPesoMenorQue60=0;
		double altura, peso, somaAlturaH=0;
		
		do {
			alturaStr = JOptionPane.showInputDialog(null, "Informe a altura do(a) funcionário(a), em metros:", "Empresa", JOptionPane.QUESTION_MESSAGE);
			altura = Double.valueOf(alturaStr);
			if (altura==0)
				break;
			pesoStr = JOptionPane.showInputDialog(null, "Informe o peso do trabalhador, em Kg:", "Empresa", JOptionPane.QUESTION_MESSAGE);
			peso = Double.valueOf(pesoStr);
			sexo = JOptionPane.showInputDialog(null, "Informe o sexo do(a) funcionário(a).\nDigite 'M' para masculno ou 'F' para feminino:", "Empresa", JOptionPane.QUESTION_MESSAGE);
			if (sexo.equalsIgnoreCase("M")) {
				h++;
				somaAlturaH += altura;
			}
			else {
				m++;
				if (peso<60)
					mPesoMenorQue60++;
			}
			quantP++;
		} while (altura!=0);
		
		JOptionPane.showMessageDialog(null, String.format("Quantidade de pessoas pesquisadas = %d\n\nQuantidade de mulheres = %d\n\nAltura média dos homens = %.3f\n\nQuantidade de mulheres com peso menor que 60 = %d", quantP, m, (float) somaAlturaH/h, mPesoMenorQue60), "Empresa", JOptionPane.INFORMATION_MESSAGE);
	}
}