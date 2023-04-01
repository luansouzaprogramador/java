/*
package faculdade.pratica.modulo2.comandofor;

import java.util.Scanner;

public class C08EX10 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int i, quantInsumos, quantConsumida;
		String nome, nomeMaiorCP="";
		double precoUnitario, custoParcial, custoTotal=0, maiorCP=0, mediaCP;
		
		Scanner arquivo = new Scanner(C08EX10.class.getResourceAsStream("arquivo1.txt"));
		
		quantInsumos = arquivo.nextInt();
		arquivo.nextLine();
		
		for (i=1; i<=quantInsumos; i++) {
			nome = arquivo.nextLine();
			quantConsumida = arquivo.nextInt();
			precoUnitario = arquivo.nextDouble();
			arquivo.nextLine();
			custoParcial = quantConsumida*precoUnitario;
			custoTotal += custoParcial;
			
			if(i==1 || custoParcial>maiorCP) {
				maiorCP = custoParcial;
				nomeMaiorCP = nome;
			}
		}
		mediaCP = (float) custoTotal/(i-1);
		
		System.out.printf(String.format("Custo Total = R$%1.2f\n\nMédia dos custos parciais =  R$%1.2f"+
				"\n\nNome do insumo de maior custo parcial = %s", custoTotal, mediaCP, nomeMaiorCP));
	}
}
*/
package faculdade.pratica.modulo2.comandofor;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class C08EX10 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		Scanner arquivo = new Scanner(C08EX10.class.getResourceAsStream("arquivo1.txt"));
		
		String nome, nomeInsumoMaiorCP="";
		int quantInsumos, i, quantInsumo;
		double precoUnitario, custoParcial, custoTotal=0, mediaCP, maiorCP=0;
		
		quantInsumos = arquivo.nextInt();
		arquivo.nextLine();
		
		for (i=1; i<=quantInsumos; i++) {
			nome           = arquivo.nextLine();
			quantInsumo    = arquivo.nextInt();
			precoUnitario  = arquivo.nextDouble();
			custoParcial   = quantInsumo*precoUnitario;
			custoTotal    += custoParcial;
			
			if (i == 1 || custoParcial>maiorCP) {
				maiorCP = custoParcial;
				nomeInsumoMaiorCP = nome;
			}
			arquivo.nextLine();
		}
		
		mediaCP = (float) custoTotal/(i-1);
		JOptionPane.showMessageDialog(null, String.format("Custo Total = R$%1.2f\n\nMédia dos custos parciais = R$%1.2f"+
				"\n\nNome do insumo de maior custo parcial = %s",  custoTotal, mediaCP, nomeInsumoMaiorCP),
				"Projeto", JOptionPane.INFORMATION_MESSAGE);
		arquivo.close();
	}
}