package javarepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
		 *  No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int a, soma=0;
		
		do {
		System.out.print("Digite um n�mero: ");
		a = leia.nextInt();
		soma = soma + a;
		
	}while(a!=0);
		System.out.printf("A soma dos n�meros digitados �: %d ", soma);

	}
}
