programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * 2. Um dado é lançado 10 vezes e o valor correspondente é anotado.
			Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
			A seguir determine e imprima a média aritmética dos lançamentos, 
			contabilize e apresente também quantas foram as ocorrências da maior
			pontuação.
		 */
		
		const inteiro LIMITE = 2
		inteiro valoresDado[LIMITE]
		inteiro media = 0
		inteiro contador = 0
		inteiro valorTotal = 0
		
		escreva("Sorteando valores")
		pula()
		para (inteiro x = 0 ; x < LIMITE; x++) {
			valoresDado[x] = Util.sorteia(1, 6)
			valorTotal = valorTotal + valoresDado[x]
		}
	
		
		para (inteiro x = 0; x < LIMITE; x++){
			escreva("O valor ",(x+1), " foi ",valoresDado[x])
			pula()
			se ( valoresDado[x] == 6 ) {
				contador++
			}
		
		}

			media = (valorTotal/LIMITE)
			escreva("A média é: "+ media)
			pula()
			escreva("A maior pontuação saiu "+contador+" vezes")
		
		
	}
	funcao pula(){
		escreva("\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 474; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */