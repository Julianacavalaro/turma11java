package entidades;

public class Cliente {
	
	 //ATRIBUTOS ABAIXO 
	public String nome;
	public String empresa;
	public String cidade;
	public String email;	
	public int anoNascimento;
	public char sexo;

	//CONSTRUTOR (mesmo nome da classe)
	public Cliente (String nome, char sexo , int anoNascimento) {
		this.nome = nome;
		this.sexo = sexo;
		this.anoNascimento = anoNascimento;

	}
	//METODO (só usa dentro da classe)
	public int idade () {
		return 2020 - anoNascimento; 
	}
}