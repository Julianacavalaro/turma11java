programa
{
	
	funcao inicio()
	{
		/*
		 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
		 * coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00.  
		 */
		 inteiro numFilhos, hab, salarioPessoa, numFilhosT = 0, sal100=0
		 real salarioTotal=0, maiorSalario = 0

		 para (hab=1 ; hab <= 3 ; hab++){
		 	escreva("Digite o saláio do habitante "+hab+": ")
		 	leia(salarioPessoa)
		 	salarioTotal = salarioPessoa + salarioTotal
		 	
		 	se(salarioPessoa <= 100){
		 		sal100 = sal100 + 1
		 	}
		 	se(salarioPessoa > maiorSalario ){
		 		maiorSalario = salarioPessoa
		 	}
		 	
		 	escreva("Digite o número de filhos do habitante "+hab+": ")
		 	leia(numFilhos)
		 	numFilhosT = numFilhosT + numFilhos
	
		}
			hab = 3
			
			escreva("Número de pessoas que recebem até 100 reais: "+sal100)
			escreva("\nPercentual de pessoas com salário até R$100,00: "+ ((sal100*100/hab)+"%"))
		  	escreva("\nMédia do salário da população: "+ (salarioTotal/hab))
		  	escreva("\nMédia do número de filhos é: "+ (numFilhosT/hab))
		  	escreva("\nO maior salário é: "+ maiorSalario)

	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 466; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */