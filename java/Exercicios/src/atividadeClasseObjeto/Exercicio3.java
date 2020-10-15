package atividadeClasseObjeto;

import java.util.Scanner;

import entidades.ProdutoEletronico;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * 3) Crie uma classe produto eletrônico e apresente os atributos e métodos 
		 * referentes esta classe, em seguida crie um objeto produto eletrônico, defina 
		 * as instancias deste objeto e apresente as informações deste objeto no console.
		 */
		
		Scanner leia = new Scanner(System.in);
		ProdutoEletronico produtoEletronico = new ProdutoEletronico();
		
		System.out.println("Digite a marco do produto: ");
		produtoEletronico.marca = leia.next();
		
		System.out.println("Digite o preço: ");
		produtoEletronico.preco = leia.nextDouble();
		
		System.out.println("Digite a quantidade: ");
		produtoEletronico.quantidade = leia.nextInt();
	
		System.out.println("Marca do produto: "+produtoEletronico.marca);
		System.out.println("Preço unitário: "+produtoEletronico.preco);
		System.out.println("Quantidade: "+produtoEletronico.quantidade);
	}

}
