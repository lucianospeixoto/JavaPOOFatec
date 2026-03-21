package Exercicios.Encapsulamento.Exercicio2;

public class TestaDrone {
    static void main(String[] args) {
        Drone dr1 = new Drone("1234", 1.0f, 20, true);
        dr1.decolar();
        System.out.println(dr1.toString());
        dr1.aumentaAltura(10);
        System.out.println( dr1.toString());
    }
}
