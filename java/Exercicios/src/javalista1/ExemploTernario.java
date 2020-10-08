package javalista1;

import java.util.Scanner;

public class ExemploTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nomeAluno;
		char sexoAluno; // M - MASCULINO E F - FEMININO
		int notaAnual;
		String mensagem;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Nome: ");
		nomeAluno = leia.next().toUpperCase();
		System.out.print("Digite o sexo M - MASCULINO E F - FEMININO: ");
		sexoAluno = leia.next().toUpperCase().charAt(0);
		System.out.print("Digite a nota anual: ");
		notaAnual = leia.nextInt();
		
		System.out.println("-------------------DADOS DO ALUNO----------------------");
		System.out.println();
		
		if (sexoAluno =='M') {
		System.out.printf("Oi prezado aluno %s, obrigado pelo acesso!!", nomeAluno);
		}
		else if (sexoAluno=='F') {
			System.out.printf("Oi prezado aluna %s, obrigado pelo acesso!!", nomeAluno);
		}
		else {
			System.out.println("Você não escolheu M ou F.");
		}
		
		// nome = (condição) ? "verdadeira" : "falsa" ;
		
		mensagem = ((notaAnual < 5) && (sexoAluno=='M')) ? "Reprovado" : "Aprovado";
		//mensagem = ((notaAnual < 5) && (sexoAluno=='F')) ? "Reprovada" : "Aprovada";
		
		System.out.printf("\nOi %s você está %s", nomeAluno, mensagem);
		
		leia.close();

	}
}


