public class BreakContinue {
    public static void main(String[] args) {
    
        // Usando contine e break
        for (int i = 0; i < 20; i++) {
            if (i == 6)
                continue;  // Pula para póxima iteração do loop quando i é igual a 6
            if (i == 9)
                break;  // Sai do loop quando i é igual a 9
            System.out.println(i);
        }
    }
}