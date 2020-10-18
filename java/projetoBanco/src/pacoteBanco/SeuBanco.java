package pacoteBanco;

import java.util.Scanner;

public class SeuBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		ContaPoupanca poupanca = new ContaPoupanca();
		ContaCorrente corrente = new ContaCorrente();
		ContaEmpresa empresa = new ContaEmpresa();
		
		double valorSaque =0;
		valorSaque +=poupanca.getSaldo();
		double valorDeposito=0;
		int mes=0;
		double valorJuros=0;
		double valorCorrecao=0;
		int servico;
		double deposito;
		double valorLimite =1000;
		System.out.println("********************* Seu Banco *************************");
		
		System.out.println("Bom dia!");
	
		char opc =' ';
		char opcT=' ';
		int numTalao = 10;
		int n = 1;
		
		System.out.println("Digite o tipo de conta:\n\t1-poupança \t2-corrente \t3-empresa ");
		int tipo1 = leia.nextInt();

		
		if ( tipo1 == 1 ){                               //1- ******POUPANÇA************
			System.out.println("Digite o nome do Cliente: ");
			poupanca.setNome(leia.next());
			System.out.println("Digite o número da conta: ");
			poupanca.setNumero(leia.nextInt());
			do {
			System.out.println("Digite o serviço desejado: ");
			System.out.println("\t1-Saldo \t 2-Extrato \t 3-Saque \t 4-Deposito \t 5-Juros e Correção \t 6-Sair");
			servico = leia.nextInt();
			 
			if(servico == 1 ) {                                                    //1-Saldo
				System.out.println("************************SALDO*************************************");
				System.out.println("Total:     R$\t"+poupanca.getSaldo());
			}
			
			else if(servico == 2 ) {                                                   //2-Extrato
				System.out.println("************************EXTRATO*****************************");
				System.out.println("Cliente:   "+poupanca.getNome());
				System.out.println("Conta bancaria: "+poupanca.getNumero());
				System.out.println("Depósitos: R$\t"+valorDeposito);
				System.out.println("Correção:  R$\t"+valorCorrecao);
				System.out.println("Juros:     R$ \t"+valorJuros);
				System.out.println("Saques:    R$\t"+ valorSaque);
				System.out.println("Total:     R$\t"+poupanca.getSaldo());
			}
			else if(servico == 3 ) {                                      // 3-Saque
				System.out.println("Valor que deseja sacar: ");
				valorSaque =leia.nextDouble();
				//poupanca.sacar(valorSaque);
				if (valorSaque<=poupanca.getSaldo()) {
					System.out.println("Retirado o valor de "+valorSaque);
					poupanca.sacar(valorSaque);
					System.out.println("Saldo atualizado: "+poupanca.getSaldo());
				}else{
					double naoRealizado=0;
					valorSaque = naoRealizado;
					System.out.println("Saque de "+naoRealizado+" negado");
					System.out.println("Impossível sacar mais que o valor total do saldo.");
				}
			}
				
			else if(servico == 4) {                                       // 4 deposito
				System.out.println("Quanto deseja depositar?");
				valorDeposito =leia.nextDouble();
				poupanca.depositar(valorDeposito);
				System.out.println("Depositado o valor de "+valorDeposito);
				System.out.println("Saldo atualizado: "+poupanca.getSaldo());
			}
			else if(servico == 5) {                                    // 5 - correçao monetária e juros
				System.out.println("Qual o Mês do seu anversário?");
				mes =leia.nextInt();
				if (mes == 10 ) {
				valorCorrecao = poupanca.ganhoAniversario(poupanca.getSaldo());
				System.out.println("Valor da correção monetária: "+valorCorrecao);
				poupanca.depositar(valorCorrecao);
			
				}
				valorJuros = poupanca.ganhoJuros(poupanca.getSaldo());
				System.out.println("Valor do juros: "+valorJuros);
				poupanca.depositar(valorJuros);
				
			}
			
			
		}
			
			while(servico !=6);                                     // 6 - OPERAÇÃO FINALIZADA
			System.out.println("OPERAÇÃO FINALIZADA");
			
		}
			                                                    //2- ******CONTA CORRENTE************
		else if (tipo1 ==2 ) {
			
			System.out.println("Digite o nome do Cliente: ");
			corrente.setNome(leia.next());
			System.out.println("Digite o número da conta: ");
			corrente.setNumero(leia.nextInt());
			do {
				if(corrente.getSaldo()>= 3000) {
					System.out.println("Seu perfil permite uma conta especial, deseja fazer uma?\n\tS-sim \t N-não");
					opc = leia.next().toUpperCase().charAt(0);
					if(opc =='S' ) {
						System.out.println("Conta especial feita com sucesso!");
						//Colocar menu especial
				}
			}
				
			
			System.out.println("Digite o serviço desejado: ");
			System.out.println("\t1-Saldo \t 2-Extrato \t 3-Saque \t 4-Deposito \t 5-Talionário \t 6-Sair ");
			servico = leia.nextInt();
		
			if(servico == 1) {                                         // 1-Saldo
				System.out.println("************************SALDO*************************************");
				System.out.println("Total:     R$\t"+corrente.getSaldo());
				}
			else if(servico == 2) {                                   // 2 -Extrato
				System.out.println("Valor que deseja sacar: ");
				System.out.println("************************EXTRATO*****************************");
				System.out.println("Cliente:   "+corrente.getNome());
				System.out.println("Conta bancaria:"+corrente.getNumero());
				System.out.println("Depósitos: R$\t"+valorDeposito);
				System.out.println("Saques:    R$\t"+ valorSaque);
				System.out.println("Total:     R$\t"+corrente.getSaldo());
				System.out.println("Número de talionários disponíveis: "+numTalao);
				}
			
			else if(servico == 3 ) {                                      // 3-Saque
				System.out.println("Valor que deseja sacar: ");
				valorSaque =leia.nextDouble();
				
				if (valorSaque<=corrente.getSaldo()) {
					System.out.println("Retirado o valor de "+valorSaque);
					corrente.sacar(valorSaque);
					System.out.println("Saldo atualizado: "+corrente.getSaldo());
				}else{
					double naoRealizado=0;
					valorSaque = naoRealizado;
					System.out.println("Saque de "+naoRealizado+" negado");
					System.out.println("Impossível sacar mais que o valor total do saldo.");
				}
			}
			
			else if(servico == 4) {                                      // 4-Deposito
				
				System.out.println("Quanto deseja depositar?");
				valorDeposito =leia.nextDouble();
				corrente.depositar(valorDeposito);
				System.out.println("Depositado o valor de "+valorDeposito);
				System.out.println("Saldo atualizado: "+corrente.getSaldo());
		
				}
			
			else if(servico == 5) {                                     // 5-Talionário
			   
				corrente.setTalionario(numTalao);
				System.out.println("Talionários disponíveis: "+numTalao);
				System.out.println("Deseja um talionário? Digite S-sim N-não");
				opcT = leia.next().toUpperCase().charAt(0);
				
				if(opcT == 'S') {
					System.out.println("Retire seu talionário");
					numTalao = numTalao -1;
					
					System.out.println("Número do Talionário: \t"+n);
					n++;
				
					
				}
				else {
					System.out.println("Talionários disponíveis: "+numTalao);
				}
			}
			}while(servico !=6);                                     // 6 - OPERAÇÃO FINALIZADA
				System.out.println("OPERAÇÃO FINALIZADA");
			}
			
		if ( tipo1 == 3 ){                               //1- ******EMPRESARIAL************
			System.out.println("Digite o nome do Cliente: ");
			empresa.setNome(leia.next());
			System.out.println("Digite o número da conta: ");
			empresa.setNumero(leia.nextInt());
			do {
			if(valorLimite<=(valorLimite/2)) {
				System.out.println("Você tem direito ao emprestimo empresarial com limite de R$ "+2000);
			}
			System.out.println("Digite o serviço desejado: ");
			System.out.println("\t1-Saldo \t 2-Extrato \t 3-Saque \t 4-Deposito \t 5-Sair");
			servico = leia.nextInt();
			 
			if(servico == 1 ) {                                                    //1-Saldo
				System.out.println("************************SALDO*************************************");
				System.out.println("Total:     R$\t"+empresa.getSaldo());
			}
			
			else if(servico == 2 ) {                                                   //2-Extrato
				System.out.println("************************EXTRATO*****************************");
				System.out.println("Cliente:   "+empresa.getNome());
				System.out.println("Conta bancaria: "+empresa.getNumero());
				System.out.println("Depósitos: R$\t"+valorDeposito);
				System.out.println("Saques:    R$\t"+ valorSaque);
				System.out.println("Total:     R$\t"+empresa.getSaldo());
				System.out.println("Limite Disponível:R$\t"+valorLimite);
			}
			else if(servico == 3 ) {                                      // 3-Saque
				System.out.println("Valor que deseja sacar: ");
				valorSaque =leia.nextDouble();
				//poupanca.sacar(valorSaque);
				
				if (valorSaque<=empresa.getSaldo()) {
					System.out.println("Retirado o valor de "+valorSaque);
					empresa.sacar(valorSaque);
					System.out.println("Saldo atualizado: "+empresa.getSaldo());
				}else{
					System.out.println("Sacando do seu limite");
					valorLimite = valorLimite -valorSaque;
					System.out.println("Seu limite é de: \t"+valorLimite);
				}
			}
				
			else if(servico == 4) {                                       // 4 deposito
				System.out.println("Quanto deseja depositar?");
				valorDeposito =leia.nextDouble();
				empresa.depositar(valorDeposito);
				System.out.println("Depositado o valor de "+valorDeposito);
				System.out.println("Saldo atualizado: "+empresa.getSaldo());
			}
			
		}
			
			while(servico !=5);                                     // 6 - OPERAÇÃO FINALIZADA
			System.out.println("OPERAÇÃO FINALIZADA");
			
		}
	}
}
		
		
		
	
	


		
	
	


