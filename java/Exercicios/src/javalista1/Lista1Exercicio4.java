package javalista1;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
		 * Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
		 */
		
			Scanner sc = new Scanner(System.in);
			
			int numero;
			double raiz=0;
			int quadrado=0;
			
			System.out.print("Digite um n�mero inteiro: ");
			numero = sc.nextInt();
			
			
			if(numero % 2 == 0) {
				System.out.printf("O n�mero %d � par", numero);
				raiz= Math.sqrt(numero);
				System.out.printf("\nA raiz quadradado de %d � %.2f ", numero, raiz);
			}
			else {
				System.out.printf("O n�mero %d � �mpar", numero);
				quadrado = numero*numero;
			
				System.out.printf("\nA raiz quadradado de %d � %d ", numero, quadrado);
			}
			
			sc.close();

	}

}
