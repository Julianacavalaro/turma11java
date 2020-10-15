package atividadeClasseObjeto;

import java.util.Scanner;

import entidades.Aviao;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida
		 * crie um objeto avião, defina as instancias deste objeto e apresente as informações deste objeto 
		 * no console.
		 */
		Scanner leia = new Scanner(System.in);
		Aviao aviao = new Aviao();
		
		System.out.println("Digite o nome do cliente: ");
		aviao.nome = leia.next();
		
		System.out.println("Digite o destino: ");
		aviao.destino = leia.next();
		
		System.out.println("Digite o número da passagem: ");
		aviao.numeroPassagem = leia.nextInt();
		
		System.out.println("O Voo possui escalas S-sim N-nao: ");
		aviao.escalas = leia.next().toUpperCase().charAt(0);
		
		System.out.println("Nome: "+aviao.nome);
		System.out.println("Número da passagem: "+aviao.numeroPassagem);
		System.out.println("Destino: " + aviao.destino);
		System.out.print("Com escala: "+ aviao.escalas);

	}

}
