package Exercicios.ClasseObjeto.Exercicio2;

public class Streaming {
    public String usuario, plano, ultimoFilmeAssistido;
    public float mensalidade;
    public boolean ativo;

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        setPlano(plano);
        this.ultimoFilmeAssistido = " ";
        this.ativo = true;
    }

    public Streaming() {
    }

    public void assistirFilme(String nomeFilme){
        if (ativo){
            System.out.println("Assistindo: " + nomeFilme);
            ultimoFilmeAssistido = nomeFilme;
        }else{
            System.out.println("Sua Assinatura está Cancelada!");
        }
    }

    public void cancelarAssinatura(){
        if (ativo){
            this.ativo = false;
            System.out.println("Assinatura Cancelada!");
        }else{
            System.out.println("Assinatura já está cancelada!");
        }
    }

    public void ativarAssinatura(){
        if (!ativo){
            this.ativo = true;
            System.out.println("Assinatura Ativada!");
        }else{
            System.out.println("Assinatura já está Ativada!");
        }
    }


    public void setPlano(String plano){
        if (plano.equals("Basico")){
            this.plano = "Basico";
            mensalidade = 25.90f;
        } else if (plano.equals("Premium")) {
            mensalidade = 45.90f;
            this.plano = "Premium";
        } else {
            mensalidade = 60.90f;
            this.plano = "Familia";
        }
    }

    @Override
    public String toString() {

        String status;
        if (ativo){
            status = "Conta Ativa!";
        }else{
            status = "Conta Desativada!";
        }
        return "Streaming{" +
                "usuario='" + usuario + '\'' +
                ", plano='" + plano + '\'' +
                ", ultimoFilmeAssistido='" + ultimoFilmeAssistido + '\'' +
                ", mensalidade=" + mensalidade +
                ", ativo=" + status +
                '}';
    }
}
