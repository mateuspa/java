// Simulador de processo seletivo com verificação de salário e contato do RH com o candidato aprovado

// Método gerador de número randômico
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        System.out.printf("\nProcesso seletivo simplificado \n \n");

        int n = selecionarCanditatos(); // recebe quantidade de canditados contactados e aprovados pelo RH

        if (n == 0)
            System.out.printf("Ninguem foi aprovado no processo processo seletivo simplificado... \n");
        else
            System.out.printf("\nQuantidade de Canditados aprovados e contactados pelo RH: " + n + "\n ");

        System.out.printf("\nFim do processo seletivo simplificado \n ");
    }

    // percorre string para verificar se atende critérios de seleção de candidatos
    public static int selecionarCanditatos() {
        String[] candidatos = { "Mateus", "Lucas", "Michel", "Humberto", "Carolina", "Fernanda", "Marcela", "Vicente",
                "Fátima", "Hélio" };
        double salarioMaximo = 3000.00; // salário máximo para a posição
        int candidatosSelecionados = 0; // Quantidade de canditados selecionados para a posição;
        int candidatosContactados = 0; // Quantidade de canditados contactados e confirmados para a posição;

        for (String candidato : candidatos) {
            double salarioPretendido = valorPretendido();
             
            // numero máximo de candidatos aprovados = 5
            if (candidatosSelecionados < 10) {
                if (salarioPretendido < salarioMaximo) {
                    candidatosSelecionados++;
                    System.out.printf("Candidato: " + candidato + " | salário Pretendido %.2f -> ", salarioPretendido);
                    System.out.printf("Ligar para o candidato... ");

                    // tenta ligar 3 vezes para candidato
                    int tentativasContato = 0;
                    do{
                        boolean contactado = atendeu();
                        if (contactado == true) {
                            System.out.printf("Candidato contactado na tentativa "+tentativasContato+" e aprovado!!!");
                            candidatosContactados++;
                            break;
                        }
                        else tentativasContato++;
                    }while (tentativasContato <3);    
                    
                    if (tentativasContato == 3) System.out.printf("Nao conseguimos falar com o candidato!");

                    System.out.printf(" \n");

                }
            } else {
                break;
            }
        }

        return candidatosContactados;
    }

    // gera e retorna número randômico entre 1800 e 5000
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 3000);
    }

    // gera número randômico entre 0 a 3, e se gerar 1 returna true;
    static boolean atendeu() {
        return new Random().nextInt(3) == 1;
    }
}