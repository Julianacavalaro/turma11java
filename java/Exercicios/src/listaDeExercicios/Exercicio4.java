package listaDeExercicios;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4. Implemente a classe Administrador como subclasse da classe pessoa.
		 *  Um determinado administrador tem como atributos da classe Pessoa e 
		 *  também os atributos próprios como ajudaDeCusto (ajudas referentes a viagens, estadias).
		 */
		
		Administrador administrador1 = new Administrador();
		administrador1.setNome("Juliana");
		administrador1.setTelefone(99998888);
		administrador1.setEndereco("Rua do Sabão Crá");
		administrador1.setAjudaDeCusto(500.95);
		
		System.out.println("Nome: "+ administrador1.getNome());
		System.out.println("Telefone: "+ administrador1.getTelefone());
		System.out.println("Endereço: "+ administrador1.getEndereco());
		System.out.println("Ajuda de custo: "+ administrador1.getAjudaDeCusto());
		

	}

}
