package Atividade06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro console: ");
        String nomeConsole = scanner.nextLine();
        System.out.print("Digite o preço: ");
        float precoConsole = scanner.nextFloat();

        Console Console1 = new Console(nomeConsole, precoConsole);

        System.out.print("Digite o nome do segundo console: ");
        scanner.nextLine(); 
        String nomeConsole2 = scanner.nextLine();
        System.out.print("Digite o preço: ");
        float precoConsole2 = scanner.nextFloat();

        Console Console2 = new Console(nomeConsole2, precoConsole2);

        scanner.close();
        System.out.println();
        
        Console1.ligar();
        Console1.jogar();

        System.out.println();

        Console2.ligar();
        Console2.jogar();
        Console2.desligar();
    }
}