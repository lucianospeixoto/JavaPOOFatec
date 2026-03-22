package Exercicios.ExerciciosRevisao.Exercicio4;

public class TestaProjeto {
    public static void main(String[] args) {

        // Criei os programadores
        Programador prog1 = new Programador(1, "Luciano", "Java");
        Programador prog2 = new Programador(2, "Ryan", "Java");
        Programador prog3 = new Programador(3, "Miguel", "Python");
        Programador prog4 = new Programador(4, "Felipe", "Flutter");

        // Criei o Projeto
        Projeto proj1 = new Projeto(3, "Gestão Estoque");

        // Adicionei os programadores no Projeto
        proj1.AdicionarProgramador(1, prog1);
        proj1.AdicionarProgramador(2, prog2);
        proj1.AdicionarProgramador(3, prog3);
        proj1.AdicionarProgramador(4, prog4);

        // Listei os programadores
        proj1.ListarProgramadores();
    }
}
