package faculdade.pratica.modulo1.comandoswitch;

import java.util.Scanner;

public class C07ex02 {
	public static void main(String[] args) {
		String nome;
		int nota1, nota2, nota3, media;
		char conceito = ' ';
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o nome do aluno: ");
		nome = teclado.nextLine();
		System.out.println("Informe a seguir as notas inteiras de 0 a 10 de "+nome);
		System.out.print("Nota 1: ");
		nota1 = teclado.nextInt();
		
		if (nota1>=0 && nota1<=10) {
			System.out.print("Nota 2: ");
			nota2 = teclado.nextInt();
			if (nota2>=0 && nota2<=10) {
				System.out.print("Nota 3: ");
				nota3 = teclado.nextInt();
				if (nota3>=0 && nota3<=10) {
					media = (nota1+nota2+nota3)/3;
					switch (media) {
						case 1: case 2: case 3: case 4:
							conceito = 'E';
							break;
						case 5: case 6:
							conceito = 'D';
							break;
						case 7:
							conceito = 'C';
							break;
						case 8:
							conceito = 'B';
							break;
						case 9: case 10:
							conceito = 'A';
							break;
					}
					System.out.println();
					System.out.println("Nome do aluno: "+nome+"\nConceito: "+conceito);
				} else {
					System.out.println("Valor Invalido!");
				}
			} else {
				System.out.println("Valor Invalido!");
			}
		} else {
			System.out.println("Valor Invalido!");
		}
		teclado.close();
	}
}