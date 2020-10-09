package ListaArray;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2- Faça um programa que receba 6 números inteiros e mostre: 
			• Os números pares digitados;  
			• A soma dos números pares digitados; 
			• Os números ímpares digitados; 
			• A quantidade de números ímpares digitados.
		 */
		Scanner leia = new Scanner(System.in);
		
		int A[] = new int[6];
		int parSoma = 0, qImpar=0;
		
		
		for (int i = 0 ; i < A.length ; i++) {
			System.out.print("Digite um número inteiro: ");
			A[i] = leia.nextInt();
			
			
			}
		for (int i = 0 ; i < A.length ; i++) {
			if (A[i] % 2 ==0) {
			System.out.print("\nNúmeros pares digitados: "+ A[i]);
			parSoma = parSoma + A[i];
			
			
			
			}
		}
		System.out.println();
		for (int i = 0 ; i < A.length ; i++) {
			if (A[i] % 2 !=0){
				System.out.print("\nNúmeros impares digitados: "+ A[i]);
				qImpar++;
				}
			}
		System.out.print("\n\nSoma dos números pares: "+parSoma);
		System.out.print("\nA quantidade de números ímpares digitados: "+qImpar);
			
		}
			
		
		
		
		

	}


