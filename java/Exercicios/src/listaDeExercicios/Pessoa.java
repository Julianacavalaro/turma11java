package listaDeExercicios;

public class Pessoa {
	//ATRIBUTOS
	private String nome;
	private String endereco;
	private int telefone;
	
	//CONSTRUTOR PADRÃO-> (vazia) (mesmo nome da classe)
	public Pessoa () {
	}
	
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}


	//SOBRECARGA DO CONSTRUTOR (mesmo nome da classe)
	public Pessoa (String nome, int telefone , String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	//SOBRECARGA DO CONSTRUTOR (mesmo nome da classe)
	public Pessoa (String nome, int telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	//METODO GET E SET (ENCAPSULAMENTO)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	

}
