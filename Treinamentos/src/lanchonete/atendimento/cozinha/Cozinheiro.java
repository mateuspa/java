package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    // visibilidade dentro do pacote
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }

    public void adicionarComboNoBalcao() {
        adicionarSucoNoBalcao();
        adicionarLancheNoBalcao();
    }

    // visibilidade apenas dentro da classe
    private void prepararLanche() {
        selecionarIngredientesLanche();
        lavarIngredientes();
        fritarIngredientesLanche();
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }

    private void prepararVitamina() {
        selecionarIngredientesVitamina();
        lavarIngredientes();
        baterVitaminaLiquidificador();
        System.out.println("PREPARANDO VITAMINA");
    }
    @SuppressWarnings("unused")
    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONADO O PAO, SALADA, OVO E CARNE");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }

    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }

    private void fritarIngredientesLanche() {
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGUER");
    }
    @SuppressWarnings("unused")
    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }

}