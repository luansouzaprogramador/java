package faculdade.pratica.modulo2.comandofor;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class C08EX31 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, codigo="", nomeMenorSalario="", cargo, cargoMenorSalario="", mediaSalarioAdm, menorSalarioVF, quantEngenheirosStr;
		double salario, salarioMinimo, somaSalarioAdm=0, menorSalario=0;
		int quantSalarioAcimaSM=0, quantEngOutrosAcima5000=0, quantAdm=0, quantEngenheiros;
		
		Scanner arquivo = new Scanner(C08EX31.class.getResourceAsStream("arquivo3.txt"));
		
		quantEngenheirosStr = JOptionPane.showInputDialog(null, "Informe a quantidade de engenheiros pesquisados:", "Pesquisa", JOptionPane.QUESTION_MESSAGE);
		quantEngenheiros = Integer.valueOf(quantEngenheirosStr);
		
		if (quantEngenheiros>0) {
			for (int aux=1; aux<=quantEngenheiros; aux++) {
				nome = arquivo.nextLine();
				salario = arquivo.nextDouble();
				if (salario>0) {
					arquivo.nextLine();
					codigo = arquivo.nextLine();
					
					if (!(codigo.equalsIgnoreCase("C") || codigo.equalsIgnoreCase("P") || codigo.equalsIgnoreCase("O") || codigo.equalsIgnoreCase("A") || codigo.equalsIgnoreCase("X"))) {
						JOptionPane.showMessageDialog(null, "Valor inválido!\n\nO código do cargo referente ao(à) funcionário(a) "+nome+" está incorreto.", "ERRO", JOptionPane.INFORMATION_MESSAGE);
						break;
					}
					
					if (codigo.equalsIgnoreCase("C")) {
						salarioMinimo = 2500;
						cargo = "Engenheiro Calculista";
					} else if (codigo.equalsIgnoreCase("P")) {
						salarioMinimo = 4650;
						cargo = "Engenheiro Projetista";
					} else if (codigo.equalsIgnoreCase("O")) {
						salarioMinimo = 3200;
						cargo = "Engenheiro de Obra";
					} else if (codigo.equalsIgnoreCase("A")) {
						salarioMinimo = 5100;
						somaSalarioAdm += salario;
						quantAdm++;
						cargo = "Engenheiro Administrador";
					} else {
						salarioMinimo = 0;
						cargo = "Outros";
						if (salario>5000) {
							quantEngOutrosAcima5000++;
						}
					}
					
					if (salario<salarioMinimo) {
						JOptionPane.showMessageDialog(null, "Situação = Abaixo do Salário Mínimo.", String.format("Funcionário(a): %s", nome), JOptionPane.INFORMATION_MESSAGE);
					}
					
					if (salario>salarioMinimo) {
						quantSalarioAcimaSM++;
					}
					
					if (aux==1 || salario<menorSalario) {
						menorSalario = salario;
						nomeMenorSalario = nome;
						cargoMenorSalario= cargo;
					}
					
				}
				else
					JOptionPane.showMessageDialog(null, "Valor inválido!\n\nO salário do(a) funcionário(a) "+nome+" está incorreto, pois apresenta valor negativo.", "ERRO", JOptionPane.INFORMATION_MESSAGE);
			}
			
			if (codigo.equalsIgnoreCase("C") || codigo.equalsIgnoreCase("P") || codigo.equalsIgnoreCase("O") || codigo.equalsIgnoreCase("A") || codigo.equalsIgnoreCase("X")) {
				mediaSalarioAdm = new DecimalFormat("R$ #,##0.00").format(somaSalarioAdm/quantAdm);
				menorSalarioVF = new DecimalFormat("R$ #,##0.00").format(menorSalario);
				
				JOptionPane.showMessageDialog(null, String.format("Média dos salários dos Administradores = %s\n\nQuantidade de salários acima do mínimo = %d\n\nQuantidade de Engenheiros de cargo 'Outros' que recebem acima de R$5.000,00 = %d\n\nNome, cargo e salário do engenheiro de menor salário = %s, %s, %s", mediaSalarioAdm, quantSalarioAcimaSM-2, quantEngOutrosAcima5000, nomeMenorSalario, cargoMenorSalario, menorSalarioVF), "Empresa | Setor Financeiro", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else
			JOptionPane.showMessageDialog(null, "Valor inválido!\n\nA quantidade de engenheiros informados é menor que zero.", "ERRO", JOptionPane.INFORMATION_MESSAGE);
		arquivo.close();
	}
}