programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um programa que calcula e escreve a seguinte soma: 
		 * soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
		 */

		 inteiro numerador , denominador =0
		 real soma =0

		 escreva("Soma = ")

		 para(numerador=1 ; numerador <=99 ; numerador= numerador +2){
		 	se(denominador<50){
		 		denominador++
		 	}
		 	escreva("+ ")
		 	escreva(numerador+"/"+denominador+" ")
		 }
		 para(numerador=1 ; numerador <=99 ; numerador= numerador +2){
		 	se(denominador<50){
		 		denominador++
		 	}
		 	soma = soma + (numerador/denominador)
		 	escreva(numerador+"/"+denominador+" ")
		 }
		 escreva("\nO total da soma é: "+soma)
		 
	 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */