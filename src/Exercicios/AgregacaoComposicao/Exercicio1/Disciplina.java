package Exercicios.AgregacaoComposicao.Exercicio1;

import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome, professor;
    private ArrayList<Aluno> aluno;
    private ArrayList<Avaliacao> avaliacao;

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.avaliacao = new ArrayList<>();
        this.aluno = new ArrayList<>();
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

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void criarAvaliacao(int id, String nome){
        Avaliacao av1 = new Avaliacao(id, nome);
        avaliacao.add(av1);


    }

    public ArrayList<Avaliacao> getAvaliacao() {
        return avaliacao;
    }

    public void matricularAluno(Aluno a){
        aluno.add(a);
    }



    // Essa parte eu usei IA para deixar mais bonito na hora de ler...
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("\n===== DISCIPLINA =====\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Professor: ").append(professor).append("\n");

        sb.append("\n--- ALUNOS ---\n");
        for (Aluno a : aluno) {
            sb.append(" • ").append(a.getNome())
                    .append(" | RA: ").append(a.getRa())
                    .append(" | Curso: ").append(a.getCurso())
                    .append("\n");
        }

        sb.append("\n--- AVALIAÇÕES ---\n");
        for (Avaliacao av : avaliacao) {
            sb.append(" > ").append(av.getNome()).append("\n");

            for (Questao q : av.getQuestao()) {
                sb.append("    - Questão ").append(q.getNumero())
                        .append(": ").append(q.getEnunciado())
                        .append(" (").append(q.getValor()).append(" pontos)\n");
            }
        }

        return sb.toString();
    }
}
