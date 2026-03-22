package Exercicios.ExerciciosRevisao.Exercicio8;

import java.time.LocalDateTime;

public class TestaCinema {
    static void main(String[] args) {
        Filme filme1 = new Filme(1,160, "Batman", "Herói");
        Filme filme2 = new Filme(2, 172, "Duna", "Fantasia");

        LocalDateTime data1 = LocalDateTime.of(2026, 6,20,20,00,00);
        Sessao sessao1 = new Sessao(1, 01, data1);

        sessao1.vincularFilme(filme1);

        sessao1.venderIngresso(1, "A1", "Inteira", 40.00f);
        sessao1.venderIngresso(1, "A2", "Meia", 40.00f);
        sessao1.venderIngresso(1, "A2", "Meia", 40.00f);

        System.out.println(sessao1.toString());
    }
}
