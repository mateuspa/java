package lanchonete;

import lanchonete.areacliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {

		//ações que estabelecimento precisa ter ciência
		Cozinheiro cozinheiro = new Cozinheiro();
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();

		Atendente atendente = new Atendente();
		atendente.servindoMesa();
		atendente.receberPagamento();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();

	}

}
