package Atividade02;

public class Aviao {
    public static void main(String[] args) {
        Equipe aeromoca = new Equipe("Aeromoças", "Responsável pelo bem-estar, segurança e tranquilidade dos passageiros");
        Equipe piloto = new Equipe("Pilotos", "Responsável pela operação da aeronave, controlando todos os seus sistemas e navegando de um ponto a outro de forma precisa.");

        Tripulante tripulante1 = new Tripulante("Ana", 21, aeromoca);
        Tripulante tripulante2 = new Tripulante("Anderson", 32, piloto);

        System.out.println("Tripulante 1:");
        System.out.println("Nome: " + tripulante1.getNome());
        System.out.println("Idade: " + tripulante1.getIdade());
        System.out.println("Equipe: " + tripulante1.getEquipe().getNome());
        System.out.println("Descrição do departamento: " + tripulante1.getEquipe().getDescricao());

        System.out.println("\nTripulante 2:");
        System.out.println("Nome: " + tripulante2.getNome());
        System.out.println("Idade: " + tripulante2.getIdade());
        System.out.println("Equipe: " + tripulante2.getEquipe().getNome());
        System.out.println("Descrição da equipe: " + tripulante2.getEquipe().getDescricao());
    }
}
