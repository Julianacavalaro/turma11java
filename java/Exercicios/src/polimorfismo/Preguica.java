package polimorfismo;

public class Preguica extends Animal{
	private String somPreguica;
	private String acaoPreguica;
	
	public Preguica() {
		super();
	}

	public Preguica(String nome, int idade, String somPreguica, String acaoPreguica) {
		super(nome, idade);
		this.somPreguica = somPreguica;
		this.acaoPreguica = acaoPreguica;
	}

	public String getNome() {

		return "Nome do animal: "+super.getNome()+"\nIdade: "+super.getIdade();
		}
	
	public String getSomPreguica() {
		return "Zzzzzz";
	}

	public void setSomPreguica(String somPreguica) {
		this.somPreguica = somPreguica;
	}

	public String getAcaoPreguica() {
		return "Subir em árvore";
	}

	public void setAcaoPreguica(String acaoPreguica) {
		this.acaoPreguica = acaoPreguica;
	}
	//MEUS METODOS MINHAS REGRAS
	public void emitirSom()
	{
		System.out.println("Zzzzzz");
	}
	
}
