package Exercicios.ExerciciosRevisao.Exercicio2;

import java.time.LocalDateTime;

public class TestaEmprestimo {
    static void main(String[] args) {
        Leitor lei1 = new Leitor(23, "Gabriel");
        Livro liv1 = new Livro(10, "Harry Potter: A Pedra Filosofal", "JK Rowling");
        LocalDateTime dataEmprestimo = LocalDateTime.now();
        LocalDateTime dataDevolucaoPrevista = LocalDateTime.of(2026, 4, 10, 12, 30,00);

        Emprestimo emp1 = new Emprestimo(dataEmprestimo, dataDevolucaoPrevista, lei1, liv1);
        System.out.println(emp1.toString());
    }
}
