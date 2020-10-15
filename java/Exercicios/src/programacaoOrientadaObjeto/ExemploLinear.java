package programacaoOrientadaObjeto;

import java.util.Scanner;

import entidades.Retangulo;

public class ExemploLinear {
	public static void main(String[] args)
	
	// PROGRAMAÇAO MODULAR LINER
	
	{
		// calcular area do retangulo
		

		
		Scanner leia = new Scanner(System.in); // instanciando um teclado
		int base1 = 0, altura1 = 0, area1= 0;
		int base2 = 0, altura2 = 0, area2= 0;
		int base3 = 0, altura3 = 0, area3= 0;
		Retangulo quarto = new Retangulo();
		
		// primeiro retangulo
		System.out.println("Digite o valor da base:");
		base1 = leia.nextInt();
		System.out.println("Digite o valor da altura: ");
		altura1 = leia.nextInt();
		//calcular a area do retangulo
		area1 = calcArea(base1, altura1);
		System.out.printf("\nArea do retangulo é: %d", area1);
		
		//
		pulalinha();
		linha(40);
		pulalinha();
		System.out.println("Digite o valor da base:");
		base2 = leia.nextInt();
		System.out.println("Digite o valor da altura: ");
		altura2 = leia.nextInt();
		//calcular a area do retangulo
		area2 = calcArea(base2, altura2);
		//System.out.printf("\nArea do retangulo é: %d", calcArea(base2, altura2));
		mostraArea(base2, altura2);
		
		if (area1 > area2) {
			pulalinha();
			System.out.println("o primeiro retangulo é maior");
		} else if (area1 < area2) {
			pulalinha();
			System.out.println("o segundo retangulo é maior");
		} else {
			pulalinha();
			System.out.println("os retangulos são iguais");
		}
		
		
		
		leia.close();
	}
	
	public static int calcArea(int base, int altura) {
		return base * altura;
	}
	
	public static void pulalinha() {
		System.out.println();
	}
	
	
	public static void linha(int tamanho)
 	{
 		for (int x = 1; x<tamanho; x++)
 		{
 			System.out.print("═");
 		}
 		
 	}
 	public static void linhacoluna(int tamanho, int linhas)
 	{
 		//LINHA SUPERIOR
 		System.out.print("╔"); //CANTO
 		for (int x = 1; x<tamanho; x++)
 		{
 			System.out.print("═");
 		}
 		System.out.println("╗"); //CANTO
 		
 		//MEIO
 		for (int d = 1 ; d < linhas; d++) {
	 		System.out.print("║");  //alt 186
	 		for (int x = 1; x<tamanho; x++)
	 		{
	 			System.out.print(" ");
	 		}
	 		System.out.println("║");
 		}
 		//parte de baixo
 		System.out.print("╚");
 		for (int x = 1; x<tamanho; x++)
 		{
 			System.out.print("═");
 		}
 		System.out.println("╝");
 	}
 	public static void limpaTela() throws InterruptedException {
 		
 		System.out.println(System.lineSeparator().repeat(50)); // jeito no java 11
 		
 	}
 	
 	public static void mostraArea(int base, int altura) {
 		System.out.printf("\nA area calcula é %d", (base*altura));
 	}
}
