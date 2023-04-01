package faculdade.pratica.modulo3.conceitosbasicosdepoo;

public class Livro extends Produto {
	private String nomeLivro, nomeAutor, nomeEditora, genero;
	private int qtdePag;
	
	public int Livro(int anoAtual, int anoLancamento) {
		return anoAtual-anoLancamento;
	}
	
	public void imprimeProduto() {
		System.out.println("Nome do produto: "+this.getNomeProduto());
		System.out.println("Nome do Livro: "+this.nomeLivro);
		System.out.println("Nome do autor: "+this.nomeAutor);
		System.out.println("Nome da editora: "+this.nomeEditora);
		System.out.println("Genero: "+this.genero);
		System.out.println("Quantidade de paginas: "+this.qtdePag);
		System.out.println("Codigo: "+this.getCodigo());
		System.out.println("Preco: R$"+this.getPreco());
		System.out.println("Quantidade: "+this.getQuantidade());
		System.out.println("-------------------------------------------------");
	}
	
	public String getNomeLivro() {
		return this.nomeLivro;
	}
	
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	
	public String getNomeAutor() {
		return this.nomeAutor;
	}
	
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	
	public String getNomeEditora() {
		return nomeEditora;
	}
	
	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}
	
	public int getQtdePag() {
		return this.qtdePag;
	}
	
	public void setQtdePag(int qtdePag) {
		this.qtdePag = qtdePag;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
}
