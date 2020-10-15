package listaDeExercicios;

public class Operario extends Pessoa {
		 
	private double valorProducao;
	private double comissao;
	
	public Operario() {
		super();
	}

	public Operario(String nome, int telefone, String endereco, double valorProducao, double comissao) {
		super(nome, telefone, endereco);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
