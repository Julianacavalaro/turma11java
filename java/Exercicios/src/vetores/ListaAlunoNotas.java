package vetores;
import java.util.Scanner;
public class ListaAlunoNotas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		String alunos [] = {"Bruna dos Santos", "Bruno Correia da Costa", "Bruno de Freitas Sousa", "Carla Cristina Conceição de Paula", "Christian Garcia Amantino", "Cleiton Ortega dos Santos", "Debora Miranda Carmona", "Everton Luiz Rosário de Oliveira", "Gabriel Reis Ritter", "Gildenor Junior da Silva Costa", "Guilherme Marcionilo Pedroso do Rosario Silva", "Herick Willians Canhete Rocha", "Jacqueline Alves Barbosa", "João Victor dos Santos Rigoleto", "Jonas De Oliveira Santos", "Jonathan Cavalcanti De Paula", "Juliana Cavalaro de Oliveira", "Karina Soares Lima", "Larissa Meira Dominguez", "Leonardo Iamur Terra", "Lysandro Andrade Martin", "Matheus Araujo de moraes", "Matheus Fernandes Rodrigues", "Matheus Trindade Torok", "Mônica dos santos ribeiro", "Natália Lopes moreno", "Phelipe Almeida de Souza", "Rafaela de Albuquerque", "Ricardo Martins Corrêa", "Sarah Lidia De Oliveira Braia", "Stefanie Dias Costa", "Tiago Diniz Gomes", "Victor Augusto de Souza Tavares", "Vivian Rodrigues Nakano", "Washington pereira dos santos", "Wellington Vieira", "Wesley Bueno da Silva", "Yago Tonoli Domingues", "Zaine de Queiros Jesus"};
		int notas[] = new int [alunos.length];
		int codigo [] = new int [alunos.length];
		int leitura;
		char saidaLaco= 'N';
		
		//ARRUMAR O Scanner QUE NAO LÊ S ou N
		
		do {
		
			for (int j = 0; j< alunos.length; j++) codigo [j] =j+1;
			System.out.println("Lista Alunos nota");
			System.out.println("Nome                                          Codigo    Nota");
			
			for (int j = 0; j< alunos.length; j++) {
				System.out.printf("%s				%d\t%d \n",alunos[j],codigo[j],notas[j]);
			}
			
			System.out.print("Digite um codigo do aluno para preencher a nota :");
			leitura = leia.nextInt();
			System.out.printf("Digite a nota do aluno %s ",alunos[leitura-1]);
			notas[leitura-1] = leia.nextInt();
			
			for (int j = 0; j< alunos.length; j++) {
				codigo [j] =j+1;
			}
			System.out.println("Nome                                          Codigo    Nota");
			
			for (int j = 0; j< alunos.length; j++) {
				System.out.printf("%s				%d\t%d \n",alunos[j],codigo[j],notas[j]);
			}
			
			System.out.print("\nContinua Sim/Nao :");
			saidaLaco = leia.toString().toUpperCase().charAt(0);
			
			}while (saidaLaco == 'N');
	
		
		
	}
}