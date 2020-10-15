package listaDeExercicios;

public class Exercicio1 {
	
	public static void main(String[] args) {
		/*
		 * 1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos 
		 * seletores (getters) e modificadores (setters), e ainda o construtor padrão e pelo 
		 * menos mais duas opções de construtores conforme sua percepção. Atributos: String nome;
		 *  String endereço; String telefone; 
		 */
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Juliana");
		pessoa1.setTelefone(99998888);
		pessoa1.setEndereco("Rua do Sabão Crá");
		System.out.println("Nome: "+ pessoa1.getNome()+"\nTelefone: "+ pessoa1.getTelefone()+ "\nEndereço: "+pessoa1.getEndereco());
	}

}
