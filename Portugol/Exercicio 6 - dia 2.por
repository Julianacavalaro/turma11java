programa
{
	
	funcao inicio()
	{	
		/*
		 * Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
		Infantil A = 5 a 7 anos
		Infantil B = 8 a 11 anos
		Juvenil A = 12 a 13 anos
		Juvenil B = 14 a 17 anos
		Adultos = Maiores de 18 anos
		 */
		inteiro idadeUsuario
		
		escreva("Digite a sua idade: ")
		leia(idadeUsuario)

		se (idadeUsuario >=5 e idadeUsuario <=7){
			escreva("Voce esta classificado em: Infantil A")
		}
		senao se (idadeUsuario >=8 e idadeUsuario <=11){
			escreva("Voce esta classificado em: Infantil B")
		}
		senao se (idadeUsuario >=12 e idadeUsuario <=13){
			escreva("Voce esta classificado em: Juvenil A")
		}
		senao se (idadeUsuario >=14 e idadeUsuario <=17){
			escreva("Voce esta classificado em: Juvenil B")
		}
		senao se (idadeUsuario >=18){
			escreva("Voce esta classificado em: Adulto")
		}
		senao {
			escreva("Digite uma idade valida")
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */