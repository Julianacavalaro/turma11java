package atividadeClasseObjeto;

import java.util.Scanner;

import entidades.Cliente;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
		 * em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as 
		 * informações deste objeto no console.
		 */
		
		
		Scanner leia = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		System.out.println("Digite o seu nome: ");
		cliente.nome = leia.next();
		
		System.out.print("Digite 'M' para sexo masculino, 'F' para sexo feminino ou 'O' para outros: ");
		cliente.sexo = leia.next().toUpperCase().charAt(0);
		
		System.out.println("Digite a empresa que trabalha: ");
		cliente.empresa =leia.next();
		
		System.out.println("Digite a sua cidade: ");
		cliente.cidade= leia.next();
		
		System.out.println("Digite seu email: ");
		cliente.email = leia.next();
		
		System.out.println("Digite sua idade: ");
		cliente.idade = leia.nextInt();
		
		System.out.println("Dados do Cliente: ");
		System.out.println("Nome: " + cliente.nome);
		System.out.print("Sexo: ");
		System.out.println((cliente.sexo=='F')?"Feminino":(cliente.sexo=='M')?"Masculino":"Outros");
		System.out.println("Idade: " +cliente.idade);
		System.out.println("Cidade : " + cliente.cidade);
		System.out.println("Empresa : " + cliente.empresa);
		System.out.println("Email: " +cliente.email);
	}

}
