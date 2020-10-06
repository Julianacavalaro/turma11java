package portugol;

import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * programa
			{
				
				funcao inicio()
				{
					inteiro anos=0
					inteiro meses=0
					inteiro dias=0
					inteiro totalDias=0
					
					escreva("Digite os anos da sua idade: ")
					leia(anos)
					escreva("Digite os meses da sua idade: ")
					leia(meses)
					escreva("Digite os dias da sua idade: ")
					leia(dias)
			
					totalDias = ((anos*365) + (meses*30) + dias)
			
					escreva("Sua idade total em dias é: " + totalDias + " dias.")
					
					
				}
			}

		 */
		    Scanner leia = new Scanner(System.in);
		    
		    int anos, meses, dias, totalDias = 0;
		    
		    System.out.print("Escreva os anos da sua idade: ");
		    anos = leia.nextInt();
		    System.out.print("Escreva os meses da sua idade: ");
		    meses = leia.nextInt();
		    System.out.print("Escreva os dias da sua idade: ");
		    dias = leia.nextInt();
		    
		    totalDias = ((anos*365) + (meses*30) + dias);
		    
		    System.out.printf("Sua idade total em dias é: %d dias", totalDias);
		    
		    leia.close();
		    		
	}

}
