package Atividade06;
class Console extends Dispositivo {
    public Console(String nome, float preco) {
        super(nome, preco);
    }

    public void jogar() {
        if (isLigado()) {
            System.out.println("Jogando no " + getNome() + " de preço R$" + getPreco());
        } else {
            System.out.println("Não é possível jogar. O " + getNome() + " está desligado.");
        }
    }
}