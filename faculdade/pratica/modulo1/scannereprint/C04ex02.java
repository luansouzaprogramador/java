package faculdade.pratica.modulo1.scannereprint;

import java.util.Scanner;

public class C04ex02 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, cpf, identidade, tituloEleitor, carteiraMotorista, nomeEmpresa;
		double salario;
		
		Scanner teclado = new Scanner(System.in);		
		System.out.println("-------------------------------------------------");
		System.out.println("Sobre seus dados pessoais, informe o que se pede");
		System.out.println("-------------------------------------------------");
		System.out.print("Nome completo: ");
		nome = teclado.nextLine();
		System.out.print("CPF: ");
		cpf = teclado.nextLine();
		System.out.print("Carteira de identidade: ");
		identidade = teclado.nextLine();
		System.out.print("Título de eleitor: ");
		tituloEleitor = teclado.nextLine();
		System.out.print("Carteira de motorista: ");
		carteiraMotorista = teclado.nextLine();
		System.out.print("Nome da empresa em que trabalha: ");
		nomeEmpresa = teclado.nextLine();
		System.out.print("Salário: ");
		salario = teclado.nextDouble();
		System.out.println();
		
		System.out.println("FICHA FUNCIONAL DE: "+nome);
		System.out.println();
		System.out.println("Documentos:");
		System.out.println("CPF ---------------------------- "+cpf);
		System.out.println("C.I. --------------------------- "+identidade);
		System.out.println("Título de eleitor -------------- "+tituloEleitor);
		System.out.println("Carteira de motorista ---------- "+carteiraMotorista);
		System.out.println();
		System.out.println("Empresa: "+nomeEmpresa);
		System.out.printf("Salário: R$%1.2f",salario);
		teclado.close();
	}
}