package Atividade05;

class LivroOnline extends ProdutoOnline {
    private int numeroPaginas;
    private String autor;

    public LivroOnline(String nome, String autor, int ano, double preco, int numeroPaginas) {
        super(nome, preco, ano);
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void detalhes() {
        System.out.println("Livro Digital: " + getNome());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: "+ getAno());
        System.out.println("Número de Páginas: " + getNumPaginas());
        System.out.println("Preço: $" + getPreco());
        
    }
}