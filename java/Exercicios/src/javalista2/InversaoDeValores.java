package javalista2;

import java.util.Scanner;

public class InversaoDeValores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int a=0,b=0;
		System.out.println("LEIA A:");
		a = leia.nextInt();
		System.out.println("LEIA B:");
		b = leia.nextInt();
		System.out.printf("VALORES ANTES DA INVERS�O A: %d B: %d",a,b);
	
		a= a + b;
		b= a - b ;
		a= a - b;

		System.out.println();
		System.out.printf("VALORES AP�S A INVERS�O A: %d B: %d",a,b);
		leia.close();

	}

}

