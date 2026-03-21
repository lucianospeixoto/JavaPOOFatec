package Exercicios.ClasseObjeto.Exercicio3;

public class TestaPlacar {
    public static void main(String[] args) {
        Placar pla1 = new Placar("Sesi Franca", "Flamengo");

        // Primeiro Quarto
        pla1.registrarPonto("Sesi Franca", 1);
        pla1.registrarPonto("Flamengo", 3);
        pla1.proximoQuarto();
        System.out.println(pla1.toString());

        // Segundo Quarto
        pla1.registrarPonto("Sesi Franca", 3);
        pla1.registrarPonto("Flamengo", 1);
        pla1.proximoQuarto();
        System.out.println(pla1.toString());

        // Terceiro Quarto
        pla1.registrarPonto("Sesi Franca", 2);
        pla1.registrarPonto("Flamengo", 1);
        pla1.proximoQuarto();
        System.out.println(pla1.toString());

        // Quarto Quarto
        pla1.registrarPonto("Sesi Franca", 3);
        pla1.registrarPonto("Flamengo", 2);
        pla1.proximoQuarto();

        System.out.println(pla1.toString());

    }
}
