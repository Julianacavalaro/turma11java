package entidades;

public class ProdutoEletronico {
	
	public String marca;
	public double preco;
	public int quantidade;
	
	public ProdutoEletronico() {
		super();
	}

	public ProdutoEletronico(String marca, double preco, int quantidade) {
		super();
		this.marca = marca;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
		
	
}
