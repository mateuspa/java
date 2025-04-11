import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{

        // Usando classe Scanner para ler entrada do console com padrão de separação sendo <tecla espaço>
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            System.out.print("\nBem vindo ao Banco MATEUSPA");
            System.out.println("\nVamos fazer o seu primeiro acesso. \n ");

            System.out.print("Digite o número da sua conta (ex: 1021): ");
            int numero = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Digite o código da sua agência (ex: 067-8): ");
            String agencia = scanner.nextLine();

            System.out.print("Digite o seu nome completo: ");       
            String nomeCliente = scanner.nextLine();
    
            System.out.print("Digite o valor do seu primeiro deposito (ex: 100.00): ");
            Double saldo = scanner.nextDouble();

            System.out.print("\nOla " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.\n ");

            scanner.close();
        }
        catch (Exception exception){
            System.out.print("\n!!! O sistema deu um erro ainda nao tratado...!!!\n ");
        }
    }
}