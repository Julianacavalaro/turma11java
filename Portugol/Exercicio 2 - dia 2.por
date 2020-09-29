programa
{
	
	funcao inicio()
	{
		/*
		 * 2) Elabore um sistema que leia as variáveis C e N, respectivamente código e 
		 * número de horas trabalhadas de um operário. E calcule o salário sabendo-se que 
		 * ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o 
		 * excesso de pagamento armazenando-o na variável E, caso contrário zerar tal 
		 * variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento 
		 * imprimir o salário total e o salário excedente.
		 */
		 real  total, N, E

		 escreva("Digite o numero de horas trabalhadas: ")
		 leia(N)

		 se (N <= 50) {
		 	escreva("Seu salario é: "+ (N*10.0))
		 	E = 0
		 }
		 senao {
		 	E = ((N-50)*20.0)
		 	escreva("Seu salario excedente é: "+ (E))
		 	total = E + 500
		 	escreva("\nSeu salario total é: "+ total)
		
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