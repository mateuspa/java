package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("SERVINDO MESA");
	}

	private void pegarLancheCozinha() {
		System.out.println("PEGANDO LANCHE NA COZINHA");
	}

	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}
}