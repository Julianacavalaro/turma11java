package listaDeExercicios;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * 3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que 
		 * cada instância da classe Empregado tem, para além dos atributos que caracterizam a 
		 * classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base) e
		 *  imposto (porcentagem retida dos impostos). Implemente a classe Empregado com métodos 
		 *  seletores e modificadores e um método calcularSalario. Escreva um programa de teste 
		 *  adequado para a classe Empregado. 
		 */
		
		//PROGRAMA DE TESTE
		 
		Empregado empregado1 = new Empregado();
		empregado1.setCodigoSetor(02030);
		empregado1.setNome("Juliana");
		empregado1.setTelefone(99998888);
		empregado1.setEndereco("Rua do Sabão Crá");
		empregado1.setSalarioBase(1060.40);
		empregado1.setImposto(95.60);
		
		System.out.println("Nome: "+ empregado1.getNome()+"\nTelefone: "+ empregado1.getTelefone()+ "\nEndereço: "+empregado1.getEndereco());
		System.out.println("Código do setor: "+ empregado1.getCodigoSetor()+"\nSalario base: \t\t"+ empregado1.getSalarioBase() +"\t\t\nImposto: \t\t"+ empregado1.getImposto()+"\t\t");
		System.out.printf("Calculo salário:\t%.2f \t",empregado1.calcularSalario());
	}

}
