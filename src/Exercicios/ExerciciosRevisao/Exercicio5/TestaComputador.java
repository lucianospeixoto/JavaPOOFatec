package Exercicios.ExerciciosRevisao.Exercicio5;

public class TestaComputador {
    static void main(String[] args) {

        // Criei o computador
        Computador com1 = new Computador(1, "LeNovo", "Intel", "I5", 2.9);
        System.out.println(com1.toString());

        //Processador Antes
        System.out.println(com1.getProcessador());

        // Deletei o computador
        com1 = null;

        System.out.println("O computador com1 é null. Não existe mais acesso ao seu processador.");
    }
}
