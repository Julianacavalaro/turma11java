package atividadeClasseObjeto;

public class ClienteExercicio {
	
	//ATRIBUTOS
	public String nome;
	public char sexo;
	public int anoNascimento;
	public char tipo;
	
	//CONSTRUTOR (mesmo nome da classe)
	public ClienteExercicio(String nome) {
		this.nome = nome;
		
	}
	
	//SOBRECARGA DO CONSTRUTOR (mesmo nome da classe)
	public ClienteExercicio(String nome, char sexo) {
		this.nome = nome;
		this.sexo = sexo;
		
	}
	
	//SOBRECARGA DO CONSTRUTOR (mesmo nome da classe)
	public ClienteExercicio(String nome, char sexo , int anoNascimento) {
		this.nome = nome;
		this.sexo = sexo;
		this.anoNascimento = anoNascimento;
		
	}
	//METODO (só usa dentro da classe)
	public int idade () {
		return 2020 - anoNascimento; 
	}
}
