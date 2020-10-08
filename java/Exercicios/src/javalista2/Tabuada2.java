package javalista2;

import java.util.Scanner;

public class Tabuada2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Qual tabuada vc quer: ");
		a = leia.nextInt();
		
		
		System.out.printf("\nTabuada do %d ", a);
		System.out.println("");
		
		for(b=1 ; b<=10 ; b++) {
				
			System.out.printf("%d x %d = %d ",a , b,(a*b));
			System.out.println("");
			}
		
		leia.close();
		

	}

}
