package Atividade07;

class Console extends Dispositivo {
    public Console(String nome, float preco) {
        super(nome, preco);
    }

    @Override
    public void detalhesConsole() {
        if (isLigado()) {
            System.out.println("Jogando no " + getNome() + " de preço R$ " + getPreco());
        } else {
            System.out.println("Não é possível jogar. O " + getNome() + " está desligado.");
        }
    }

    // Método polimórfico
    public static void mostrarDetalhes(Dispositivo dispositivo) {
        dispositivo.detalhesConsole();
    }
}
