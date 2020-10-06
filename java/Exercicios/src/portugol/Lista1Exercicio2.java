package portugol;

import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * programa
			{
				//2. Faça um sistema que leia a idade de uma
				//pessoa expressa em dias e mostre-a expressa em anos, meses e
				//dias.
				
				funcao inicio()
				{
					//Variáveis
					// a=anos, m=meses, d=dias
					inteiro a, m, d, dias
					dias=0
					a=0
					m=0
					d=0
					escreva("Digite quantos dias de idade vc tem?: ")
					leia(dias)
					a=(dias/365)
					m=(dias%365)/30
					d=(dias%365)%30)
					escreva("Você tem ",a, " ano(s) ",m, " mês(s) ",d, " dia(s)! ")
				}
			}

		 */
		 Scanner leia = new Scanner(System.in);
		
		int a=0 , m=0 , d=0 , dias=0;
		
		System.out.print("Digite quantos dias de idade vc tem?: ");
		dias = leia.nextInt();
		
		a=(dias/365);
		m=(dias%365)/30;
		d=((dias%365)%30);
		
		System.out.printf("Você tem %d ano(s) %d mês(s) %d dia(s)! ",a,m,d);
		
		leia.close();
		

	}

}
