package Atividade04;

public class Main {
    public static void main(String[] args) {
        Instrumento instrumento = new Instrumento("Instrumento Musical", 1000);
        Bateria bateria = new Bateria("Ibanez", 2100);
        Violao violao = new Violao("Gibson", 5000);

        System.out.println("Instrumento Musical qualquer:");
        System.out.println("Nome: " + instrumento.getNome());
        System.out.println("preco: " + instrumento.getPreco());
        instrumento.transmitirSom();

        System.out.println("\nBateria:");
        System.out.println("Nome: " + bateria.getNome());
        System.out.println("Preco: " + bateria.getPreco());
        bateria.transmitirSom();

        System.out.println("\nViolão:");
        System.out.println("Nome: " + violao.getNome());
        System.out.println("Preço: " + violao.getPreco());
        violao.transmitirSom();
    }
}