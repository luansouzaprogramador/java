package faculdade.pratica.modulo3.listasestaticas.vetores;

import java.util.Scanner;

public class C12EX14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomesCidades = new String[100];
		String[] nomesEstados = new String[nomesCidades.length];
		String tempNomesCidades, tempNomesEstados;
		int[] populacao = new int[nomesCidades.length];
		int cont = nomesCidades.length-1, auxPopulacao;
		
		System.out.println("Informe a seguir o nome, o estado e a pupulacao de "+nomesCidades.length+" cidades.");
		for (int i=0; i<nomesCidades.length; i++) {
			System.out.print("\nInforme o nome da "+(i+1)+"_a cidade: ");
			nomesCidades[i] = teclado.nextLine();
			System.out.print("Informe o nome do Estado que a cidade de "+nomesCidades[i]+" pertence: ");
			nomesEstados[i] = teclado.nextLine();
			System.out.print("Informe a quantidade de habitantes de "+nomesCidades[i]+": ");
			populacao[i] = teclado.nextInt();
			while (populacao[i]<0) {
				System.out.print("Valor invalido, informe a populacao novamente: ");
				populacao[i] = teclado.nextInt();
			}
			teclado.nextLine();
		}
		
		for (int i=0; i<populacao.length-1; i++) {
			for (int j=0; j<cont; j++) {
				if (populacao[j]<populacao[j+1]) {
					auxPopulacao = populacao[j];
					populacao[j] = populacao[j+1];
					populacao[j+1] = auxPopulacao;
					tempNomesCidades = nomesCidades[j];
					nomesCidades[j] = nomesCidades[j+1];
					nomesCidades[j+1] = tempNomesCidades;
					tempNomesEstados = nomesEstados[j];
					nomesEstados[j] = nomesEstados[j+1];
					nomesEstados[j+1] = tempNomesEstados;
				}
			}
			cont--;
		}
		
		System.out.println("\nNome das 10 cidades informadas com a maior populacao e dos Estados que cada uma pertence:\n");
		for (int i=0; i<10; i++) {
			System.out.printf("Cidade: %-35sEstado: %-25sPopulacao: %d\n", nomesCidades[i], nomesEstados[i], populacao[i]);
		}
		
		teclado.close();
	}
}
