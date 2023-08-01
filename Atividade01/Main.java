public class Main {
    public static void main(String[] args) {
        Chaveiro chaveiro1 = new Chaveiro("Madrugo Codando", "Único", 40);
        Chaveiro chaveiro2 = new Chaveiro("Instituto de Computação", "Único", 60);

        System.out.println("====Chaveiro 1====");
        chaveiro1.mostrarDetalhes();

        System.out.println("\n====Chaveiro 2====");
        chaveiro2.mostrarDetalhes();
    }
}

//Eu criei uma classe simples chamada "Chaveiro" que acaba mostrando os detalhes do estoque de 2 produtos (objetos) de mesma classe