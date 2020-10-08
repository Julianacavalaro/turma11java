package javalista2;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int a, b;
		
		
		for(a=1 ; a<=10 ; a++) {
			System.out.printf("\nTabuada do %d ", a);
			System.out.println("");
			for(b=1 ; b<=10 ; b++) {
				
				System.out.printf("%d x %d = %d ",a , b,(a*b));
				System.out.println("");
			}
		}

	}

}
