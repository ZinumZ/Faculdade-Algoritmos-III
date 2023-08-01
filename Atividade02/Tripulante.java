package Atividade02;

public class Tripulante {
    private String nome;
    private int idade;
    private Equipe equipe;

    public Tripulante(String nome, int idade, Equipe equipe) {
        this.nome = nome;
        this.idade = idade;
        this.equipe = equipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
}
