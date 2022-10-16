package faculdade.pratica.modelosdecodigos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class LeitorDeArquivo {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		Scanner arquivo = new Scanner(LeitorDeArquivo.class.getResourceAsStream("arquivo5.txt"));
		String nome, sexo, nomeVelho=null, nomeNovo=null;
		int idade, cont=0, quantM=0, quantF=0, somaM=0, maiorIdade=0, menorIdade=0;
		double mediaM;
		
		do {
			// Leitura de dados
			nome = arquivo.nextLine();
			idade = arquivo.nextInt();
			arquivo.nextLine();
			sexo = arquivo.nextLine();
			
			if (sexo.equalsIgnoreCase("M")) {
				quantM++;
				somaM += idade;
			}
			else
				quantF++;
			
			cont++;
			
			// Pessoa mais velha
			if (cont==1 || idade>maiorIdade) {
				maiorIdade = idade;
				nomeVelho = nome;
			}
			// Pessoa mais nova
			if (cont==1 || idade<menorIdade) {
				menorIdade = idade;
				nomeNovo = nome;
			}
		} while (arquivo.hasNextLine());
		
		mediaM = (float) somaM/quantM;
		JOptionPane.showMessageDialog(null, "Total de pessoas = "+cont+"\n\nQuantidade de homens = "+quantM+
				"\n\nQuantidade de mulheres = "+quantF+"\n\nM�dia de idade dos homens = "+mediaM+
				"\n\nNome e idade da pessoa mais velha = "+nomeVelho+", "+maiorIdade+" anos."+
				"\n\nNome e idade da pessoa mais nova = "+nomeNovo+", "+menorIdade+" anos.", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
		
		arquivo.close();
	}
}