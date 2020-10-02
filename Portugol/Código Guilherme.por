programa
{
	funcao pula()
	{
		escreva("\n")
	}
	funcao linha()
	{
		para (inteiro a = 1 ; a < 60; a++){
			escreva("═")
		}
	}
	
	funcao inicio()
	{
		//DECLARANDO OS VETORES
		const inteiro LIMITE = 39
		inteiro mat[LIMITE] // 0-38
		cadeia lista[] = {"Bruna dos Santos","BRUNO CORREIA DA COSTA","BRUNO DE FREITAS SOUSA","Carla Cristina Conceição de Paula","Christian Garcia Amantino","Cleiton Ortega dos Santos","Debora Miranda Carmona","Everton Luiz Rosário de Oliveira","GABRIEL REIS RITTER","Gildenor Junior da Silva Costa","Guilherme Marcionilo Pedroso do Rosario Silva","Herick Willians Canhete Rocha","Jacqueline Alves Barbosa","João Victor dos Santos Rigoleto","Jonas De Oliveira Santos","JONATHAN CAVALCANTI DE PAULA","Juliana Cavalaro de Oliveira","Karina Soares Lima","Larissa Meira Dominguez","Leonardo Iamur Terra","Lysandro Andrade Martin","Matheus Araujo de moraes","Matheus Fernandes Rodrigues","Matheus Trindade Torok","Mônica dos santos ribeiro","Natália Lopes moreno","Phelipe Almeida de Souza","Rafaela de Albuquerque","Ricardo Martins Corrêa","SARAH LIDIA DE OLIVEIRA BRAIA","Stefanie Dias Costa","Tiago Diniz Gomes","Victor Augusto de Souza Tavares","Vivian Rodrigues Nakano","Washington pereira dos santos","Wellington Vieira","Wesley Bueno da Silva","Yago Tonoli Domingues","Zaine de Queiros Jesus"}
		inteiro x = 0, a = 0
		real qtdGrupo = 0.0, qtdPessoas = 0.0
		escreva("Digite um numero para a quantidade de grupos: ")
		leia(a)
		enquanto(a > 20 ou a <=0){
			limpa()
			escreva("Você digitou um valor invalido digite novamente")
			escreva("Digite um numero para a quantidade de grupos: ")
		leia(a)
		}
		qtdPessoas = (LIMITE/a)
		para (x = 0;x < qtdPessoas;x++){
			mat[x] = x+1
			escreva("grupo ",mat[x])
		}
		
		/*para (x = 0; x <LIMITE; x++)
		{
			
		}
		escreva("Matricula       Alunox")
		pula()
		para (x = 0; x < LIMITE; x++)
		{
			//fuciona bem até o 9
			se (x < 9)
			{
				escreva("  ",mat[x],"             ",lista[x]) 	
			}
			senao
			{
				escreva("  ",mat[x],"            ",lista[x]) 	
			}
			pula()
		}
		
	}*/
			
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2074; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */