package Ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Criando Turma=====");
        System.out.print("Período Letivo:");
        int periodoLetivo1 = scanner.nextInt();

        System.out.print("Máximo de Estudantes:");
        int maxEstudantes1 = scanner.nextInt();

        System.out.print("Número de estudantes matriculados:");
        int estudantesMatriculados1 = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.print("Docente:");
        String docente1 = scanner.nextLine();

        System.out.print("Disciplina:");
        String disciplina1 = scanner.nextLine();

        Turma turma1 = new Turma(periodoLetivo1, maxEstudantes1, estudantesMatriculados1, docente1, disciplina1);

        scanner.close();

        System.out.println("\n\nDetalhes da Turma:");
        System.out.print(turma1.criarTurma());
        System.out.println("=================");
    }
}
