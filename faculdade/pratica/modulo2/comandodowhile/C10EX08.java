package faculdade.pratica.modulo2.comandodowhile;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class C10EX08 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nomeCidade, nomeMenorPopulacao=null;
		int populacao, numEleitores, quantF, quantM, totalCidade=0, populacaoTotalUF=0,
			totalEleitoresUF=0, maisMulheres=0, totalHomensUF=0, menorPopulacao=0;
		Scanner arquivo = new Scanner(C10EX08.class.getResourceAsStream("arquivo4.txt"));
		
		do {
			nomeCidade = arquivo.nextLine();
			populacao = arquivo.nextInt();
			numEleitores = arquivo.nextInt();
			quantM = arquivo.nextInt();
			quantF = arquivo.nextInt();
			
			if (quantF+quantM!=populacao)
				JOptionPane.showMessageDialog(null, "Em "+nomeCidade+" a soma da quantidade de homens mais a quantidade de mulheres"
						+" é diferente da sua população total!", "Instituto Brasileiro de Geografia e Estatística",
						JOptionPane.INFORMATION_MESSAGE);
			
			populacaoTotalUF += populacao;
			totalEleitoresUF += numEleitores;
			
			if (quantF>quantM)
				maisMulheres++;
			
			totalCidade++;
			totalHomensUF += quantM;
			
			if (totalCidade == 1 || populacao<menorPopulacao) {
				menorPopulacao = populacao;
				nomeMenorPopulacao = nomeCidade;
			}
			arquivo.nextLine();
		} while (!nomeCidade.equalsIgnoreCase("Zimbabue de Minas"));
		
		JOptionPane.showMessageDialog(null, "Total de cidades = "+totalCidade+
				"\n\nPopulação Total = "+new DecimalFormat("#,##0").format(populacaoTotalUF)+
				String.format("\n\nPercentual de eleitores = %.3f", (float) totalEleitoresUF/populacaoTotalUF*100)+
				"%\n\nCidades com mais mulheres que homens = "+maisMulheres+"\n\nMédia de homens = "+
				new DecimalFormat("#,##0").format(totalHomensUF/totalCidade)+"\n\nCidade com menor população = "+
				nomeMenorPopulacao, "Instituto Brasileiro de Geografia e Estatística", JOptionPane.INFORMATION_MESSAGE);
		
		arquivo.close();
	}
}