programa
{
	
	funcao inicio()
	{
	inteiro idadeDias, idadeAnos, idadeMes, totalDias
	
	idadeMes = 0
	idadeDias = 0
	idadeAnos = 0
	totalDias = 0
	escreva("Digite sua idade em dias: ")
	leia(totalDias)
	
	idadeAnos = totalDias/365
	idadeMes = (totalDias%365)/30
	idadeDias = (totalDias%365)%30

	escreva("\nA sua idade em dias é: "+ idadeDias ) //escreveu na tela
	escreva("\nA sua idade em meses é: "+ idadeMes ) //escreveu na tela
	escreva("\nA sua idade em anos é: "+ idadeAnos ) //escreveu na tela


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