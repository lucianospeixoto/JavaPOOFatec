package Exercicios.ExerciciosRevisao.Exercicio3;

public class TestaContratacao {
    public static void main(String[] args) {
        // Criei o Atleta
        Atleta at1 = new Atleta(10, "Luciano", "Atacante");


        // Criei o time
        Time tim1 = new Time(12, "Franca", "Helinho");

        //Contratei o Atleta para o Time
        tim1.contratarAtleta(1, at1);
        System.out.println(tim1);

        // Anulei o time
        tim1 = null;
        System.out.println("O objeto Time foi anulado (tim1 = null)");

        // Jogador ainda existe sem time
        System.out.println(at1);
        System.out.println("Prova de vida do Atleta: " + at1.getNome() + " ainda existe na memória!");
    }
}
