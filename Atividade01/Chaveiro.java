public class Chaveiro {
    public String nomeChaveiro, tamanho;
    public int quantidade;

    public Chaveiro(String nomeChaveiro, String tamanho, int quantidade) {
        this.nomeChaveiro = nomeChaveiro;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
    }

    public String obterNome() {
        return nomeChaveiro;
    }

    public void definirNome(String nomeChaveiro) {
        this.nomeChaveiro = nomeChaveiro;
    }

    public String obterTamanho(){
        return tamanho;
    }

    public void definirTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public int obterQuantidade(){
        return quantidade;
    }

    public void definirQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome no chaveiro: " + nomeChaveiro);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Quantidade: " + quantidade);
    }
}


//Revisar conceitos de Getters e Setters 21/07
//Setter sempre será void??