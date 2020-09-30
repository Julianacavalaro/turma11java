programa
{
	
	funcao inicio()
	{
		/*
		 * 1- Elaborar um programa que efetue a leitura sucessiva de valores 
		 * numéricos e apresente no final o total do somatório, a média e o total 
		 * de valores lidos. O programa deve fazer as leituras dos valores enquanto 
		 * o usuário estiver fornecendo valores positivos. Ou seja, o programa 
		 * deve parar quando o usuário fornecer um valor negativo.
		 */

		 inteiro numero 
		 real numTotal = 0
		 inteiro contador = 0

		 escreva("Escreva um numero: ")
		 leia (numero)

		 enquanto (numero > 0){
		 	
		 	numTotal = numTotal + numero
		 	contador = contador + 1
		 	escreva("Escreva um numero: ")
		 	leia (numero)
		 }

		 escreva("A somatoria é: "+numTotal)
		 escreva("\nA média é: "+(numTotal/contador))
		 escreva("\nO total de valores lidos é: "+contador) 
		 
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