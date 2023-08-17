package Ex05;

public class Estudante {
    private String nome;
    private int matricula;

    public Estudante(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
