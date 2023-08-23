package Atividade04;
public class Instrumento {
    private String nome;
    private int preco;

    public Instrumento(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void emitirSom() {
        System.out.println("O instrumento musical emitiu um som.");
    }
}