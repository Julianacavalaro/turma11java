package polimorfismo;

import java.util.ArrayList;
import java.util.Collection;

public class EstoqueLoja {

	public static void main(String[] args) {
		/*Crie uma um programa para trabalhar com estoque de uma loja,
		 *  o programa deverá trabalhar com Collection do tipo List do 
		 *  Java para manipular os dados desse estoque, o programa deverá
		 *   atender as seguintes funcionalidades:
			Armazenar dados da List
			Remover dados da list;
			Atualizar dados da list.
			Apresentar todos os dados da list.*/
		
		Collection <String>estoque = new ArrayList();
		estoque.add("Calça");
		estoque.add("Camisa");
		estoque.add("Vestido");
		estoque.add("Blusa");
	
		System.out.println("Lista de itens: "+estoque);
		estoque.remove("Calça");
		System.out.println("Lista de itens: "+estoque);
		estoque.clear();
		System.out.println("Lista de itens: "+estoque);
	}

}
