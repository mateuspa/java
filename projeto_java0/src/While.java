import java.util.concurrent.ThreadLocalRandom; // Importar a classe ThreadLocalRandom para gerar número Double randômico

public class While {
    public static void main(String[] args) {
        
    double mesada = 50.00;
        while (mesada>0) {
            Double valorDoce = ThreadLocalRandom.current().nextDouble(1, 25); // Gerar double randômico entre 1 e 25
            
            if(valorDoce > mesada)
                break;

            System.out.printf("Doce do valor: %.2f Adicionado no carrinho \n", valorDoce); // formatando com 2 casas decimais
            mesada = mesada - valorDoce;
        }
        System.out.printf("O último doce que Mateus queria custa mais que o valor do saldo da mesada (%.2f) \n ", mesada);
    }
}