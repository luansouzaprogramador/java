package faculdade.pratica.modulo3.listasdinamicas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class C12EX27 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<String> cpfs = new ArrayList<String>();
		List<String> enderecos = new ArrayList<String>();
		String cpf, endereco, resposta;
		int i=1, posicao=-1;
		
		System.out.println("Informe a seguir o cpf e o endereco de varias pessoas.\n");
		
		do {
			System.out.print("Informe o cpf da "+i+"a pessoa (digite X para encerrar): ");
			cpf = teclado.nextLine();
			if (!cpf.equalsIgnoreCase("X")) {
				cpfs.add(cpf);
				System.out.print("Informe o seu endereco: ");
				endereco = teclado.nextLine();
				enderecos.add(endereco);
				i++;
			}
		} while (!cpf.equalsIgnoreCase("X"));
		
		System.out.println();
		
		do {
			System.out.print("Digite o cpf que deseja procurar: ");
			cpf = teclado.nextLine();
			for (i=0; i<cpfs.size(); i++) {
				if (cpfs.get(i).equalsIgnoreCase(cpf)) {
					posicao = i;
					break;
				}
			}
			if (posicao == -1) {
				System.out.println("O cpf informado nao foi encontrado!");
			}
		} while(posicao == -1);
		
		do {
			System.out.print("Digite A se deseja alterar o endereco ou R caso queira remover o cpf e o endereco da lista: ");
			resposta = teclado.nextLine();
			if (resposta.equalsIgnoreCase("A")) {
				System.out.print("Informe, por gentileza, o novo endereco: ");
				endereco = teclado.nextLine();
				enderecos.set(posicao, endereco);
				System.out.println("Endereco atualizado com sucesso!");
			} else if (resposta.equalsIgnoreCase("R")) {
				cpfs.remove(posicao);
				enderecos.remove(posicao);
				System.out.println("CPF e endereco removidos com sucesso!");
			} else {
				System.out.print("Opção inválida! ");
			}
		} while (!(resposta.equalsIgnoreCase("A") || resposta.equalsIgnoreCase("R")));
		
		System.out.println("\nDados de todas as pessoas cadastradas no sistema.\n");
		for (i=0; i<cpfs.size(); i++) {
			System.out.printf("cpf: %-30sEndereco: %s\n", cpfs.get(i), enderecos.get(i));
		}
		
		teclado.close();
	}
}
