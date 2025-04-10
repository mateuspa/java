public class MinhaClasse {

public static void main (String[] args) {
    String nome = "Mateus";
    String sobrenome = "Prince Antunes";

    //constante
    final double PI = 3.14159265358979323846;

    String nomeCompleto = nomeCompleto (nome, sobrenome);
    System.out.println(nomeCompleto);
    System.out.println("PI = " + PI);
}

public static String nomeCompleto (String nome, String sobrenome){
    return "Nome completo: "+nome+" "+sobrenome;
}

}