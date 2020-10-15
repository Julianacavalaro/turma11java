package listaDeExercicios;

public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, int telefone) {
		super(nome, telefone);
	}
	

	public Fornecedor() {
		super();
	}


	public Fornecedor(String nome, int telefone, double valorCredito, double valorDivida) {
		super(nome, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double obterSaldo () {
		return (valorCredito - valorDivida) ;
	}

}
