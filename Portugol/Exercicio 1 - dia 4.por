programa
{
	
	funcao inicio()
	{
		/*
		 * 1.Faça um programa que crie um vetor por leitura com 5 valores 
		 * de pontuação de uma atividade e o escreva em seguida. Encontre 
		 * após a maior pontuação e a apresente.
		 */
		 const inteiro LIMITE = 5
		 inteiro pontuacao[LIMITE], i
		 inteiro maiorPonto = 0

		 para(i=0 ; i<LIMITE ; i++){
		 	escreva("Digite o valor da pontuação "+(i+1)+": ")
		 	leia(pontuacao[i])
		 }
		 escreva("\nOs valores das pontuações são: ")
		 para(i=0 ; i<LIMITE; i++){
		 	escreva("[ "+pontuacao[i]+" ] ")
		 	se(pontuacao[i] > maiorPonto){
		 		maiorPonto = pontuacao[i]
		 	}
		 } 
		 escreva("\nA maior pontuação é: "+ maiorPonto)
		  	
		  }

	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 342; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */