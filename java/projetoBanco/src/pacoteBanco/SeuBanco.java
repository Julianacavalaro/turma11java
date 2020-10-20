package pacoteBanco;

import java.util.Scanner;

public class SeuBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		ContaPoupanca poupanca = new ContaPoupanca();
		ContaCorrente corrente = new ContaCorrente();
		ContaEmpresa empresa = new ContaEmpresa();
		ContaEspecial especial = new ContaEspecial();
		
		double valorSaque =0;
		valorSaque +=poupanca.getSaldo();
		double valorDeposito=0;
		int mes=0;
		double valorJuros=0;
		double valorCorrecao=0;
		int servico;
		double deposito;
		double valorLimite =1000;
		System.out.println("*************************| Seu Banco |***********************************************");
		
		System.out.println("Bom dia!");
	
		char opc =' ';
		char opcT=' ';
		int numTalao = 0;
		corrente.setTalionario(0);
		int cont =0;
	
		
		System.out.println("Digite o tipo de conta:\n\t1-poupança \t2-corrente \t3-empresa ");
		int tipo1 = leia.nextInt();

		
		if ( tipo1 == 1 ){                   //1- ******POUPANÇA************
			System.out.println("*********************CONTA POUPANÇA*********************************************");//1- ******POUPANÇA************
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
				System.out.println("************************EXTRATO*******************************");
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
					System.out.println("Retirado o valor de R$"+valorSaque);
					poupanca.sacar(valorSaque);
					System.out.println("Saldo atualizado: R$"+poupanca.getSaldo());
				}else{
					double naoRealizado=0;
					valorSaque = naoRealizado;
					System.out.println("Saque de negado saldo disponível: R$"+poupanca.getSaldo());
					System.out.println("Impossível sacar mais que o valor total do saldo.");
				}
			}
				
			else if(servico == 4) {                                       // 4 deposito
				System.out.println("Quanto deseja depositar?");
				valorDeposito =leia.nextDouble();
				poupanca.depositar(valorDeposito);
				System.out.println("Depositado o valor de R$"+valorDeposito);
				System.out.println("Saldo atualizado: R$"+poupanca.getSaldo());
			}
			else if(servico == 5) {                                    // 5 - correçao monetária e juros
				System.out.println("Qual o Mês do seu anversário?");
				mes =leia.nextInt();
				if (mes == 10 ) {
				valorCorrecao = poupanca.ganhoAniversario(poupanca.getSaldo());
				System.out.println("Valor da correção monetária: R$"+valorCorrecao);
				poupanca.depositar(valorCorrecao);
			
				}
				valorJuros = poupanca.ganhoJuros(poupanca.getSaldo());
				System.out.println("Valor do juros: R$"+valorJuros);
				poupanca.depositar(valorJuros);
				
			}
			
			
		}
			
			while(servico !=6);                                     // 6 - OPERAÇÃO FINALIZADA
			System.out.println("OPERAÇÃO FINALIZADA");
			
		}
			                                                    //2- ******CONTA CORRENTE************
		else if (tipo1 ==2 ) {
			System.out.println("*********************CONTA CORRENTE***************************************");
			System.out.println("Digite o nome do Cliente: ");
			corrente.setNome(leia.next());
			System.out.println("Digite o número da conta: ");
			corrente.setNumero(leia.nextInt());
			do {	
			

			System.out.println("Digite o serviço desejado: ");
			System.out.println("\t1-Saldo \t 2-Extrato \t 3-Saque \t 4-Deposito \t 5-Talionário \t 6-Conta Especial \t 7-Sair ");
			servico = leia.nextInt();
		
			if(servico == 1) {                                         // 1-Saldo
				System.out.println("************************SALDO*************************************");
				System.out.println("Total:     R$\t"+corrente.getSaldo());
				
				if(corrente.getSaldo()>= 3000) {
					System.out.println("Seu perfil permite uma conta especial, deseja fazer uma?\n\tS-sim \t N-não");
					opc = leia.next().toUpperCase().charAt(0);
					
					if(opc =='S' ) {
						System.out.println("Conta especial feita com sucesso!");
						//Acessar conta especial no menu conta corrente;
						
					}
				
				}
			}
			
			else if(servico == 2) {                                   // 2 -Extrato
				System.out.println("Valor que deseja sacar: ");
				System.out.println("************************EXTRATO*****************************");
				System.out.println("Cliente:   "+corrente.getNome());
				System.out.println("Conta bancaria:"+corrente.getNumero());
				System.out.println("Depósitos: R$\t"+valorDeposito);
				System.out.println("Saques:    R$\t"+ valorSaque);
				System.out.println("Total:     R$\t"+corrente.getSaldo());
				if(corrente.getTalionario()==0) {
					System.out.println("Você não emitiu talonários ainda");
				}
				else {
				System.out.println("Número do ultimo talonário emitido: "+corrente.getTalionario());
				}
			}
				
			
			else if(servico == 3 ) {                                      // 3-Saque
				System.out.println("Valor que deseja sacar: ");
				valorSaque =leia.nextDouble();
				
				if (valorSaque<=corrente.getSaldo()) {
					System.out.println("Retirado o valor de R$"+valorSaque);
					corrente.sacar(valorSaque);
					System.out.println("Saldo atualizado: R$"+corrente.getSaldo());
				}else{
					double naoRealizado=0;
					valorSaque = naoRealizado;
					System.out.println("Saque de negado saldo disponível: R$"+corrente.getSaldo());
					System.out.println("Impossível sacar mais que o valor total do saldo.");
				}
			}
			
			else if(servico == 4) {                                      // 4-Deposito
				
				System.out.println("Quanto deseja depositar?");
				valorDeposito =leia.nextDouble();
				corrente.depositar(valorDeposito);
				System.out.println("Depositado o valor de R$"+valorDeposito);
				System.out.println("Saldo atualizado: R$"+corrente.getSaldo());
		
				}
			
			else if(servico == 5) {                                     // 5-Talionário
			   
				
				System.out.println("Deseja um talionário? Digite S-sim N-não");
				opcT = leia.next().toUpperCase().charAt(0);
				if(opcT == 'S') {
					System.out.println("Retire seu talionário");
					corrente.emiteTalionario();
					System.out.println("Número do Talionário: \t"+corrente.getTalionario());

	
				}

			}
			if ( servico == 6 ){                               //1- ******CONTA ESPECIAL************
				valorLimite = 3000;
				System.out.println("*********************CONTA ESPECIAL******************************************");
				System.out.println("Digite o nome do Cliente: ");
				especial.setNome(leia.next());
				System.out.println("Digite o número da conta: ");
				especial.setNumero(leia.nextInt());
				do {
				System.out.println("Digite o serviço desejado: ");
				System.out.println("\t1-Saldo \t 2-Extrato \t 3-Saque \t 4-Deposito \t 5-Juros \t 6-Sair");
				servico = leia.nextInt();
				 
				if(servico == 1 ) {                                                    //1-Saldo
					System.out.println("************************SALDO*************************************");
					System.out.println("Total:     R$\t"+especial.getSaldo());
				}
				
				else if(servico == 2 ) {                                                   //2-Extrato
					System.out.println("************************EXTRATO*******************************");
					System.out.println("Cliente:   "+especial.getNome());
					System.out.println("Conta bancaria: "+especial.getNumero());
					System.out.println("Depósitos: R$\t"+valorDeposito);
					System.out.println("Juros:     R$ \t"+valorJuros);
					System.out.println("Saques:    R$\t"+ valorSaque);
					System.out.println("Total:     R$\t"+especial.getSaldo());
					System.out.println("Limite Disponível:R$\t"+valorLimite);
				}
				else if(servico == 3 ) {                                      // 3-Saque
					System.out.println("Valor que deseja sacar: ");
					valorSaque =leia.nextDouble();
					//poupanca.sacar(valorSaque);
					if (valorSaque<=especial.getSaldo()) {
						System.out.println("Retirado o valor de R$"+valorSaque);
						especial.sacar(valorSaque);
						System.out.println("Saldo atualizado: R$"+especial.getSaldo());
					}else{
						System.out.println("Sacando do seu limite");
						valorLimite = valorLimite -valorSaque;
						System.out.println("Limite disponível: \t"+valorLimite);
					}
				}
					
				else if(servico == 4) {                                       // 4 deposito
					System.out.println("Quanto deseja depositar?");
					valorDeposito =leia.nextDouble();
					especial.depositar(valorDeposito);
					System.out.println("Depositado o valor de R$"+valorDeposito);
					System.out.println("Saldo atualizado: R$"+especial.getSaldo());
					
				}
				else if(servico == 5) {                                    // 5 - correçao monetária e juros
					
					valorJuros = especial.calculaJuros(especial.getSaldo());
					System.out.println("Valor do juros: R$ "+valorJuros);
					especial.depositar(valorJuros);
				
					}
				
			
				}
				while(servico !=6);                                     // 6 - OPERAÇÃO FINALIZADA
				System.out.println("OPERAÇÃO FINALIZADA");
				
			}
			
			}while(servico !=7);                                     // 7 - OPERAÇÃO FINALIZADA
				System.out.println("OPERAÇÃO FINALIZADA");
		
			
		if ( tipo1 == 3 ){    
			System.out.println("*********************CONTA EMPRESARIAL************************************");//1- ******EMPRESARIAL************
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
					System.out.println("Limite disponível: \t"+valorLimite);
				}
			}
				
			else if(servico == 4) {                                       // 4 deposito
				System.out.println("Quanto deseja depositar?");
				valorDeposito =leia.nextDouble();
				empresa.depositar(valorDeposito);
				System.out.println("Depositado o valor de "+valorDeposito);
				System.out.println("Saldo atualizado: "+empresa.getSaldo());
			}
			
			
			
			}while(servico !=5);                                     // 6 - OPERAÇÃO FINALIZADA
			System.out.println("OPERAÇÃO FINALIZADA");
		}
			
		}
	}
}

	


		



