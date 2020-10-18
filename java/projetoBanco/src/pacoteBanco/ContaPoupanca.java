package pacoteBanco;

public class ContaPoupanca extends ContaBancaria {
	private double juros;
	private double corrMonetaria;
	private int mesAniversario;
	
	
	public ContaPoupanca() {
		super();
	}
	public ContaPoupanca(String nome, int numero, double saldo, double juros, double corrMonetaria,
			int mesAniversario) {
		super(nome, numero, saldo);
		this.juros = juros;
		this.corrMonetaria = corrMonetaria;
		this.mesAniversario = mesAniversario;
	}
	public ContaPoupanca(String nome, int numero, double saldo) {
		super(nome, numero, saldo);
	}
	public ContaPoupanca(double saldo, double corrMonetaria) {
		super(saldo);
		this.corrMonetaria = corrMonetaria;
	}
	public ContaPoupanca(double saldo, int mesAniversario) {
		super(saldo);
		this.mesAniversario = mesAniversario;
	}
	public ContaPoupanca(int numero, double saldo, double juros) {
		super(numero, saldo);
		this.juros = juros;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public double getCorrMonetaria() {
		return corrMonetaria;
	}

	public void setCorrMonetaria(double corrMonetaria) {
		this.corrMonetaria = corrMonetaria;
	}

	public int getMesAniversario() {
		return mesAniversario;
	}

	public void setMesAniversario(int mesAniversario) {
		this.mesAniversario = mesAniversario;
	}
	@Override
	public String toString() {
		return  "\t\tContaBancaria\n[nome: " + super.getNome() + ", numero: " + super.getNumero() + " saldo: " + super.getSaldo() + "]";
	}
	public double ganhoAniversario(double saldo) {
		return super.getSaldo()*0.03;
	}
	public double ganhoJuros(double saldo) {
		return super.getSaldo()*0.003;
	}
	
	
	

}
