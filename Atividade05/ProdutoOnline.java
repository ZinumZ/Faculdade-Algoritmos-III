package Atividade05;

abstract class ProdutoOnline {
    private String nome;
    private double preco;
    private int ano;

    public ProdutoOnline(String nome, double preco, int ano) {
        this.nome = nome;
        this.preco = preco;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void aplicarTaxa() {
        preco += 1.0; // Adiciona 1 real ao preço
    }
    public abstract void detalhes();
}