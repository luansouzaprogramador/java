package faculdade.pratica.modulo3.conceitosbasicosdepoo;

public class Produto {
	private String nomeProduto, marca, codigo;
	private double preco;
	private int quantidade;
	
	public void Produto(double saldo, int quantidade) {
		if (saldo>=this.preco && quantidade>=this.quantidade) {
			System.out.println("Compra aprovada!");
			System.out.println("Troco: R$"+(saldo-this.preco));
			this.quantidade--;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void imprimeProduto() {
		System.out.println("Nome: "+this.nomeProduto);
		System.out.println("Marca: "+this.marca);
		System.out.println("Codigo: "+this.codigo);
		System.out.println("Preco: R$"+this.preco);
		System.out.println("Quantidade: "+this.quantidade);
	}
	
	public double desconto(int quantidade) {
		double desconto;
		if (this.preco*quantidade>=100) {
			desconto = this.preco*quantidade*0.1;
		} else if (this.preco*quantidade<=500) {
			desconto = this.preco*quantidade*0.5;
		} else {
			desconto = this.preco*quantidade*0.2;
		}
		return desconto;
	}
	
	public String getNomeProduto() {
		return this.nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
