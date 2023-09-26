package test;

public class Construtor {
    private String nome;

    public Construtor(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void detalhesNome(){
        System.out.println("Nome do usuário: "+ getNome());
    }
}
