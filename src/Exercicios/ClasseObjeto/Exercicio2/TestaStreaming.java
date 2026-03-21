package Exercicios.ClasseObjeto.Exercicio2;

public class TestaStreaming {
    static void main(String[] args) {
        // Criei o Objeto da ci=onta do Streaming
        Streaming st1 = new Streaming("Luciano", "Basico");
        System.out.println(st1.toString());

        // Coloquei um filme para assistir
        st1.assistirFilme("Até o Ultimo Homem");
        System.out.println(st1.toString());

        // Cancelei a Assinatura
        st1.cancelarAssinatura();
        System.out.println(st1.toString());

        // Tentei assistir um filme com a Assinatura Cancelada
        st1.assistirFilme("Até o Ultimo Homem");

        // Ativei a Assinatura
        st1.ativarAssinatura();
        System.out.println(st1.toString());

        // Coloquei um filme para assistir
        st1.assistirFilme("Homem Aranha");
    }
}
