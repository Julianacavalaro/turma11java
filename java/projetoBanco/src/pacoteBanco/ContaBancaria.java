package pacoteBanco;

public class  ContaBancaria {
	//ATRIBUTOS
	private String nome;
	private int numero;
	private double saldo;
	
	//CONSTRUTOR PADRÃO-> (vazia) (mesmo nome da classe)
	public ContaBancaria() {
	}

	//CONSTRUTOR (mesmo nome da classe)
	public ContaBancaria(String nome, int numero, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}
	//SOBRECARGA DO CONSTRUTOR (mesmo nome da classe)
	public ContaBancaria(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		
	}
	public ContaBancaria(int numero) {
		super();
		this.numero = numero;
	}
	

	public ContaBancaria(double saldo) {
		super();
		this.saldo = saldo;
	}
	

	public ContaBancaria(String nome) {
		super();
		this.nome = nome;
	}

	//ENCAPSULAMENTO = DEIXAR OS DADOS SEGUROS
	//METODO GET E SET

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	/*public void setSaldo(double saldo) {
		this.saldo = saldo;
	}*/
	
	//MEUS METODOS MINHAS REGRAS
	public void emiteExtrato(double saldo) {
		
		this.saldo= saldo;
		
	}

	
	
	public double depositar(double valor) {
		return saldo += valor;
	}
	
	public boolean sacar(double valor) {
		
		if((saldo - valor)>=0) {
			 saldo -= valor; 
			return true;
			
		}
		else{
			return false;
			
		}
		
	
		
	}
	
	@Override
	public String toString() {
		return "\t\tContaBancaria\n[nome: " + nome + ", numero: " + numero + " saldo: " + saldo + "]";
	}
	

}
