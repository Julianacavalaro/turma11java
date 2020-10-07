package javalista1;

import java.util.Scanner;

public class Lista1Exercicio3 {

	public static void main(String[] args) {
		
		//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
		/*10-14 infantil
		 * 15-17 juvenil
			18-25 adulto
		 */
		

		
		//criar um teclado dentro do programa
		Scanner tec = new Scanner(System.in);  //criou o teclado 
		
		int idade;
		
		System.out.print("Escreva a sua idade: ");
		idade = tec.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.printf("A sua categoria é infantil, %d anos",idade);
		}
		else if(idade>=15 && idade<=17) {
			System.out.printf("A sua categoria é juvenil, %d anos ",idade);
		}
		else if(idade>=18 && idade<=25) {
			System.out.printf("A sua categoria é adulto, %d anos ",idade);
		}

	}

}
