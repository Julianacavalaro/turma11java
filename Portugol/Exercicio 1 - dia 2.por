programa
{
	
	funcao inicio()
	{
		/*
		 * 1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para 
		 * controlar o rendimento diário de seu trabalho. Toda vez que ele traz um 
		 * peso de tomate maior que o estabelecido pelo regulamento do estado de 
		 * São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
		 * João precisa que você faça um sistema que leia a variável P (peso de tomates) 
		 * e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na 
		 * variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais 
		 * variáveis com o conteúdo ZERO.
		 */
		real P, E, M
		
		escreva("Digite o peso do tomate: ")
		leia(P)

		E = P - 50

		se (E > 0) {
			M = E * 4
			escreva("O peso excedente e: "+ E)
			escreva("\nA multa que Joao devera pagar e: "+ M+ " reais")
		}
		senao {
			E=0
			M=0
			escreva("Não há peso excedente, \nE= "+ E+"\nM= "+ M)
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */