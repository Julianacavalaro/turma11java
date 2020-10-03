programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um programa que lê um vetor de 3 elementos e uma matriz de 
		 * 3 x 3 elementos. Em seguida o programa deve fazer a multiplicação 
		 * do vetor pelas colunas da matriz.
		 */

		 inteiro vet[3], i
		 inteiro mat[3][3], l , c
		 inteiro total[3][3]

		 para(l=0 ; l<3 ; l++){ 
		 	
		 		para(c=0 ; c<3 ; c++){
		 			escreva("Digite um valor para a matriz: " )
		 			leia(mat[l][c])
		 	}
		 }
		 para(i=0 ; i<3 ; i++){ 
		 	escreva("Digite um valor para o vetor: " )
		 	leia(vet[i])
		 }
		 para(l=0 ; l<3 ; l++){ 
		 	
		 	para(c=0 ; c<3 ; c++){
		 	
		 		escreva("[ ",mat[l][c]," ] " )
			}
			escreva("\n")
		 }
		 escreva("\n")
		 para(i=0 ; i<3 ; i++){
		 	
		 		escreva("[ ",vet[i]," ] " )
		 		escreva("\n")
		}
		para(c=0 ; c<3 ; c++){
			 para(l=0 ; l<3 ; l++){ 
				para(i=0 ; i<3 ; i++){
				total[l][c] = ((mat[l][c])*(vet[i]))
	
				escreva("[ ",total[l][c]," ] " )
			}
			escreva("\n")
		 }
			escreva("\n")
			 
			
		}
			
	
		 
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 972; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */