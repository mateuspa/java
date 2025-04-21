package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("CONTROLANDO ENTRADA DOS ITENS");
	}

	private void controlarSaida() {
		System.out.println("CONTROLANDO SAIDA DOS ITENS");
	}

	//ação que somente o pacote cozinha precisa conhecer (default)
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida();
	}

	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO GAS");
	}

}
