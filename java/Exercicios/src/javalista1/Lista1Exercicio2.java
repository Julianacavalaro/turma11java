package javalista1;

import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa que entre com três números e coloque em ordem crescente.
		
		//criar um teclado dentro do programa
		Scanner tec = new Scanner(System.in);  //criou o teclado 
		
		int a, b, c;

		
		System.out.print("Escreva o número 1: ");
		a = tec.nextInt();
		System.out.print("Escreva o número 2: ");
		b = tec.nextInt();
		System.out.print("Escreva o número 3: ");
		c = tec.nextInt();
		
		
				
		if( (b<a) && (c<a) ) {
			if(c<b) {
				System.out.printf("Em ordem crescente %d %d %d", c, b, a );	
			}
			else {
				System.out.printf("Em ordem crescente %d %d %d", b, c, a );
			}
			
		}
		else if (a<b && c<b ) {
			if( c<a) {
				System.out.printf("Em ordem crescente %d %d %d ", c, a, b );	
			}
			else {
				System.out.printf("Em ordem crescente %d %d %d", a, c, b );
			}
		}
		else if (a<c && b<c ) {
			if( b<a ) {
				System.out.printf("Em ordem crescente %d %d %d", b, a, c );	
			}
			else {
				System.out.printf("Em ordem crescente %d %d %d", a, b, c );
			}
		}
		
		tec.close();
		
				
	}

}
