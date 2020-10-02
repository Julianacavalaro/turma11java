programa
{
	funcao pulaLinha(){
		escreva("\n<-------------------->\n")
	}
	
	funcao inicio()
	{	
		const inteiro LIMITE = 39
		cadeia lista[] = {"Bruna dos Santos","BRUNO CORREIA DA COSTA","BRUNO DE FREITAS SOUSA","Carla Cristina Conceição de Paula","Christian Garcia Amantino","Cleiton Ortega dos Santos","Debora Miranda Carmona","Everton Luiz Rosário de Oliveira","GABRIEL REIS RITTER","Gildenor Junior da Silva Costa","Guilherme Marcionilo Pedroso do Rosario Silva","Herick Willians Canhete Rocha","Jacqueline Alves Barbosa","João Victor dos Santos Rigoleto","Jonas De Oliveira Santos","JONATHAN CAVALCANTI DE PAULA","Juliana Cavalaro de Oliveira","Karina Soares Lima","Larissa Meira Dominguez","Leonardo Iamur Terra","Lysandro Andrade Martin","Matheus Araujo de moraes","Matheus Fernandes Rodrigues","Matheus Trindade Torok","Mônica dos santos ribeiro","Natália Lopes moreno","Phelipe Almeida de Souza","Rafaela de Albuquerque","Ricardo Martins Corrêa","SARAH LIDIA DE OLIVEIRA BRAIA","Stefanie Dias Costa","Tiago Diniz Gomes","Victor Augusto de Souza Tavares","Vivian Rodrigues Nakano","Washington pereira dos santos","Wellington Vieira","Wesley Bueno da Silva","Yago Tonoli Domingues","Zaine de Queiros Jesus"}
		inteiro mat[LIMITE],pessoasGrupo,qtdGrupos=0,x = 1, y = 0,z = 0 // 0-38
		escreva("Digite o numero de pessoas por grupo: ")
		leia(pessoasGrupo)
		enquanto(x < LIMITE){
			x = x + pessoasGrupo
			qtdGrupos = qtdGrupos + 1
			escreva("\ngrupos ",qtdGrupos)
		}
		para (x = 0; x <LIMITE; x++)
		{
			se(z <= qtdGrupos){
				escreva("\nGrupo numero ",z + 1)
				
				faca{
					se(x < LIMITE){
					escreva("\n",lista[x])
					y = y + 1
					x = x + 1
					}
					
				}enquanto(y < pessoasGrupo)
				y = 0
				x = x - 1
				z = z + 1
				pulaLinha()
			}	
			}
		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1787; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */