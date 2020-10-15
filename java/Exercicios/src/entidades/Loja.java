package entidades;

import java.util.Scanner;

import atividadeClasseObjeto.ClienteExercicio;

public class Loja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		//INSTANCIAR
		ClienteExercicio cliente1 = new ClienteExercicio("Juliana", 'F', 1991);
		ClienteExercicio cliente2 = new ClienteExercicio("Jonhatan", 'M');
		ClienteExercicio cliente3 = new ClienteExercicio("Zaine", 'F' , 1991);
		
		System.out.println("Digite o nome do usuario: ");
		cliente1.nome = leia.next();
		System.out.println(cliente1.nome);
		System.out.println(cliente3.nome);
		System.out.println(cliente1.idade()+" "+ cliente1.nome +" "+ cliente1.sexo);
		

	}
	
}
