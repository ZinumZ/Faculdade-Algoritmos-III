package Atividade06;

public class Main {
    public static void main(String[] args) {
        Console Nswitch = new Console("Nintendo Switch", 1800);
        Console playstation = new Console("PlayStation 5", 3500);

        Nswitch.ligar();
        Nswitch.jogar();

        System.out.println();
        
        playstation.ligar();
        playstation.jogar();
        playstation.desligar();
    }
}