package ListaArray;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 *  3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int maior10=0;
		
		System.out.println(" \t Matriz [3][3] \t ");
		
		for(int linha=0 ; linha < 3 ; linha++) {
			for(int coluna=0 ; coluna<3 ; coluna++) {
				System.out.printf("Digite a linha [%d] e a coluna[%d] ",linha+1, coluna+1);
				matriz[linha][coluna] = leia.nextInt();
				
				if (matriz[linha][coluna] > 10) {
					maior10 = maior10 +1;
				}
			}
		}
		System.out.println("\t Matriz [3][3] \t");
		for(int linha=0 ; linha < 3 ; linha++) {
			for(int coluna=0 ; coluna<3 ; coluna++) {
				System.out.printf("\t%d\t", matriz[linha][coluna]);
			}
			System.out.println();
			
		}
		System.out.printf("Valores maiores que 10 = %d ", maior10);
		
	}
	
}
		
		


	


