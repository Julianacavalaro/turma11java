package javalista1;

import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		//criar um teclado dentro do programa
		Scanner tec = new Scanner(System.in);  //criou o teclado 
		
		int num1, num2, num3;

		
		System.out.print("Escreva o n�mero 1: ");
		num1 = tec.nextInt();
		System.out.print("Escreva o n�mero 2: ");
		num2 = tec.nextInt();
		System.out.print("Escreva o n�mero 3: ");
		num3 = tec.nextInt();
		
		
				
		if( num2<num1 && num3<num1 ) {
			System.out.printf("O maior n�mero � o %d ",num1);
			}
		else if (num1<num2 && num3<num2 ) {
			System.out.printf("O maior n�mero � o %d ",num2);
		}
		else if (num1<num3 && num2<num3 ) {
			System.out.printf("O maior n�mero � o %d ",num2);
		}
		tec.close();
		
				
	}

}
