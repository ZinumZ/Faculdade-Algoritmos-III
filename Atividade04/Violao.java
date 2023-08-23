package Atividade04;

public class Violao extends Instrumento {
    public Violao(String nome, int preco){
        super(nome, preco);
    }

    @Override
    public void emitirSom() {
        System.out.println("O violão está sendo tocado.");
    }
}
