package Exercicios.ClasseObjeto.Exercicio3;

public class Placar {
    public String nomeTimeCasa, nomeTimeVisitante;
    public int pontosCasa, pontosVisitantes, periodoQuarto;

    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitantes = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo){
        if (time.equalsIgnoreCase(nomeTimeCasa)){
            if (tipo == 1){
                this.pontosCasa = pontosCasa + 1;
                System.out.println("Ponto para a Casa! Foi um LANCE LIVRE!");
                System.out.println("Pontos Conquistados: " + 1);
                System.out.println(" ");
            } else if (tipo == 2) {
                this.pontosCasa = pontosCasa + 2;
                System.out.println("Ponto para a Casa! Foi uma CESTA NORMAL!");
                System.out.println("Pontos Conquistados: " + 2);
                System.out.println(" ");
            } else if (tipo == 3) {
                this.pontosCasa = pontosCasa + 3;
                System.out.println("Ponto para a Casa! Foi uma CESTA DE TRÊS!");
                System.out.println("Pontos Conquistados: " + 3);
                System.out.println(" ");
            }
        }else if (time.equalsIgnoreCase(nomeTimeVisitante)){
            if (tipo == 1){
                this.pontosVisitantes = pontosVisitantes + 1;
                System.out.println("Ponto para os Visitantes! Foi um LANCE LIVRE!");
                System.out.println("Pontos Conquistados: " + 1);
                System.out.println(" ");
            } else if (tipo == 2) {
                this.pontosVisitantes = pontosVisitantes + 2;
                System.out.println("Ponto para os Visitantes! Foi uma CESTA NORMAL!");
                System.out.println("Pontos Conquistados: " + 2);
                System.out.println(" ");
            } else if (tipo == 3) {
                this.pontosVisitantes = pontosVisitantes + 3;
                System.out.println("Ponto para os Visitantes! Foi uma CESTA DE TRÊS!");
                System.out.println("Pontos Conquistados: " + 3);
                System.out.println(" ");
            }
        }
    }

    public void proximoQuarto(){
        if (periodoQuarto == 4){
            System.out.println("FIM DE JOGO! CHEGAMOS NO QUARTO PERIODO");
            System.out.println(" ");
        } else {
            periodoQuarto = periodoQuarto + 1;
        }
    }

    @Override
    public String toString() {
        return nomeTimeCasa + " " + pontosCasa + " x " +
                pontosVisitantes + " " + nomeTimeVisitante +
                " - Período: " + periodoQuarto;
    }
}
