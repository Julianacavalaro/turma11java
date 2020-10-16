package polimorfismo;

public class ImplementeUmPrograma {

	public static void main(String[] args) {
		/*
		 * Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio anterior 
		 * e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto �, independente 
		 * do tipo de animal.
		 */
		Cachorro cachorro1 =new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		

		cavalo1.emiteNomeEIdade("Cavalinho",16);
	
		System.out.println("Som do animal: ");
		cavalo1.emitirSom();
		System.out.println("A��o do animal: ");
		cavalo1.emitirAcao();
		
		System.out.println("=============================================================");
		
		preguica1.emiteNomeEIdade("Preguicinha",4);
		
		System.out.println("Som do animal: ");
		preguica1.emitirSom();
		System.out.println("A��o do animal: ");
		preguica1.emitirAcao();
		
		System.out.println("=============================================================");
		
		cachorro1.emiteNomeEIdade("Pitoco",6);
		
		System.out.println("Som do animal: ");
		cachorro1.emitirSom();
		System.out.println("A��o do animal: ");
		cachorro1.emitirAcao();


	}
	
}
		
