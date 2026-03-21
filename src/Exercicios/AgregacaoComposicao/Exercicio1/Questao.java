package Exercicios.AgregacaoComposicao.Exercicio1;

public class Questao {
    private int numero;
    private String enunciado;
    private Float valor;

    public Questao() {
    }

    public Questao(int numero, String enunciado, Float valor) {
        this.numero = numero;
        this.enunciado = enunciado;
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Questao{" +
                "numero=" + numero +
                ", enunciado='" + enunciado + '\'' +
                ", valor=" + valor +
                '}';
    }
}
