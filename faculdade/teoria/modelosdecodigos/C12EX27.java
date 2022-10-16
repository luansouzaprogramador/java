package faculdade.pratica.modelosdecodigos;

import java.util.Scanner;
import java.util.ArrayList;

public class C12EX27 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> cpfs = new ArrayList<String>();
		ArrayList<String> enderecos = new ArrayList<String>();
		String cpf, resposta;
		int posicao = -1;
		
		for (int i=0; i<5; i++) {
			System.out.print("Informe o CPF da "+(i+1)+"_a pessoa: ");
			cpfs.add(teclado.nextLine());
			System.out.print("Digite o endereco: ");
			enderecos.add(teclado.nextLine());
		}
		
		System.out.print("\nInforme o CPF que deseja procurar: ");
		cpf = teclado.nextLine();
		
		for (int i=0; i<cpfs.size(); i++) {
			if (cpf.equalsIgnoreCase(cpfs.get(i))) {
				posicao = i;
				break;
			}
		}
		
		if (posicao == -1) {
			System.out.println("CPF nao encontrado!");
		} else {
			do {
				System.out.print("Digite A caso queira atualizar o endereco ou R se quiser remover o CPF e o endereco da lista: ");
				resposta = teclado.nextLine();
				if (resposta.equalsIgnoreCase("A")) {
					System.out.print("Informe o novo endereco: ");
					enderecos.set(posicao, teclado.nextLine());
					System.out.println("Endereco atualizado com sucesso!");
					break;
				} else if (resposta.equalsIgnoreCase("R")) {
					cpfs.remove(posicao);
					enderecos.remove(posicao);
					System.out.println("Endereco removido com sucesso!");
					break;
				} else {
					System.out.print("Valor invalido! ");
				}
			} while (!(resposta.equalsIgnoreCase("A") || resposta.equalsIgnoreCase("R")));
		}
		
		System.out.println("\nCPFs e enderecos de todas as pessoas cadastradas no sistema");
		for (int i=0; i<cpfs.size(); i++) {
			System.out.printf("CPF: %-30sEnderecos: %s\n", cpfs.get(i), enderecos.get(i));
		}
		
		teclado.close();
	}
}
