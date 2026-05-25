package Exercicios.ExerciciosRevisao.Exercicio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private LocalDateTime dataEmprestmo, dataDevolucaoPrevista;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo() {
    }

    public Emprestimo(LocalDateTime dataEmprestmo, LocalDateTime dataDevolucaoPrevista, Leitor leitor, Livro livro) {
        this.dataEmprestmo = dataEmprestmo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.leitor = leitor;
        this.livro = livro;
    }

    public LocalDateTime getDataEmprestmo() {
        return dataEmprestmo;
    }

    public void setDataEmprestmo(LocalDateTime dataEmprestmo) {
        this.dataEmprestmo = dataEmprestmo;
    }

    public LocalDateTime getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDateTime dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }


    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyy 'às' HH:mm");
        return "Emprestimo{" +
                "dataEmprestmo=" + dataEmprestmo.format(formatoBR) +
                ", dataDevolucaoPrevista=" + dataDevolucaoPrevista.format(formatoBR) +
                ", \nleitor=" + leitor +
                ", \nlivro=" + livro +
                '}';
    }
}
