package polimorfismo;

public class Cavalo extends Animal{
	private String somCavalo;
	private String acaoCavalo;

	
	
	public Cavalo() {
		super();
	}


	public Cavalo(String nome, int idade, String somCavalo, String acaoCavalo) {
		super(nome, idade);
		this.somCavalo = somCavalo;
		this.acaoCavalo = acaoCavalo;
	
	}
	public Cavalo(String somCavalo, String tipo) {
		super();
		this.somCavalo = somCavalo;
	
	}
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}


	public String getNome() {
		return "Nome do animal: "+super.getNome()+"\nIdade: "+super.getIdade();
		}

	public String getSomCavalo() {
		 return "Rrrrrrrrrr!";
	}


	public void setSomCavalo(String somCavalo) {
		this.somCavalo = somCavalo;
	}


	public String getAcaoCavalo() {
		return "Correr Trotar";
	}
	public void setAcaoCavalo(String acaoCavalo) {
		this.acaoCavalo = acaoCavalo;
	}
	public String setAcaoCavalo() {
		return "Correr Trotar";
	}
	//MEUS METODOS MINHAS REGRAS
	public void emitirSom()
	{
		System.out.println("Rrrrrrrrrr!");
	}
}
