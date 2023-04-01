package faculdade.pratica.modulo3.criandoprojetos.projeto2;

import java.util.Scanner;

public class MenuPrincipal {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int opcao = -1;
		double area = 0;
		
		while (opcao!=0) {
			System.out.println("Informe a opcao desejada:");
			System.out.println("1 - Calcula a area de um quadrado");
			System.out.println("2 - Calcula a area de um retangulo");
			System.out.println("3 - Calcula a area de um triangulo retangulo");
			System.out.println("4 - Calcula a area de um circulo");
			System.out.println("0 - Sair");
			System.out.print(">>> ");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1:
				area = CalculaAreaPoligonos.AreaQuadrado();
				break;
			case 2:
				area = CalculaAreaPoligonos.AreaRetangulo();
				break;
			case 3:
				area = CalculaAreaPoligonos.AreaTrianguloRetangulo();
				break;
			case 4:
				area = CalculaAreaPoligonos.AreaCirculo();
				break;
			case 0:
				break;
			default:
				System.out.println("OPCAO INVALIDA\n");
				break;
			}
			
			if (opcao>=1 && opcao<=4) {
				System.out.printf("Valor da area = %.2f\n\n", area);
			}
		}
		System.out.println("FIM DO PROGRAMA!");
	}
}
