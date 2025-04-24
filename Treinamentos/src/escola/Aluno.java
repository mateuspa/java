package escola;

public class Aluno {
    private final String nome;
    private int idade;
    private String sexo;

    public String getNome() {
        return nome;
    }
    
    // método construtor 
    public Aluno(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
