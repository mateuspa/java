import java.util.Random; // Importando classe Random para gerar número rabdômico

public class DoWhile {
	public static void main(String[] args) {
		System.out.println("Discando...");

		//excutando pelo menos uma vez e até alguém atender
		do
			System.out.println("Telefone tocando");
		while(tocando());
			System.out.println("Alô !!!");
	}

	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(2)==1;
		System.out.println("Atendeu? " + atendeu);
			
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}