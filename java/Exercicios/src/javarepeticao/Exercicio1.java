package javarepeticao;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Informar todos os números de 1000 a 1999 que quando 
		 * divididos por 11 obtemos resto = 5. (FOR)
		 */
		
		
		int contador;
		
		System.out.println("Os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5");
		for (contador=1000 ; contador<=1999 ; contador++) {
			if (contador%11==5) {
				System.out.println( contador);
		}
		

	}

	}
}
