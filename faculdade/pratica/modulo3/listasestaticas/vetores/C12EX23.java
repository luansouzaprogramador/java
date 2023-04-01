package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;
// import java.util.Arrays;

public class C12EX23 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[100];
		String[] placas = new String[nomes.length];
		String procura;
		int posicao1=-1, posicao2=-1;
		
		System.out.println("Informe a seguir o nome e o carro dos "+nomes.length+" moradores do edificio.\n");
		for (int i=0; i<nomes.length; i++) {
			System.out.print("Informe o nome da "+(i+1)+"_a pessoa: ");
			nomes[i] = teclado.nextLine();
			System.out.print("Informe a placa do carro de "+nomes[i]+": ");
			placas[i] = teclado.nextLine();
			System.out.println();
		}
		
		System.out.print("\nInforme a placa do carro ou o nome do morador: ");
		procura = teclado.nextLine();
		
		for (int i=0; i<nomes.length; i++) {
			if (procura.equalsIgnoreCase(nomes[i])) {
				posicao1 = i;
				break;
			}
		}
		for (int i=0; i<placas.length; i++) {
			if (procura.equalsIgnoreCase(placas[i])) {
				posicao2 = i;
				break;
			}
		}
		
		if (posicao1==-1 && posicao2==-1) {
			System.out.println("\nA pessoa nao reside no edificio.");
		} else {
			if (posicao1>=0 && posicao2==-1) {
				System.out.println("\n"+nomes[posicao1]+" mora no edificio e tem um carro estacionado na garagem na vaga "+(posicao1+1)+".");
			}
			if (posicao1==-1 && posicao2>=0) {
				System.out.println("\n"+nomes[posicao2]+", proprietario(a) do veiculo informado, mora no edificio e tem um carro estacionado na garagem na vaga "+(posicao2+1)+".");
			}
		}
		
		/*
		posicao1 = Arrays.binarySearch(nomes, procura);
		posicao2 = Arrays.binarySearch(placas, procura);
		
		if (posicao1<0 && posicao2<0) {
			System.out.println("\nA pessoa nao reside no edificio.");
		} else {
			if (posicao1>=0 && posicao2<0) {
				System.out.println("\n"+nomes[posicao1]+" mora no edificio e tem uma carro estacionado na garagem na vaga "+(posicao1)+1);
			}
			if (posicao1<0 && posicao2>=0) {
				System.out.println("\n"+nomes[posicao2]+" mora no edificio e tem um carro estacionado na garagem na vaga "+(posicao2+1));
			}
		}
		*/
		
		teclado.close();
	}
}
