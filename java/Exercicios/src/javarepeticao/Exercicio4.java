package javarepeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos
		 *  indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: idade, sexo
		 *   (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa era calma; 2, se a pessoa
		 *    era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler
		 *     os dados de 150 pessoas, calcule e mostre: (WHILE)
		 *     o n�mero de pessoas calmas; 
			o n�mero de mulheres nervosas; 
			o n�mero de homens agressivos; 
			o n�mero de outros calmos;
			o n�mero de pessoas nervosas com mais de 40 anos; 
			o n�mero de pessoas calmas com menos de 18 anos.
			
			TERMINARRRRRR

		 */
		Scanner leia = new Scanner(System.in);
		
		int sexo; //(1-feminino / 2-masculino / 3-Outros)
		int opcao; //(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)
		int cont=1;
		int idade, sexFemC=0, sexMas=0, outroC=0, outroN=0, outroA=0, sexFemN=0, sexFemA=0, sexMasC=0, sexMasN=0, sexMasA=0;
		
		
			while (cont<=3) {
				System.out.printf("Qual a idade %d: ", cont);
				idade = leia.nextInt();
				System.out.print("Qual o sexo (1-feminino / 2-masculino / 3-Outros): ");
				sexo = leia.nextInt();
				System.out.print("Qual a op��o (1-calma; 2-nervosa e 3-agressiva): ");
				opcao = leia.nextInt();
				if (sexo==1 && opcao==1) {
					sexFemC = sexFemC +1;
					
				}
				else if (sexo==1 && opcao==2) {
					sexFemN = sexFemN +1;
					
				}
				else if (sexo==1 && opcao==3) {
					sexFemA = sexFemA +1;
					
				}
				else if (sexo==2 && opcao==1) {
					sexMasC = sexMasC +1;
				
				}
				else if (sexo==2 && opcao==2) {
					sexMasN = sexMasN +1;
					
				}
				else if (sexo==2 && opcao==3) {
					sexMasA = sexMasA +1;
					
				}
				else if (sexo==3 && opcao==1) {
					outroC= outroC +1;
					
				}
				else if (sexo==3 && opcao==2) {
					outroN= outroN +1;
					
				}
				else if (sexo==3 && opcao==3) {
					outroA= outroA +1;
					
				}
				cont++;
				
				
			}
			System.out.printf("\n%d pessoa(s) do sexo feminio �(s�o) calma(s) \n",sexFemC);
			System.out.printf("\n%d pessoa(s) do sexo feminio �(s�o) nervosas(s) \n",sexFemN);
			System.out.printf("\n%d pessoa(s) do sexo feminio �(s�o) nervosas(s) \n",sexFemA);
			System.out.printf("\n%d pessoa(s) do sexo masculino �(s�o) calma(s) \n",sexMasC);
			System.out.printf("\n%d pessoa(s) do sexo masculino �(s�o) nervosas(s) \n",sexMasN);
			System.out.printf("\n%d pessoa(s) do sexo masculino �(s�o) nervosas(s) \n",sexMasA);
			System.out.printf("\n%d pessoa(s) do sexo outro �(s�o) calma(s) \n",outroC);
			System.out.printf("\n%d pessoa(s) do sexo outro �(s�o) nervosas(s) \n",outroN);
			System.out.printf("\n%d pessoa(s) do sexo outro �(s�o) nervosas(s) \n",outroA);
		
		}
		
	}

