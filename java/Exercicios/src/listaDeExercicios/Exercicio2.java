package listaDeExercicios;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 2. Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe Fornecedor. 
		 * Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos que caracterizam a 
		 * classe Pessoa, os atributos valorCredito (correspondente ao cr�dito m�ximo atribu�do ao fornecedor) e
		 *  valorDivida (montante da d�vida para com o fornecedor). Implemente na classe Fornecedor, para al�m dos 
		 *  usuais m�todos seletores e modificadores, um m�todo obterSaldo() que devolve a diferen�a entre os valores 
		 *  dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor, crie um programa de 
		 *  teste adequado que lhe permita verificar o funcionamento dos m�todos implementados na classe Fornecedor e 
		 *  os herdados da classe Pessoa. 
		 */
		//Pessoa pessoaQualquer = new Pessoa("Ed", 34210977);
		//Fornecedor fornecedor1 = new Fornecedor("Magazine", 434343);
		Fornecedor fornecedor2 = new Fornecedor("Casas Bahia", 434343, 10002.3 , 50.55);
		
		fornecedor2.setValorDivida(500.98);
		
		System.out.println("Saldo da "+fornecedor2.getNome()+" "+fornecedor2.obterSaldo());
		
	}

}
