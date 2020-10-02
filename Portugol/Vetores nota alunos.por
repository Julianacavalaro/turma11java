programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		//Declaração de variável
		cadeia alunos[4]
		real notas[4]
		real maiorNota = 0.0
		

		//Entrada,Processamento e Saída

		para(inteiro x= 0; x < 4; x++)
		{
			escreva("Digite o nome do aluno: ")
			leia(alunos[x])
			pula()
			escreva("Digite a nota do aluno do aluno: ")
			leia(notas[x])
			pula()

			se(notas[x] > maiorNota)
			{
				maiorNota = notas[x]
			}
				
			limpa()
		}

		para(inteiro x= 0; x < 4; x++)
		{
			se(notas[x] == maiorNota])
			{
				escreva ("O nome do aluno é: " +alunos[x]+ " a sua nota é: "+ notas[x]+"**")
				pula()
			}senao
			{
				escreva("O nome do aluno é: " +alunos[x]+ " a sua nota é: "+ notas[x])
				pula()
			}
			{
					}
		}
		funcao pula()
		{
		escreva("\n")

		}

		
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 141; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */