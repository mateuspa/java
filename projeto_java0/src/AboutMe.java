import java.util.Locale;
import java.util.Scanner;
public class AboutMe{

    public static void main (String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            /* Utilizando String args para receber os argumentos. Configurar String args no launch.json para usar no Terminal.
            String nome = args[0];
            String sobrenome = args[1];
            int idade = Integer.valueOf(args[2]);
            double altura = Double.valueOf(args[3]);
            */

            // Usando classe Scanner para ler entrada do console com padrão de separação sendo <tecla espaço>
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            System.out.println("Digite sua altura em metros: ");
            double altura = scanner.nextDouble();

            scanner.close();

            System.out.println("\nOla, me chamo: " + nome + " "+sobrenome);
            System.out.println("Tenho " + idade + " " + "anos");
            System.out.println("Minha altura é " + altura + " m\n");
        }

        catch (Exception exception){
            System.out.print("\n!!! O sistema deu um erro ainda nao tratado... !!!\n ");
        }
    }
    
}