package Ex05;

public class Docente {
    private String nome;
    private int registro; //Número de registro

    public Docente(String nome, int registro){
        this.nome = nome;
        this.registro = registro;
    }
    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRegistro() {
        return registro;
    }
    public void setRegistro(int registro) {
        this.registro = registro;
    }
}
