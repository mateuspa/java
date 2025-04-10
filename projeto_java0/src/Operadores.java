public class Operadores {

    public static void main (String[] args) {
        int numero = 1;
        int adicao = 10;
        boolean verdade = true;
        
        // negação
        System.out.println("// negaçao");
        numero = - numero;
        System.out.println(numero);
        System.out.println(!verdade);

        // incremento unitário
        System.out.println("// incremento unitário");
        System.out.println(adicao);
        adicao++;
        System.out.println(adicao);
        System.out.println(++adicao);
        
        // equivalencia if/else e operador ternário
        System.out.println("// equivalencia if/else e operador ternário");
        int a = 5;
        int b = 6;
        String resultado1;
        
        // usando if/else
        if (a==b)
            resultado1 = "Verdadeiro";
        else
            resultado1 = "Falso";
        System.out.println(resultado1);

        // usando operador ternário
        String resultado2 = a==b ? "Verdadeiro" : "Falso";
        int resultado3 = a==b ? 1 : 0;
        System.out.println(resultado2);
        System.out.println(resultado3);
        
        // operador relacional para int
        System.out.println("// operador relacional para int");
        int c = 8;
        int d = 8;
        System.out.println(c == d);

        // Comparando String não é recomendado utilizar == ou !=
        System.out.println("// operador relacional para Strings");
        String nomeUm = "Mateus";
        String nomeDois ="Mateus";
        System.out.println(nomeUm.equals(nomeDois)); // Utilizando método "equals" para comparar conteúdo de Strings de forma adequada

        // Comparando booleanos
        System.out.println("// Comparando booleanos");
        boolean y = true;
        boolean z = true;
        if (y && z)
            System.out.println("y e Z sao ambos verdadeiros");
        if (y || z)
            System.out.println("y ou Z sao verdadeiros");
        else
            System.out.println("y e Z sao falsos");
    }

}