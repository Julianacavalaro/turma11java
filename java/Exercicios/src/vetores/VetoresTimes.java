package vetores;
import java.util.Scanner;
import java.util.Vector;
public class VetoresTimes {
	public static void main(String[] args) {
		
		char resultado, continua = 'S';
		int contador = 1;
		
		int[] pontos = new int[4];
		
		String[] times ={"Corinthians", "Palmeiras","São Paulo" ,"Santos"};

		
		Scanner entrada = new Scanner(System.in);
		while (continua == 'S') {
			System.out.printf("%da rodada\n\n", contador);
			for (int clubes = 0; clubes < times.length; clubes++) {
				System.out.print("\n" + times[clubes] + " ganhou(G), empatou(E) ou perdeu(P)?");
				resultado = entrada.next().toUpperCase().charAt(0);
				if (resultado == 'G') {
					pontos[clubes] += 3;
				} else if (resultado == 'E') {
					pontos[clubes] += 1;
				}
			}
			for (int indice = 0; indice < 4; indice++) {
				System.out.print("\n" + times[indice] + " tem " + pontos[indice] + " pontos.\n");
			}
			System.out.print("\nContinua? Sim(S) ou Não(N)");
			continua = entrada.next().toUpperCase().charAt(0);
			contador++;
		}
		entrada.close();
		System.out.println("\nFim do Campeonato");
	}
}
