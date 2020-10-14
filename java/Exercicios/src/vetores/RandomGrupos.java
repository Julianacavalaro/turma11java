package vetores;

import java.util.Arrays;
import java.util.Scanner;
public class RandomGrupos {
	public static void main(String[] args) {
		
		String[] listaAlunos = {"Bruna dos Santos","BRUNO CORREIA DA COSTA","BRUNO DE FREITAS SOUSA",
				"Carla Cristina Conceição de Paula","Christian Garcia Amantino",
				"Cleiton Ortega dos Santos","Debora Miranda Carmona","Everton Luiz Rosário de Oliveira",
				"GABRIEL REIS RITTER","Gildenor Junior da Silva Costa",
				"Guilherme Marcionilo Pedroso do Rosario Silva",
				"Herick Willians Canhete Rocha","Jacqueline Alves Barbosa",
				"João Victor dos Santos Rigoleto","JONATHAN CAVALCANTI DE PAULA",
				"Juliana Cavalaro de Oliveira","Karina Soares Lima","Leonardo Iamur Terra",
				"Lysandro Andrade Martin","Matheus Araujo de moraes","Matheus Fernandes Rodrigues",
				"Matheus Trindade Torok","Mônica dos santos ribeiro","Natália Lopes moreno",
				"Phelipe Almeida de Souza","Rafaela de Albuquerque","Ricardo Martins Corrêa",
				"SARAH LIDIA DE OLIVEIRA BRAIA","Stefanie Dias Costa","Tiago Diniz Gomes",
				"Victor Augusto de Souza Tavares","Vivian Rodrigues Nakano",
				"Washington pereira dos santos","Wellington Vieira","Wesley Bueno da Silva",
				"Yago Tonoli Domingues","Zaine de Queiros Jesus"};
		int[] posicoes = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		int tamanho;
		int qtdeGrupos = 0;
		int resto = 0;
		int aleatorio = 0;
		int contadorWhile = 0;
		int contadorPosicoes = 0;
		
		
		while(true) {
			
			Scanner entrada = new Scanner(System.in);
			System.out.print("Qual é o tamanho do grupo? (min = 3; max = 6)");
			tamanho = entrada.nextInt();
			
			if(tamanho>6 || tamanho<3) {
					
				System.out.println("Tamanho do grupo está fora do intervalo [3,6]");
			}else {
				
				qtdeGrupos = 37/tamanho;
				resto = 37%tamanho;
				break;
			}
		}
		
		for(int i=0;i<37; i++) {
			
			gambiarra: while(true) {
				
				aleatorio = (int) Math.floor(Math.random()*(37-0));
				for(int j=0; j<37; j++) {
					
					if(posicoes[j]==aleatorio) {
						
						continue gambiarra;
					}
				}
				
				posicoes[i] = (int) aleatorio;
				break;
			}
		}
		
		for(int j=1; j<=qtdeGrupos; j++) {
			
			System.out.printf("%n%nGrupo %d%n", j);
			while(contadorWhile<tamanho) {
				
				System.out.println(listaAlunos[posicoes[contadorPosicoes]]);
				contadorPosicoes++;
				contadorWhile++;
			}
			contadorWhile=0;
		}
		System.out.println("\n\nPESSOAS QUE SOBRARAM:\n");
		while(contadorWhile<resto) {
			
			System.out.println(listaAlunos[posicoes[contadorPosicoes]]);
			contadorPosicoes++;
			contadorWhile++;
		}
	}
}