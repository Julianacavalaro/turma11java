package ListaArray;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
			� Os n�meros pares digitados;  
			� A soma dos n�meros pares digitados; 
			� Os n�meros �mpares digitados; 
			� A quantidade de n�meros �mpares digitados.
		 */
		Scanner leia = new Scanner(System.in);
		
		int A[] = new int[6];
		int parSoma = 0, qImpar=0;
		
		
		for (int i = 0 ; i < A.length ; i++) {
			System.out.print("Digite um n�mero inteiro: ");
			A[i] = leia.nextInt();
			
			
			}
		for (int i = 0 ; i < A.length ; i++) {
			if (A[i] % 2 ==0) {
			System.out.print("\nN�meros pares digitados: "+ A[i]);
			parSoma = parSoma + A[i];
			
			
			
			}
		}
		System.out.println();
		for (int i = 0 ; i < A.length ; i++) {
			if (A[i] % 2 !=0){
				System.out.print("\nN�meros impares digitados: "+ A[i]);
				qImpar++;
				}
			}
		System.out.print("\n\nSoma dos n�meros pares: "+parSoma);
		System.out.print("\nA quantidade de n�meros �mpares digitados: "+qImpar);
			
		}
			
		
		
		
		

	}


