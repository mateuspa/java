package treinamento;
public class MinhaClasse {

public static void main (String[] args) {
    String nome = "Mateus";
    String sobrenome = "Prince Antunes";
    final float pi = 3.14159265358979323846F;

    String nomeCompleto = nomeCompleto (nome, sobrenome);
    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String nome, String sobrenome){
    return "Nome completo: "+nome+" "+sobrenome;
}

}