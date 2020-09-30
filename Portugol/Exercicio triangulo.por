programa
{
	
	funcao inicio()
	{
		/*
		 * 7) Receber valores de base e altura de um triângulo e verificar se são 
		 * valores válidos (positivos maiores que zero). Em caso afirmativo, calcular 
		 * a área do triângulo.
		 */

	     inteiro base, altura, area =0

		escreva("Digite o valor inteiro da Base: ")
		leia(base)
		escreva("Digite o valor inteiro da altura: ")
		leia(altura)

		area = ((base*altura)/2)
		se ((base>0) e (altura>0)) {
			escreva("Area do triangulo é igual ", (area))

		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 446; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */