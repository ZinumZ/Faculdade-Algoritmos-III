package Atividade06;

abstract class Dispositivo {
    private String nome;
    private float preco;
    private boolean ligado;

    public Dispositivo(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
        this.ligado = false;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        System.out.println(getNome() + " está ligado.");
        this.ligado = true;
    }

    public void desligar() {
        System.out.println(getNome() + " está desligado.");
        this.ligado = false;
    }
}