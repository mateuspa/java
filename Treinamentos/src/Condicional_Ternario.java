public class Condicional_Ternario {
    public static void main(String[] args) {
        int nota = 6;

    // Condicional Ternário Simples
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

    // Condicional Ternário Composto
        resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperaçao" : "Reprovado";
        System.out.println(resultado);
	}
}