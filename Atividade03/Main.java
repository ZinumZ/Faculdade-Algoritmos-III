package Atividade03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Projetor1=====");
        System.out.print("Modelo: ");
        String modelo1 = scanner.nextLine();

        System.out.print("Cor: ");
        String cor1 = scanner.nextLine();

        System.out.print("Brilho máximo [nits]: ");
        int brilho1 = scanner.nextInt();

        System.out.print("Projeção colorida? [1 - Sim, 2 - Não]: ");
        int opcao1 = scanner.nextInt();
        boolean colorido1 = (opcao1 == 1);
        scanner.nextLine(); // Consumir quebra de linha

        Projetor projetor1 = new Projetor(modelo1, cor1, brilho1, colorido1);

        System.out.println("=====Projetor2=====");
        System.out.print("Modelo: ");
        String modelo2 = scanner.nextLine();

        System.out.print("Cor: ");
        String cor2 = scanner.nextLine();

        System.out.print("Brilho máximo [nits]: ");
        int brilho2 = scanner.nextInt();

        System.out.print("Projeção colorida? [1 - Sim, 2 - Não]: ");
        int opcao2 = scanner.nextInt();
        boolean colorido2 = (opcao2 == 1);
        scanner.nextLine(); // Consumir quebra de linha

        Projetor projetor2 = new Projetor(modelo2, cor2, brilho2, colorido2);

        scanner.close();

        System.out.println("\nProjetor 1:");
        System.out.println(projetor1.projetorDetalhes());

        System.out.println("\nProjetor 2:");
        System.out.println(projetor2.projetorDetalhes());
    }
}
