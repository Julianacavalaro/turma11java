package listaDeExercicios;

public class Empregado extends Pessoa {

	 private int codigoSetor;
	 private double salarioBase;
	 private double imposto;
	
	 public Empregado() {
	}

	public Empregado(String nome, int telefone, String endereco, int codigoSetor, double salarioBase, double imposto) {
		super(nome, telefone, endereco);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	public Empregado(String nome) {
		super(nome);
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	 
	public double calcularSalario() {
		return salarioBase - imposto;
	}
	 
	 
}
