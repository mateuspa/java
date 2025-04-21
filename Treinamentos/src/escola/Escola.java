package escola;

public class Escola {
    public static void main(String[] args) {

        Aluno felipe = new Aluno("Felipe Júnior");
		felipe.setIdade(11);
        felipe.setSexo("masculino");

        System.out.println("O aluno "+felipe.getNome()+" tem "+felipe.getIdade()+" anos, sexo "+felipe.getSexo()+".");
    }
}
