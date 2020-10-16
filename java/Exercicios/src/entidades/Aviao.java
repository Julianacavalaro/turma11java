package entidades;

public class Aviao {

	public String nome;
	public String destino;
	public int numeroPassagem;
	public char escalas;
	
	public Aviao() {
		super();
	}

	public Aviao(String nome, String destino, int numeroPassagem, char escalas) {
		super();
		this.nome = nome;
		this.destino = destino;
		this.numeroPassagem = numeroPassagem;
		this.escalas = escalas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getNumeroPassagem() {
		return numeroPassagem;
	}

	public void setNumeroPassagem(int numeroPassagem) {
		this.numeroPassagem = numeroPassagem;
	}

	public char getEscalas() {
		return escalas;
	}

	public void setEscalas(char escalas) {
		this.escalas = escalas;
	}
	
	
}
