package Atividade05;
public class Main {
    public static void main(String[] args) {
        LivroOnline livro1 = new LivroOnline("O Senhor dos Anéis", "J.R.R Tolkien",1954, 25.00, 1568);
        MusicaOnline musica1 = new MusicaOnline("Gita", 1.99, 1974, "Raúl Seixas");

        LivroOnline livro2 = new LivroOnline("Ponto de Impacto", "Dan Brown",2001, 17.50, 448);
        MusicaOnline musica2 = new MusicaOnline("November Rain", 1.99, 1991, "Guns N'Roses");

        livro1.detalhes();
        System.out.println();
        musica1.detalhes();
        System.out.println();

        livro2.detalhes();
        System.out.println();
        musica2.detalhes();
    }
}