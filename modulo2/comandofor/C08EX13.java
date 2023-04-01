package faculdade.pratica.modulo2.comandofor;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class C08EX13 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nomeCidade, nomeCidadeMaiorPopulacao="", quantHomensVF, quantMulheresVF, populacaoVF;
		int populacao, quantEleitores, quantMulheres, quantHomens, superPopulacao=0, cidadesMaisF=0, menorPopulacao=0;
		double percentualEleitores;
		
		Scanner arquivo = new Scanner(C08EX11.class.getResourceAsStream("arquivo2.txt"));
		for (int i=1; i<=5; i++) {
			nomeCidade = arquivo.nextLine();
			populacao           = arquivo.nextInt();
			quantEleitores      = arquivo.nextInt();
			quantHomens         = arquivo.nextInt();
			quantMulheres       = arquivo.nextInt();
			arquivo.nextLine();
			percentualEleitores = (float) quantEleitores/populacao*100;
			
			quantHomensVF = new DecimalFormat("#,##0").format(quantHomens);
			quantMulheresVF = new DecimalFormat("#,##0").format(quantMulheres);
			populacaoVF = new DecimalFormat("#,##0").format(populacao);
			
			if ((quantHomens+quantMulheres) != populacao)
				JOptionPane.showMessageDialog(null, String.format("A quantidade de homens (%s) mais a quantidade de mulheres (%s) é diferente da população total da cidade (%s).\n\nPercentual de Eleitores = %1.1f%%", quantHomensVF, quantMulheresVF, populacaoVF, percentualEleitores), "Cidade de "+nomeCidade, JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, String.format("Percentual de Eleitores = %1.1f%%", percentualEleitores), "Cidade de "+nomeCidade, JOptionPane.INFORMATION_MESSAGE);
				
			if (populacao>1000000)
				superPopulacao++;
			
			if (quantMulheres>quantHomens)
				cidadesMaisF++;
			
			if (i==1 || populacao<menorPopulacao) {
				menorPopulacao = populacao;
				nomeCidadeMaiorPopulacao = nomeCidade;
			}
		}
		JOptionPane.showMessageDialog(null, String.format("Total de cidades com mais de 1 milhão de habitantes = %d"+
				"\n\nCidades com mais mulheres que homens = %d\n\nCidade com menor população = %s",
				superPopulacao, cidadesMaisF, nomeCidadeMaiorPopulacao), "Estudo do IBGE", JOptionPane.INFORMATION_MESSAGE);
		arquivo.close();
	}
}