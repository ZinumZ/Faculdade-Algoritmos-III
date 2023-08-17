package Ex05;

public class Disciplina {
    private String nome;
    private int codigo; //Código da disciplina

    public Disciplina(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }
    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
