package faculdade.pratica.modulo1.scannereprint;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class C04ex05 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, cpf, identidade, tituloEleitor, carteiraMotorista, nomeEmpresa;
		double salario;
		
		Scanner arquivo = new Scanner(C04ex05.class.getResourceAsStream("ficha.txt"));
		nome = arquivo.nextLine();
		cpf = arquivo.nextLine();
		identidade = arquivo.nextLine();
		tituloEleitor = arquivo.nextLine();
		carteiraMotorista = arquivo.nextLine();
		nomeEmpresa = arquivo.nextLine();
		salario = arquivo.nextDouble();
		
		JOptionPane.showMessageDialog(null, "FICHA FUNCIONAL DE: "+nome+
			"\n\nDocumentos:"+"\nCPF ------------------------------------ "+cpf+
			"\nC.I. ------------------------------------- "+identidade+
			"\nTítulo de eleitor ------------------- "+tituloEleitor+
			"\nCarteira de motorista ----------- "+carteiraMotorista+"\n\nEmpresa: "+nomeEmpresa+
			"\nSalário: R$"+salario, "FICHA FUNCIONAL", JOptionPane.INFORMATION_MESSAGE);
		arquivo.close();
	}
}