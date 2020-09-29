programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		// Recebe um nome digitado pelo usuário
		// Digita uma mensagem na tela com esse nome
		// Recebe muitas letras - cadeia de caracteres

		// ingredientes
		cadeia nomeUsuario //camelCase - criou uma variável na memória
		inteiro anoNascimento //variável numérica para idade
		real salarioUsuario //salário do usuário
		inteiro anoAtual = 2020
		inteiro idadeUsuario =0

		//modo de preparo
		escreva("Digite o nome do usuario: ") //escreveu na tela
		leia(nomeUsuario)
		escreva("Digite o ano do nascimento: ")
		leia(anoNascimento)
		escreva("Digite o salário: ")
		leia(salarioUsuario)

		//processamento
		idadeUsuario = anoAtual - anoNascimento

		//saida - tira do forno
		escreva("\n Oi, meu nome é "+ nomeUsuario)
		escreva("\n nasci no ano de "+ anoNascimento)
		escreva("\n meu salário atual é "+ salarioUsuario)
		escreva("\n minha idade é " +idadeUsuario+" anos")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 48; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */