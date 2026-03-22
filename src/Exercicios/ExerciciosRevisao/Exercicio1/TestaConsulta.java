package Exercicios.ExerciciosRevisao.Exercicio1;

import java.time.LocalDateTime;

public class TestaConsulta {
    static void main(String[] args) {
        Medico med1 = new Medico(23, "Pedro", "Ortopedista");
        Paciente pac1 = new Paciente(345, "José","447.150.908-05");
        LocalDateTime data = LocalDateTime.of(2026, 5, 25,15,00,00);
        Consulta cons1 = new Consulta(data, 350, med1, pac1);
        System.out.println(cons1.toString());

    }
}
