programa
{
	funcao pulalinha()
	{
		escreva("\n")
	}
	
	funcao inicio()
	{
		/*
		 * Escrever um programa que leia uma quantidade desconhecida de números 
		 * e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], 
		 * [51-75] e [76-100]. A entrada de dados deve terminar quando for lido 
		 * um número negativo.
		 */
		inteiro cont1=0 , cont2=0 , cont3=0 , cont4=0
		inteiro num 
		caracter opc = ' '
		inteiro contador = 0

		faca {
			escreva("Digite um número: ")
			leia(num)

			se (num>=0 e num<=25){
				cont1++
			}
			senao se (num>=26 e num<=50){
				cont2++
			}
			senao se (num>=51 e num<=75){
				cont3++
			}
			senao se (num>=76 e num<=100){
				cont4++
			}
			pulalinha()
			limpa()
			
			escreva("Deseja inserir mais números? S-sim N-não ")
			leia(opc)
		 }enquanto ((opc == 'S') ou (opc =='s'))
		
		 	escreva("Foram lidos " +cont1+ " número(s) de 0-25")
		 	pulalinha()
		 	escreva("Foram lidos " +cont2+ " número(s) de 26-50")
		 	pulalinha()
		 	escreva("Foram lidos " +cont3+ " número(s) de 51-75")
		 	pulalinha()
		 	escreva("Foram lidos " +cont4+ " número(s) de 76-100")	 
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 71; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */