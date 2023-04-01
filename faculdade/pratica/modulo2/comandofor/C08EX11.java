package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;

public class C08EX11 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int idade=0, indiceSexo, indiceEstadoCivil, indiceCorOlhos, indiceCorCabelo, indiceEscolaridade, respA=0, quantPessoas;
		String nome, idadeStr, salarioStr, nomePessoaMaiorSalario="", quantPessoasStr;
		String [] sexo = {"Masculino", "Feminino"}, estadoCivil = {"Solteiro(a)", "Casado(a)", "Outros"},
				corOlhos = {"Azul", "Castanho", "Preto", "Outros"}, corCabelo = {"Loiro", "Preto", "Castanho", "Ruivo"},
				escolaridade = {"Analfabeto", "Ensino Fundamental", "Ensino Médio", "Ensino Superior"};
		double salario=0, maiorSalario=0, maiorSalarioM=0, menorSalarioM=0;
		
		quantPessoasStr = JOptionPane.showInputDialog(null, "Informe a quantidade de pessoas a serem entrevistadas:", "Pesquisa", JOptionPane.QUESTION_MESSAGE);
		quantPessoas = Integer.valueOf(quantPessoasStr);
		
		if (quantPessoas>0) {
			for (int i=1; i<=quantPessoas; i++) {
				nome = JOptionPane.showInputDialog(null, "Informe o nome:", i+"° Pessoa", JOptionPane.QUESTION_MESSAGE);
				
				idadeStr = JOptionPane.showInputDialog(null, "Informe a idade:", i+"° Pessoa", JOptionPane.QUESTION_MESSAGE);
				idade = Integer.valueOf(idadeStr);
				if (idade<0) {
					JOptionPane.showMessageDialog(null, "Valor inválido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				
				salarioStr = JOptionPane.showInputDialog(null, "Informe o valor do salário, em reais:", i+"° Pessoa", JOptionPane.QUESTION_MESSAGE);
				salario = Double.valueOf(salarioStr);
				if (salario<0) {
					JOptionPane.showMessageDialog(null, "Valor inválido", "ERRO", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				
				indiceSexo = JOptionPane.showOptionDialog(null,
					    "Selecione seu sexo:",            // mensagem do corpo da caixa
					    i+"° Pessoa",	                      // título da caixa
					    JOptionPane.INFORMATION_MESSAGE,  // tipo da opção
					    JOptionPane.QUESTION_MESSAGE,     // tipo do diálogo
					    null,
					    sexo,                             // Strings dos botões
					    "Masculino");
				
				indiceEstadoCivil = JOptionPane.showOptionDialog(null,
						"Selecione seu estado civil:",
						i+"° Pessoa",
						JOptionPane.INFORMATION_MESSAGE,
						JOptionPane.QUESTION_MESSAGE,
						null,
						estadoCivil,
						"Solteiro");
				
				indiceCorOlhos = JOptionPane.showOptionDialog(null,
						"Selecione a cor dos olhos:",
						i+"° Pessoa",
						JOptionPane.INFORMATION_MESSAGE,
						JOptionPane.QUESTION_MESSAGE,
						null,
						corOlhos,
						"Azul");
				
				indiceCorCabelo = JOptionPane.showOptionDialog(null,
						"Selecione a cor do cabelo:",
						i+"° Pessoa",
						JOptionPane.INFORMATION_MESSAGE,
						JOptionPane.QUESTION_MESSAGE,
						null,
						corCabelo,
						"Loiro");
				
				indiceEscolaridade = JOptionPane.showOptionDialog(null,
						"Selecione sua escolaridade:",
						i+"° Pessoa",
						JOptionPane.INFORMATION_MESSAGE,
						JOptionPane.QUESTION_MESSAGE,
						null,
						escolaridade,
						"Analfabeto");

				if (indiceCorCabelo==0 && indiceCorOlhos==0 && (idade>=18 && idade<=25) && indiceEstadoCivil==0 && salario>10000 && indiceEscolaridade==3)
					respA++;
				
				if (i==1 || salario>maiorSalario)
					nomePessoaMaiorSalario = nome;
				
				if (indiceSexo==0 && (i==1 || salario>maiorSalarioM))
					maiorSalarioM = salario;
				
				if (indiceSexo==0 && (i==1 || salario<menorSalarioM))
					menorSalarioM = salario;
			}
			
			if (idade>0 && salario>0) {
				JOptionPane.showMessageDialog(null, String.format("Quantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos,"+
						"solteiras, salário maior que R$10.000,00 e curso superior completo: %d"+
						"\n\nNome da pessoa com maior salário: %s"+
						"\n\nDiferença entre o maior e menor salário dos homens: R$%1.2f", respA, nomePessoaMaiorSalario, maiorSalarioM-menorSalarioM),
						"Resultado da Pesquisa",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else
			JOptionPane.showMessageDialog(null, "Valor inválido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
	}
}