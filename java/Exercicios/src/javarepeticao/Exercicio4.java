package javarepeticao;
import java.util.Scanner;
public class Exercicio4 {
	
	public static void main(String[] args) 
	{
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
		 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
		 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
	o número de pessoas calmas; 
	o número de mulheres nervosas; 
	o número de homens agressivos; 
	o número de outros calmos;
	o número de pessoas nervosas com mais de 40 anos; 
	o número de pessoas calmas com menos de 18 anos.
		 */

		
		int idade =0, sexo =0, humor =0, calmas =0, mulherNervosa =0, homemAgressivo =0, outrosCalmxs =0, mais40Nerv =0, menos18Calmas =0, contador =1;
		
		Scanner leia = new Scanner(System.in);
		
		while(contador <=150)
		{
			
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			System.out.println("Informe o sexo (1-feminino / 2-masculino / 3-Outros ");
			sexo = leia.nextInt();
			System.out.println("Informe seu humor: opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)");
			humor = leia.nextInt();


			if(humor == 1)
			{
				calmas ++;
				if(sexo == 3)
				{
						outrosCalmxs++;	
				}else if(idade < 18) 
				{
					menos18Calmas ++;
				}
			}
			
			else if(humor==2) 
			{
				if(sexo == 1) 
				{
					mulherNervosa ++;
				}else if(idade > 40)
				{
					mais40Nerv++;
				} 
				
			}else if(sexo == 2)
			{
				homemAgressivo++;
			}
			
			contador ++;
			
		}
		
		System.out.printf("o número de pessoas calmas é de:  %d \no número de mulheres nervosas é de: %d \no número de homens agressivos é de: %d \no número de outros calmos é de: %d \no número de pessoas nervosas com mais de 40 anos é de: %d \no número de pessoas calmas com menos de 18 anos é de: %d ", calmas, mulherNervosa, homemAgressivo,outrosCalmxs,mais40Nerv, menos18Calmas);
		
	}

}