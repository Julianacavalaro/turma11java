package polimorfismo;

public class Cachorro extends Animal {
	private String somCachorro;
	private String acaoCachorro;
	
	public Cachorro() {
		super();
	}

	public Cachorro(String nome, int idade, String somCachorro, String acaoCachorro) {
		super(nome, idade);
		this.somCachorro = somCachorro;
		this.acaoCachorro = acaoCachorro;
	}
	public String getNome() {

	return "Nome do animal: "+super.getNome()+"\nIdade: "+super.getIdade();
	}
	public String getSomCachorro() {
		return "Au au au!";
	}

	public void setSomCachorro(String somCachorro) {
		this.somCachorro = somCachorro;
	}

	public String getAcaoCachorro() {
		return "Correr";
	}

	public void setAcaoCachorro(String acaoCachorro) {
		this.acaoCachorro = acaoCachorro;
	}

	//MEUS METODOS MINHAS REGRAS
	public void emitirSom()
	{
		System.out.println("Au au au!");
	}

}
	
	


