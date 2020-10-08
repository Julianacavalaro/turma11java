package javarepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int cont, a=0, par=0, impar=0;
		
		for(cont = 1 ; cont<=10 ; cont ++) {
		System.out.printf("Escreva o número %d: ", cont);
		a = leia.nextInt();
		if (a % 2 ==0) {
			par = par + 1;
		}
		else {
			impar = impar +1;
		}
		
	}
		System.out.printf("\nQuantos são pares: %d\nQuantos são impares: %d", par, impar);

}
}
