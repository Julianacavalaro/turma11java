package portugol;
import java.util.Scanner;
public class ChefeDeFamilia {
	public static void main(String[] args) {
		//se >18 && chefe de família => recebe auxílo
		//se 18> && chefe de família && mulher => dobro auxílio
		//G7
		
		int idade = 0, ano, verificador = 0;
		char sexo = 'F';
		boolean chefeDeFamilia;
		String nome;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		nome = entrada.nextLine();
		
		System.out.println("Qual seu ano de nascimento?");
		ano = entrada.nextInt();
		idade = 2020 - ano;
		
		while(verificador==0) {
		
			System.out.println("Qual o seu sexo? (M/m) ou (F/f)");
			sexo = entrada.next().charAt(0);
			if(sexo!='M' && sexo!='m' && sexo!='F' && sexo!='f') {
				System.out.printf("Char inválido! %c", sexo);
			}else {
				
				verificador = 1;
			}
		}
			
		
		System.out.println("Você é chefe de família?");
		chefeDeFamilia = entrada.nextBoolean();		
		
		entrada.close();
		
		
		if(idade>=18 && chefeDeFamilia) {
			if(sexo=='M'||sexo=='m') {
				System.out.printf("%s, seu auxílo é de R$600,00.", nome);
			}else {
				System.out.printf("%s, seu auxílio é de R$1200,00", nome);
			}
		}else {
			System.out.println("Sem money pra vc!");
		}
	}
}









