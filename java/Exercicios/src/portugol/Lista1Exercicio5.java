package portugol;

import java.util.Scanner;

public class Lista1Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota1, nota2, nota3;
		double media=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Digite a nota 1: ");
		nota1 = leia.nextInt();
		
		System.out.print("Digite a nota 2: ");
		nota2 = leia.nextInt();
		
		System.out.print("Digite a nota 3: ");
		nota3 = leia.nextInt();
		
		media = (nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5);
		
		System.out.printf("A média ponderada é %.2f", media);
		
		leia.close();

	}

}
