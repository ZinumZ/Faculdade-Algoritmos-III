package Atividade04;

public class Violao extends Instrumento {
    public Violao(String nome, int preco){
        super(nome, preco);
    }

    @Override
    public void transmitirSom() {
        System.out.println("O violão está sendo tocado.");
    }
}
