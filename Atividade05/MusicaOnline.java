package Atividade05;

class MusicaOnline extends ProdutoOnline {
    private String artista;

    public MusicaOnline(String nome, double preco, int ano, String artista) {
        super(nome, preco, ano);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public void detalhes() {
        System.out.println("Música Digital: " + getNome());
        System.out.println("Artista: " + getArtista());
        System.out.println("Ano: "+ getAno());
        System.out.println("Preço: $" + getPreco());
    }
}