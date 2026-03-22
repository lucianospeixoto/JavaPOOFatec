package Exercicios.ExerciciosRevisao.Exercicio4;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadors;

    public Projeto() {
        this.programadors = new ArrayList<>();
    }

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programadors = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public ArrayList<Programador> getProgramadors() {
        return programadors;
    }

    public void setProgramadors(ArrayList<Programador> programadors) {
        this.programadors = programadors;
    }

    public void AdicionarProgramador(int id, Programador programador){
        Programador a = new Programador(id, programador.getNome(), programador.getLinguagemPrincipal());
        this.programadors.add(a);

    }

    public void ListarProgramadores(){
        System.out.println("Programadores no Projeto - " + getNomeProjeto() + ": ");
        for (int i = 0; i < programadors.size(); i++){
            System.out.println(programadors.get(i));
        }
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nomeProjeto='" + nomeProjeto + '\'' +
                ", programadors=" + programadors +
                '}';
    }
}
