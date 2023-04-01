package faculdade.pratica.modulo3.conceitosbasicosdepoo;

public class UtilizaLivro {
	public static void main(String[] args) {
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		
		livro1.setNomeProduto("Livro");
		livro1.setNomeLivro("O fazedor de velhos");
		livro1.setNomeAutor("Rodrigo Lacerda");
		livro1.setNomeEditora("Companhia das Letras");
		livro1.setGenero("Romance");
		livro1.setQtdePag(183);
		livro1.setCodigo("10235.28293-92");
		livro1.setPreco(54.9);
		livro1.setQuantidade(150);
		
		livro2.setNomeProduto("Livro");
		livro2.setNomeLivro("O poder do habito");
		livro2.setNomeAutor("Charles Duhigg");
		livro2.setNomeEditora("Objetiva");
		livro2.setGenero("Livro de autoajuda");
		livro2.setQtdePag(513);
		livro2.setCodigo("92738.91735-108");
		livro2.setPreco(47.9);
		livro2.setQuantidade(548);
		
		livro3.setNomeProduto("Livro");
		livro3.setNomeLivro("O Pequeno Principe");
		livro3.setNomeAutor("Antoine de Saint-Exupery");
		livro3.setNomeEditora("Agir");
		livro3.setGenero("Fabula");
		livro1.setQtdePag(98);
		livro3.setCodigo("637492.918264-92");
		livro3.setPreco(18.69);
		livro3.setQuantidade(75);
		
		System.out.println("================ Objetos criados ================\n");
		livro1.imprimeProduto();
		livro2.imprimeProduto();
		livro3.imprimeProduto();
	}
}
