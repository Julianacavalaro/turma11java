package javarepeticao;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
		 *  Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		 */
		Scanner leia = new Scanner(System.in);
		
		int idade=0, menor21=0, maior50=0;
		
		while(idade!=-99) {
			System.out.print("Escreva uma idade: ");
			idade = leia.nextInt();
			if (idade<21) {
				menor21 = (menor21 +1);
			}
			else if (idade>50) {
				maior50 = maior50 + 1;
			}
			
		}
		System.out.printf("\nTotal de pessoas com menos de 21 anos: %d",(menor21-1));
		System.out.printf("\nTotal de pessoas com mais de 50 anos: %d",maior50);
		
		leia.close();

	}
}