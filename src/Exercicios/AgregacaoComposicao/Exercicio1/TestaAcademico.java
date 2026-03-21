package Exercicios.AgregacaoComposicao.Exercicio1;

public class TestaAcademico {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1, 1090482513, "Luciano", "ADS");
        Aluno a2 = new Aluno(2,1090482514, "Miguel", "ADS");

        Disciplina d1 = new Disciplina(1,"Programação Orientada a Objetos", "Daniel");

        d1.matricularAluno(a1);
        d1.matricularAluno(a2);

        d1.criarAvaliacao(1, "Prova Semestral");

        d1.getAvaliacao().get(0).adicionarQuestao(1, "O que é Encapsulamento?", 2.0f);
        d1.getAvaliacao().get(0).adicionarQuestao(2, "O que é um Objeto?", 3.0f);
        d1.getAvaliacao().get(0).adicionarQuestao(3, "O que é Agregação?", 5.0f);

        System.out.println(d1.toString());
    }
}
