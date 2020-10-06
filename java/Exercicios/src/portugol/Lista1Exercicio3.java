package portugol;

import java.util.Scanner;

public class Lista1Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int tempoDuracao=0, segundos=0, minutos=0, horas=0;
		
		System.out.print("Digite o tempo de duração do evento da fábrica em segundos: ");
		tempoDuracao = scan.nextInt();
		
		horas = tempoDuracao / 3600;
		minutos = (tempoDuracao % 3600) / 60;
		segundos = (tempoDuracao % 3600) % 60;
		
		System.out.printf("O evento durou %d horas, %d minutos e %d segundos.", horas, minutos, segundos);
		
		scan.close();

	}

}

