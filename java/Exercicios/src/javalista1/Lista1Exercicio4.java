package javalista1;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
		 * Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
		 */
		
			Scanner sc = new Scanner(System.in);
			
			int numero;
			double raiz=0;
			int quadrado=0;
			
			System.out.print("Digite um número inteiro: ");
			numero = sc.nextInt();
			
			
			if(numero % 2 == 0) {
				System.out.printf("O número %d é par", numero);
				raiz= Math.sqrt(numero);
				System.out.printf("\nA raiz quadradado de %d é %.2f ", numero, raiz);
			}
			else {
				System.out.printf("O número %d é ímpar", numero);
				quadrado = numero*numero;
			
				System.out.printf("\nA raiz quadradado de %d é %d ", numero, quadrado);
			}
			
			sc.close();

	}

}
