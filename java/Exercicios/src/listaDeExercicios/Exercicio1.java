package listaDeExercicios;

public class Exercicio1 {
	
	public static void main(String[] args) {
		/*
		 * 1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos 
		 * seletores (getters) e modificadores (setters), e ainda o construtor padr�o e pelo 
		 * menos mais duas op��es de construtores conforme sua percep��o. Atributos: String nome;
		 *  String endere�o; String telefone; 
		 */
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Juliana");
		pessoa1.setTelefone(99998888);
		pessoa1.setEndereco("Rua do Sab�o Cr�");
		System.out.println("Nome: "+ pessoa1.getNome()+"\nTelefone: "+ pessoa1.getTelefone()+ "\nEndere�o: "+pessoa1.getEndereco());
	}

}
