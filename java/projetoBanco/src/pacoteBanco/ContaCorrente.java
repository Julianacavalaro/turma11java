package pacoteBanco;

public class ContaCorrente extends ContaBancaria {
	private int talionario;

	public ContaCorrente() {
		super();
	}
	/*public ContaCorrente(int numero) {
		super(numero);
	}*/

	public ContaCorrente(int talionario) {
		super();
		this.talionario = talionario;
	}
	public ContaCorrente(String nome) {
		super(nome);
	}
	
	public ContaCorrente(double saldo) {
	super(saldo);
	}
	public int getTalionario() {
	return talionario;
	}
	public int setTalionario(int talionario) {
		return this.talionario = talionario;
	}
	public int emiteTalionario() {
		return this.talionario++;
	}
	
	

}
