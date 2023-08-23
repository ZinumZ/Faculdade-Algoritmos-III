package Atividade04;

public class Bateria extends Instrumento {
    public Bateria(String nome, int preco){
        super(nome, preco);
    }

    @Override
    public void transmitirSom() {
        System.out.println("A Bateria está sendo tocada.");
    }
}
