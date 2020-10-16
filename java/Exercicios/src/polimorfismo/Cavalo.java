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


	public String getSomCavalo() {
		return somCavalo;
	}


	public void setSomCavalo(String somCavalo) {
		this.somCavalo = somCavalo;
	}


	public String getAcaoCavalo() {
		return acaoCavalo;
	}



	public void setAcaoCavalo(String acaoCavalo) {
		this.acaoCavalo = acaoCavalo;
	}
	//MEUS METODOS MINHAS REGRAS
	public void emitirSom()
	{
		System.out.println("Rrrrrrrrrr!");
	}
	public void emitirAcao() {
		System.out.println("Correr Trotar");
	}
	
}
