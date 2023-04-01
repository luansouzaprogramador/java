package faculdade.pratica.modulo2.comandofor;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class C08EX15 {
	// Autor: Luan Marcelino
	public static void main(String[] args) {
		String nome, cargo, salarioStr, idadeStr, ehSenior, nomeMaiorSalario="", cargoMaiorSalario="", mediaVF, maiorSalarioVF;
		int i, idade=0, quantMenoresIdade=0;
		double salario=0, soma=0, maiorSalario=0;
		
		JOptionPane.showMessageDialog(null, "A seguir, informe o nome, o cargo, o salário e a idade de 1000 funcionários.", "Empresa | Setor Financeiro", JOptionPane.INFORMATION_MESSAGE);
		
		for (i=1; i<=3; i++) {
			nome = JOptionPane.showInputDialog(null, "Informe o nome:", i+"° Funcionário", JOptionPane.QUESTION_MESSAGE);
			cargo = JOptionPane.showInputDialog(null, "Informe o cargo:", i+"° Funcionário", JOptionPane.QUESTION_MESSAGE);
			salarioStr = JOptionPane.showInputDialog(null, "Informe o salario:", i+"° Funcionário", JOptionPane.QUESTION_MESSAGE);
			salario = Double.valueOf(salarioStr);
			if (salario<0) {
				JOptionPane.showMessageDialog(null, "Valor inválido", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			idadeStr = JOptionPane.showInputDialog(null, "Informe a idade:", i+"° Funcionário", JOptionPane.QUESTION_MESSAGE);
			idade = Integer.valueOf(idadeStr);
			if (idade<0) {
				JOptionPane.showMessageDialog(null, "Valor inválido", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			if (salario>10000 && idade>50)
				ehSenior = "SIM";
			else
				ehSenior = "NÃO";
			
			if (idade<=18) {
				soma += salario;
				quantMenoresIdade++;
			}
			
			JOptionPane.showMessageDialog(null, String.format("O empregado %s é SÊNIOR = %s", nome, ehSenior), i+"° Funcionário", JOptionPane.INFORMATION_MESSAGE);
			
			if (i==1 || salario>maiorSalario) {
				maiorSalario = salario;
				nomeMaiorSalario = nome;
				cargoMaiorSalario = cargo;
			}
			
		}
		
		if (salario>0 && idade>0) {
			
			mediaVF = new DecimalFormat("R$ #,##0.00").format(soma/quantMenoresIdade);
			maiorSalarioVF = new DecimalFormat("R$ #,##0.00").format(maiorSalario);
			JOptionPane.showMessageDialog(null, String.format("Média dos salários dos funcionários com até 18 anos = %s"+
					"\n\nNome do funcionário que tem o maior salário = %s\n\nCargo de %s = %s\n\nSalário de %s = %s",
					mediaVF, nomeMaiorSalario, nomeMaiorSalario, cargoMaiorSalario, nomeMaiorSalario, maiorSalarioVF), "Empresa | Setor Financeiro",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}