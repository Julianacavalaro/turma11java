package ListaArray;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
			(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
			(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
			(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
			(d) Mostre na tela cada valor do vetor A, um em cada linha.
		 */
		
		//int a[] = new int [6];
		int A[] = {1, 0, 5, -2, -5, 7};
		int variavel = (A[0] + A[1] + A[5]);
		
		for (int i = 0 ; i < A.length ; i++) {
			System.out.print(" "+A[i]+" ");
		}
		
		A[4] = 100;
		System.out.print("\nSoma de A[0], A[1] e A[5] = "+variavel+" ");
		
		for (int i = 0 ; i < A.length ; i++) {
			System.out.println(" "+A[i]+" ");
		}
	
		
		
		
		

	}

}
