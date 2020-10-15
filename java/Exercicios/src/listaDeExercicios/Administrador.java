package listaDeExercicios;

public class Administrador extends Pessoa {
	
	private double ajudaDeCusto;

	public Administrador() {
		super();
	}

	public Administrador(String nome, int telefone, String endereco, double ajudaDeCusto) {
		super(nome, telefone, endereco);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	

}
