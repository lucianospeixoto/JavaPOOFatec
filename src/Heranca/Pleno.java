package Heranca;

public class Pleno extends Desenvolvedor{
    private int projetoEntregue;
    public Pleno(){
        super();

    }
    public Pleno(int projetoEntregue, String nome, String linguagem, float salarioBase){
        super(nome, linguagem, salarioBase);
        this.projetoEntregue = projetoEntregue;

    }

    public int getProjetoEntregue() {
        return projetoEntregue;
    }

    public void setProjetoEntregue(int projetoEntregue) {
        this.projetoEntregue = projetoEntregue;
    }

    @Override
    public void codar(){
        System.out.println("Pleno codando e fazendo Code Review");
    }
    @Override
    public float calculaBonus(){
        return this.salarioBase * 0.15f;
    }


    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projetoEntregue=" + projetoEntregue +
                '}';
    }
}
