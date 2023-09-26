package Atividade07;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro console: ");
        String nomeConsole = scanner.nextLine();
        System.out.print("Digite o preço: ");
        float precoConsole = scanner.nextFloat();

        Console console1 = new Console(nomeConsole, precoConsole);

        System.out.print("Digite o nome do segundo console: ");
        scanner.nextLine(); 
        String nomeConsole2 = scanner.nextLine();
        System.out.print("Digite o preço: ");
        float precoConsole2 = scanner.nextFloat();

        Console console2 = new Console(nomeConsole2, precoConsole2);

        scanner.close();

        Console consoles[] = {console1, console2}; 

        console1.ligar();
        console2.ligar();
        
        for (int i = 0; i < consoles.length; i++) {

            consoles[i].detalhesConsole();
      
        }
    }
}