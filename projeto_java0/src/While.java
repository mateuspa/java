import java.util.concurrent.ThreadLocalRandom; // Importar a classe ThreadLocalRandom para gerar número Double randômico

public class While {
    public static void main(String[] args) {
        
    double mesada = 50.00;
        while (mesada>0) {
            Double valorDoce = ThreadLocalRandom.current().nextDouble(1, 25); // Gerar double randômico entre 1 e 25
            
            if(valorDoce > mesada)
                break;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("O último doce que Mateus queria custa mais que o valor do saldo da mesada ("+ mesada + ")\n ");
    }
}