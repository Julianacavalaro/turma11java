package polimorfismo;

import java.util.ArrayList;
import java.util.Collection;

public class EstoqueLoja {

	public static void main(String[] args) {
		/*Crie uma um programa para trabalhar com estoque de uma loja,
		 *  o programa dever� trabalhar com Collection do tipo List do 
		 *  Java para manipular os dados desse estoque, o programa dever�
		 *   atender as seguintes funcionalidades:
			Armazenar dados da List
			Remover dados da list;
			Atualizar dados da list.
			Apresentar todos os dados da list.*/
		
		Collection <String>nomes = new ArrayList();
		nomes.add("Cal�a");
		nomes.add("Camisa");
		nomes.add("Vestido");
		nomes.add("Blusa");
	
		System.out.println("Lista de itens: "+nomes);
		nomes.remove("Cal�a");
		System.out.println("Lista de itens: "+nomes);
		nomes.clear();
		System.out.println("Lista de itens: "+nomes);
	}

}
