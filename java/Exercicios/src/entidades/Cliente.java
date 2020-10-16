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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	//METODO (só usa dentro da classe)
	public int idade () {
		return 2020 - anoNascimento; 
	}
}