programa
{
	
	funcao inicio()
	{
		/*
		 * 4.  	Crie um programa que receba valores do usuário para preencher 
		 * uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a soma dos 
		 * valores da primeira diagonal, ou seja, diagonal principal.
		 */

		 inteiro mat[3][3], l , c
		 inteiro soma =0
		 inteiro somaDiagonal = 0
	
		 	para(l=0 ; l<3 ; l++){ 
		 	
		 		para(c=0 ; c<3 ; c++){
		 			escreva("Digite um valor: " )
		 			leia(mat[l][c])
		 	}
		 }
		 para(l=0 ; l<3 ; l++){ 
		 	
		 	para(c=0 ; c<3 ; c++){
		 		soma = (soma)+(mat[l][c])
		 		se( l==c){
		 			somaDiagonal = (somaDiagonal)+(mat[l][c])
		 		}
		 		
			}
		
		}
		escreva("A soma dos valores é: "+soma)

		somaDiagonal = (mat[0][0])+(mat[1][1])+(mat[2][2])

		escreva("\nA soma dos valores da diagonal é: "+somaDiagonal)
	}
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 335; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */