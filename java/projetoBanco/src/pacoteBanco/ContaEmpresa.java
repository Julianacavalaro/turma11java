package pacoteBanco;

public class ContaEmpresa extends ContaBancaria{
	private double limiteEmpresa;

	public ContaEmpresa() {
		super();
	}

	public ContaEmpresa(double limiteEmpresa) {
		super();
		this.limiteEmpresa = limiteEmpresa;
	}

	public ContaEmpresa(String nome) {
		super(nome);
	}

	public ContaEmpresa(int numero) {
		super(numero);
	}
	

	public ContaEmpresa(double saldo, double limiteEmpresa) {
		super(saldo);
		this.limiteEmpresa = limiteEmpresa;
	}

	public double getLimiteEmpresa() {
		return limiteEmpresa;
	}

	public void setLimiteEmpresa(double limiteEmpresa) {
		this.limiteEmpresa = limiteEmpresa;
	}
	public double emprestimoEmpresa(double limiteEmpresa) {
		return this.limiteEmpresa*2;
	}
	
	}
	
	


