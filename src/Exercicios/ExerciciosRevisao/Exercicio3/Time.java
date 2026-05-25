package Exercicios.ExerciciosRevisao.Exercicio3;

import AgregacaoComposicao.Produto;
import AgregacaoComposicao.itemCarrinho;

import java.util.ArrayList;

public class Time {
    private int id;
    private String nome, tecnico;
    private ArrayList<Atleta> atletas;

    public Time() {
        this.atletas = new ArrayList<>();
    }

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(ArrayList<Atleta> atletas) {
        this.atletas = atletas;
    }

    public void contratarAtleta(int id, Atleta atleta){
        Atleta a = new Atleta(id, atleta.getNome(), atleta.getPosicao());
        this.atletas.add(a);


    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", atletas=" + atletas +
                '}';
    }
}
