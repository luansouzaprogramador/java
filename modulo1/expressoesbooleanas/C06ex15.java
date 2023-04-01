/*
package faculdade.pratica.modulo1.expressoesbooleanas;

import java.util.Scanner;

public class C06ex15 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int codigo, quantDiasCanaisPpp;
		double valorServicosExtras, valorFixo = 0, valorCanaisPpp = 0, imposto, conta;
		String nome, cidade;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Sobre seu plano de TV a cabo, preencha as informações abaixo.");
		System.out.print("\nSeu nome completo: ");
		nome = teclado.nextLine();
		System.out.print("Código do seu pacote: ");
		codigo = teclado.nextInt();
		
		if (codigo==1 || codigo==2 || codigo==3) {
			System.out.print("Quantidade de dias de consumo de canais pay-per-view: ");
			quantDiasCanaisPpp = teclado.nextInt();
			System.out.print("Valor dos serviços extras: ");
			valorServicosExtras = teclado.nextDouble();
			teclado.nextLine();
			System.out.print("Sua cidade: ");
			cidade = teclado.nextLine();
			
			if (codigo==1) {
				valorFixo = 65;
				valorCanaisPpp = quantDiasCanaisPpp*1.2;
				if (valorCanaisPpp >= 65) {
					valorCanaisPpp = 65;
				}
			} else if (codigo==2) {
				valorFixo = 104;
				valorCanaisPpp = quantDiasCanaisPpp*2.1;
			} else {
				valorFixo = 137;
				valorCanaisPpp = 0;
			}
			
			if (cidade.equalsIgnoreCase("Belo Horizonte")) {
				imposto = 0;
			} else if (cidade.equalsIgnoreCase("São Paulo")){
				imposto = 0.01*(valorFixo+valorCanaisPpp+valorServicosExtras);
			} else if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
				imposto = 0.015*(valorFixo+valorCanaisPpp+valorServicosExtras);
			} else {
				imposto = 0.02*(valorFixo+valorCanaisPpp+valorServicosExtras);
			}
			
			conta = valorFixo+valorCanaisPpp+valorServicosExtras+imposto;
			
			System.out.println("------------------------------------------------------------------");
			System.out.printf("%s, sua conta é de R$%1.2f.", nome, conta);
			
		} else {
			System.out.println("------------------------------------------------------------------\nCódigo Inválido!");
		}
		
		teclado.close();
	}
}
*/
package faculdade.pratica.modulo1.expressoesbooleanas;

import javax.swing.JOptionPane;

public class C06ex15 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, codigoStr, quantDiasCanaisPppStr, valorServicosExtrasStr, cidade;
		int codigo, quantDiasCanaisPpp;
		double valorServicosExtras, valorFixo = 0, valorCanaisPpp = 0, imposto, conta;
		
		JOptionPane.showMessageDialog(null, "Sobre seu plano de TV a cabo, preencha as informações a seguir.", "Plano de TV a cabo", JOptionPane.INFORMATION_MESSAGE);
		
		nome = JOptionPane.showInputDialog(null, "Seu nome completo:", "Plano de TV a cabo", JOptionPane.QUESTION_MESSAGE);
		codigoStr = JOptionPane.showInputDialog(null, "Código do seu pacote:", "Plano de TV a cabo", JOptionPane.QUESTION_MESSAGE);
		codigo = Integer.valueOf(codigoStr);
		
		if (codigo==1 || codigo==2 || codigo==3) {
			quantDiasCanaisPppStr = JOptionPane.showInputDialog(null, "Quantidade de dias de consumo de canais pay-per-view:", "Plano de TV a cabo", JOptionPane.QUESTION_MESSAGE);
			valorServicosExtrasStr = JOptionPane.showInputDialog(null, "Valor dos serviços extras:", "Plano de TV a cabo", JOptionPane.QUESTION_MESSAGE);
			cidade = JOptionPane.showInputDialog(null, "Sua cidade:", "Plano de TV a cabo", JOptionPane.QUESTION_MESSAGE);
			
			quantDiasCanaisPpp = Integer.valueOf(quantDiasCanaisPppStr);
			valorServicosExtras = Double.valueOf(valorServicosExtrasStr);
			if (codigo==1) {
				valorFixo = 65;
				valorCanaisPpp = quantDiasCanaisPpp*1.2;
				if (valorCanaisPpp >= 65) {
					valorCanaisPpp = 65;
				}
			} else if (codigo==2) {
				valorFixo = 104;
				valorCanaisPpp = quantDiasCanaisPpp*2.1;
			} else {
				valorFixo = 137;
				valorCanaisPpp = 0;
			}
			
			if (cidade.equalsIgnoreCase("Belo Horizonte")) {
				imposto = 0;
			} else if (cidade.equalsIgnoreCase("São Paulo")){
				imposto = 0.01*(valorFixo+valorCanaisPpp+valorServicosExtras);
			} else if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
				imposto = 0.015*(valorFixo+valorCanaisPpp+valorServicosExtras);
			} else {
				imposto = 0.02*(valorFixo+valorCanaisPpp+valorServicosExtras);
			}
			
			conta = valorFixo+valorCanaisPpp+valorServicosExtras+imposto;
			
			JOptionPane.showMessageDialog(null, nome+", sua conta é de R$"+conta, "Plano de TV a cabo", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Código Inválido!", "Erro", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}