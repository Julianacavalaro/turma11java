package listaDeExercicios;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 2. Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor. 
		 * Considere que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a 
		 * classe Pessoa, os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e
		 *  valorDivida (montante da dívida para com o fornecedor). Implemente na classe Fornecedor, para além dos 
		 *  usuais métodos seletores e modificadores, um método obterSaldo() que devolve a diferença entre os valores 
		 *  dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor, crie um programa de 
		 *  teste adequado que lhe permita verificar o funcionamento dos métodos implementados na classe Fornecedor e 
		 *  os herdados da classe Pessoa. 
		 */
		//Pessoa pessoaQualquer = new Pessoa("Ed", 34210977);
		//Fornecedor fornecedor1 = new Fornecedor("Magazine", 434343);
		Fornecedor fornecedor2 = new Fornecedor("Casas Bahia", 434343, 10002.3 , 50.55);
		
		fornecedor2.setValorDivida(500.98);
		
		System.out.println("Saldo da "+fornecedor2.getNome()+" "+fornecedor2.obterSaldo());
		
	}

}
