package faculdade.pratica.modulo1.expressoesbooleanas;

import java.util.Scanner;

public class C06ex17 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String temCursoTecnico, temCursoSuperior, temMenosDe3AnosDeExperiencia, eCriativo, prefereLiderar, prefereTrabalharSozinho, eAutordidata, aceitariaRemuneracaoInicial1500, soTrabalhariaEmBH;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Afim de conhecer melhor o seu perfil profissional, responda VERDADEIRO ou FALSO para cada uma das perguntas abaixo.");
		System.out.print("\nVocê tem curso técnico de programação? ");
		temCursoTecnico = teclado.nextLine();
		System.out.print("Você tem curso superior de programação? ");
		temCursoSuperior = teclado.nextLine();
		System.out.print("Você tem menos de 3 anos de experiência em programação? ");
		temMenosDe3AnosDeExperiencia = teclado.nextLine();
		System.out.print("Você se considera uma pessoa criativa? ");
		eCriativo = teclado.nextLine();
		System.out.print("Você prefere liderar a ser liderado? ");
		prefereLiderar = teclado.nextLine();
		System.out.print("Você prefere trabalhar sozinho a trabalhar em equipe? ");
		prefereTrabalharSozinho = teclado.nextLine();
		System.out.print("Você é autodidata (aprende sozinho)? ");
		eAutordidata = teclado.nextLine();
		System.out.print("Você aceitaria uma remuneração inicial de R$1500,00? ");
		aceitariaRemuneracaoInicial1500 = teclado.nextLine();
		System.out.print("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH? ");
		soTrabalhariaEmBH = teclado.nextLine();
		
		if (temCursoTecnico.equalsIgnoreCase("VERDADEIRO")) {
			
		}
	}
}