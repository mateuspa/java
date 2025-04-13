public class Condicional_Encadenado {
    public static void main(String[] args) {
        
        // Condicionais Encadenadas
        int nota = 10;
    
        if (nota == 10)
            System.out.println("\nAprovado com louvor.\n");
        else if (nota >= 7 && nota < 10)
            System.out.println("Recuperaçao");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperaçao");
        else
            System.out.println("Reprovado");
    }
}