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
		
		
		cavalo1.setNome("Cavalo Teste");
		cavalo1.setIdade(1);
		System.out.println(cavalo1.getNome());
		System.out.println("A��o do animal: "+ cavalo1.getAcaoCavalo());
		cavalo1.emitirSom();

		
		System.out.println("=============================================================");
		
		
		cachorro1.setNome("Cao teste");
		cachorro1.setIdade(7);
		System.out.println(cachorro1.getNome());
		System.out.println("A��o do animal: "+ cachorro1.getAcaoCachorro());
		cachorro1.emitirSom();

		
		System.out.println("=============================================================");
		
		preguica1.setNome("Pregui�a teste");
		preguica1.setIdade(7);
		System.out.println(preguica1.getNome());
		System.out.println("A��o do animal: "+ preguica1.getAcaoPreguica());
		preguica1.emitirSom();

	}
	
}
		
