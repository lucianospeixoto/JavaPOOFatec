package Exercicios.ExerciciosRevisao.Exercicio8;

public class Filme {
    private int id, duracao;
    private String titulo, genero;

    public Filme() {
    }

    public Filme(int id, int duracao, String titulo, String genero) {
        this.id = id;
        this.duracao = duracao;
        this.titulo = titulo;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return titulo + " (" + genero + ") - " + duracao + " min";
    }
}
