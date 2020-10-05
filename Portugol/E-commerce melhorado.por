programa
{
	inclua biblioteca Util
	funcao pula(){
		escreva("\n")
	}
	funcao lin()
	{
		escreva("═══════════════════════════════════════")
	}
	
	funcao inicio()
	{
		cadeia produtos[] = {"Camisa","Calça","Vestido"}
		inteiro precos[3]
		inteiro codigo[3]
		inteiro x = 0
		inteiro vcod
		caracter vop
		real precofinal = 0
		
		escreva("CODIGO\tPRODUTO\t\t\t\tPREÇO\n")
		para (x = 0; x<3; x++){
			precos[x] = Util.sorteia(10,50) //simulandlo a digitição de alguem
			codigo[x]=(x+1)
			escreva(codigo[x],"\t",produtos[x],"\t\t\t\tR$ ",precos[x])
			pula()
		}
		lin()
		pula()
		escreva("Digite o codigo do produto que vc deseja compra:")
		leia(vcod)
		pula()
		escreva("1 - PAGAMENTO A VISTA 10% DESCONTO \n2- CARTÃO 1 VEZ PREÇO FINAL - \n ou 3 - VEZES COM JUROS 10% :")
		leia(vop)
		pula()
		se (vop == '1'){
			
			precofinal = precos[vcod-1] - (precos[vcod-1] * 0.1)
			lin()
			pula()
			escreva("Valor pagamento: ", precofinal)
			pula()
			lin()
		}
		senao se (vop =='2'){
			precofinal = precos[vcod-1]
			lin()
			pula()
			escreva("Valor pagamento: ", precofinal)
			pula()
			lin()
		} senao se (vop =='3'){
			precofinal = precos[vcod-1] + (precos[vcod-1] * 0.1)
			lin()
			pula()
			escreva("Produto: ", produtos[vcod-1], " Valor pagamento: ", precofinal, " em 3x com 10% juros:", (precofinal/3))
			pula()
			lin()
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */