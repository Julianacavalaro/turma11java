package javarepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado.
		 *  E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int a;
		double total =0, soma=0, cont=0;
		
		do {
		System.out.print("Digite um n�mero: ");
		a = leia.nextInt();
		if ( a%3 == 0 ) {
		soma = soma + a;
		cont = cont + 1;
		}
	}while(a!=0);
		total = (soma/(cont-1));
		System.out.printf("\nA m�dia dos n�meros m�ltiplos de 3 �: %.2f ", total );

	}



	}


