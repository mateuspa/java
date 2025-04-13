import java.util.Scanner;

public class CalculaMediaAlunos {

    public static void main(String[] args) throws Exception {
        try {
            Scanner scan = new Scanner(System.in);
            String[] alunos = { "Mateus", "Camila", "Lucas", "Bruna", "Pedro" };

            double media = calculaMediaTurma(alunos, scan);

            System.out.printf("Média da turma %.2f", media); // formata media com 2 casas decimais
        }

        catch (Exception InputMismatchException) {
            System.out.printf("Problema com o formato do número digitado!! Tente novamente...");
        }

    }

    public static double calculaMediaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }
}