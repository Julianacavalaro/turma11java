package atividadeClasseObjeto;

import java.util.Scanner;

import entidades.ProdutoEletronico;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * 3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos 
		 * referentes esta classe, em seguida crie um objeto produto eletr�nico, defina 
		 * as instancias deste objeto e apresente as informa��es deste objeto no console.
		 */
		
		Scanner leia = new Scanner(System.in);
		ProdutoEletronico produtoEletronico = new ProdutoEletronico();
		
		System.out.println("Digite a marco do produto: ");
		produtoEletronico.marca = leia.next();
		
		System.out.println("Digite o pre�o: ");
		produtoEletronico.preco = leia.nextDouble();
		
		System.out.println("Digite a quantidade: ");
		produtoEletronico.quantidade = leia.nextInt();
	
		System.out.println("Marca do produto: "+produtoEletronico.marca);
		System.out.println("Pre�o unit�rio: "+produtoEletronico.preco);
		System.out.println("Quantidade: "+produtoEletronico.quantidade);
	}

}
