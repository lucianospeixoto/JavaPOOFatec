package Exercicios.ExerciciosRevisao.Exercicio8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sessao {
    private int id, sala;
    private LocalDateTime horario;
    private Filme filme;
    private ArrayList<Ingresso> ingressos;

    public Sessao() {
        this.ingressos = new ArrayList<>();
    }

    public Sessao(int id, int sala, LocalDateTime horario) {
        this.id = id;
        this.sala = sala;
        this.horario = horario;
        this.ingressos = new ArrayList<>();
    }

    public void vincularFilme(Filme f){
        this.filme = f;

    }


    public void venderIngresso(int id, String assento, String tipo, float preco){
        float precoFinal = preco;
        if (tipo.equalsIgnoreCase("Meia")){
            precoFinal = preco /2;
        }
        Ingresso novoIngresso = new Ingresso(id, assento, tipo, precoFinal);
        this.ingressos.add(novoIngresso);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");

        String texto = "========== RELATORIO DA SESSAO ==========\n";
        texto += "ID: " + this.id + "\n";
        texto += "SALA: " + this.sala + "\n";
        texto += "HORARIO: " + this.horario.format(formatoBR) + "\n";
        texto += "FILME: " + this.filme.getTitulo() + "\n"; // Pega o nome do filme vinculado
        texto += "----------------------------------------\n";
        texto += "INGRESSOS VENDIDOS:\n" + this.ingressos + "\n";
        texto += "========================================";

        return texto;
    }
}
