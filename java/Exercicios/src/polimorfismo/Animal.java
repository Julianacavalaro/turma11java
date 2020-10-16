package polimorfismo;

public class Animal {
	
	//ATRIBUTOS
	private String nome;
	private int idade;
	
	//CONSTRUTOR PADRÃO-> (vazia) (mesmo nome da classe)
	public Animal() {
		super();
	}
	//SOBRECARGA DO CONSTRUTOR (mesmo nome da classe)
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	
	}
	//ENCAPSULAMENTO = DEIXAR OS DADOS SEGUROS
	//METODO GET E SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	//MEUS METODOS MINHAS REGRAS
	public void emiteNomeEIdade(String nome, int idade) {
		
		System.out.println("Nome do animal: "+ nome +"\nIdade do animal: "+ idade);
		
	}
	
	
}
