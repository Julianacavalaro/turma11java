package javarepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int cont, a=0, par=0, impar=0;
		
		for(cont = 1 ; cont<=10 ; cont ++) {
		System.out.printf("Escreva o n�mero %d: ", cont);
		a = leia.nextInt();
		if (a % 2 ==0) {
			par = par + 1;
		}
		else {
			impar = impar +1;
		}
		
	}
		System.out.printf("\nQuantos s�o pares: %d\nQuantos s�o impares: %d", par, impar);

}
}
