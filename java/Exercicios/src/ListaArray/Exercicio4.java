package ListaArray;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
			(1) somar as duas matrizes 
			(2) subtrair a primeira matriz da segunda 
			(3) adicionar uma constante as duas matrizes
			(4) imprimir as matrizes 
			Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		double[][] matriz = new double[2][2];
	
		
		System.out.println(" \t Matriz 1 \t ");
		
		for(int linha=0 ; linha < 2 ; linha++) {
			for(int coluna=0 ; coluna<2 ; coluna++) {
				System.out.printf("Digite a linha [%d] e a coluna[%d] ",linha+1, coluna+1);
				matriz[linha][coluna] = leia.nextDouble();

			}
		}
		System.out.println("\t Matriz 1 \t");
		for(int linha=0 ; linha < 2 ; linha++) {
			for(int coluna=0 ; coluna<2 ; coluna++) {
				System.out.printf("\t %.2f\t", matriz[linha][coluna]);
			}
			System.out.println();

	}
	System.out.println(" \t Matriz 2 \t ");
		
		for(int linha=0 ; linha < 2 ; linha++) {
			for(int coluna=0 ; coluna<2 ; coluna++) {
				System.out.printf("Digite a linha [%d] e a coluna[%d] ",linha+1, coluna+1);
				matriz[linha][coluna] = leia.nextDouble();

			}
		}
		System.out.println("\t Matriz 2 \t");
		for(int linha=0 ; linha < 2 ; linha++) {
			for(int coluna=0 ; coluna<2 ; coluna++) {
				System.out.printf("\t %.2f\t", matriz[linha][coluna]);
			}
			System.out.println();

}
	}
}
