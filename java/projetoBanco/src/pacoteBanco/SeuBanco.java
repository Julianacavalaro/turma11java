package pacoteBanco;

import java.util.Scanner;

public class SeuBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		ContaPoupanca poupanca = new ContaPoupanca();
		ContaCorrente corrente = new ContaCorrente();
		
		double valorSaque = 150;
		
		System.out.println("********************* Seu Banco *************************");
		System.out.println();
		int tipo1;
		
		System.out.println("Bom dia!");
		do {
		System.out.println("Digite o serviço desejado: ");
		System.out.println("\t1-Saldo \t 2-Extrato \t 3-Saque \t 4-Deposito ");
		//System.out.println("Digite o tipo de conta 1-poupança 2-corrente ou 3-empresa: ");
		tipo1 = leia.nextInt();

		if ( tipo1== 1 ) {
			break;
	
		}
		
		else if (tipo1 ==2) {
			break;
		}
		else if(tipo1 ==3) {
			break;
		}
		else if (tipo1==4) {
			break;
		}else {
			System.out.println("Opção inválida");
		}
		}
		while (tipo1 !=1 || tipo1 !=2 || tipo1!=3 || tipo1!=4);
		
		ContaBancaria contaSimples = new ContaBancaria();//INSTANCIANDO O OBJETO
		ContaPoupanca contaPoup = new ContaPoupanca();
		
		contaSimples.setNome("Janaina"); // NOME CLIENTE
		contaSimples.setNumero(12345); // NÚMERO DA CONTA BANCARIA
		
		double deposito = contaSimples.depositar(1000);
		
		System.out.println(contaSimples);
		
		contaSimples.sacar(valorSaque); 
		
		if(contaSimples.sacar(valorSaque)) {
			System.out.println("Retirado o valor de "+valorSaque);
			System.out.println("Saldo atualizado: "+contaSimples.getSaldo());
		}
		else{
			System.out.println("Saque de "+valorSaque+" negado");
			System.out.println("Impossível sacar mais que o valor total do saldo.");
		}
		
		contaSimples.emiteExtrato(contaSimples.getSaldo());{
			System.out.println("************************EXTRATO*****************************");
			System.out.println("Cliente:R$"+contaSimples.getNome());
			System.out.println("Saques:    R$ "+valorSaque);
			System.out.println("Depósitos: R$"+deposito);
			System.out.println("Total:     R$ "+contaSimples.getSaldo());
			
		}
		//System.out.println(contaPoup.ganhoAniversario(contaSimples.getSaldo()));
		
		
		
	}
	

}
		
	
	


