package pacoteBanco;

public class ContaEspecial extends ContaCorrente {
	private double limite;

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(double limite) {
		super();
		this.limite = limite;
	}
	

	public ContaEspecial(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double calculaJuros(double saldo ) {
		return super.getSaldo()*0.05 ;
	}

}
