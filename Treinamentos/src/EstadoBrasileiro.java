public enum EstadoBrasileiro {
    SAO_PAULO ("SP","Sao Paulo"),
	RIO_JANEIRO ("RJ", "Rio de Janeiro"),
	PIAUI ("PI", "Piaui"),
	MARANHAO ("MA","Maranhao"),
	MINAS_GERAIS ("MG", "Minas Gerais") ;
	
	private String nome;
	private String sigla;
	
    // método construtor
	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
}
