package javarepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crie um programa que leia um número do teclado até que encontre um número igual a zero.
		 *  No final, mostre a soma dos números digitados.(DO...WHILE)
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int a, soma=0;
		
		do {
		System.out.print("Digite um número: ");
		a = leia.nextInt();
		soma = soma + a;
		
	}while(a!=0);
		System.out.printf("A soma dos números digitados é: %d ", soma);

	}
}
