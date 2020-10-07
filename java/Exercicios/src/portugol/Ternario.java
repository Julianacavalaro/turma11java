package portugol;
import java.util.Scanner;
public class Ternario {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor=0;
		
		System.out.print("Digite um numero positivo acima de 0: ");
		valor = leia.nextInt();
		System.out.print((valor <=0 )?"VC DIGITOU ZERO OU NEGATIVO!!!":((valor%2)==0)?"VALOR "+valor+" É PAR":"VALOR "+valor+" É IMPAR");
		
		leia.close();
	}
}