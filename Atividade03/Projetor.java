package Atividade03;

public class Projetor {
    private String modelo;
    private String cor;
    private int brilho;
    private boolean colorido;

    public Projetor(String modelo, String cor, int brilho, boolean colorido) {
        this.modelo = modelo;
        this.cor = cor;
        this.brilho = brilho;
        this.colorido = colorido;
    }
    //Setter e getter
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCor(){
        return cor;
    }
    public void SetCor(String cor){
        this.cor = cor;
    }

    public int getBrilho(){
        return brilho;
    }
    public void setBrilho(int brilho){
        this.brilho = brilho;
    }

    public boolean getColorido(){
        return colorido;
    }

    public void setColorido(boolean colorido){
        this.colorido = colorido;
    }
    //Função de ligar e desligar
    public void ligar(){
        System.out.println("O dispositivo está ligado");
    }
    public void desligar(){
        System.out.println("O dispositivo está desligado");
    }


    //Mostrando os detalhes do projetor
    public String projetorDetalhes(){
        return "Projetor{" +
        "Modelo= [" + modelo + "]" +
        "; cor = [" + cor + "]" +
        "; brilho = [" + brilho + "]" +
        "; colorido = [" + colorido + ']';
    }
}
