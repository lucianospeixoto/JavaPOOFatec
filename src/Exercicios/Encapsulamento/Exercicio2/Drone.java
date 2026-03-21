package Exercicios.Encapsulamento.Exercicio2;

public class Drone {
    private String codigo;
    private Float altura;
    private int bateria;
    private boolean emVoo;

    public Drone() {
    }

    public Drone(String codigo, Float altura, int bateria, boolean emVoo) {
        this.setCodigo(codigo);
        this.setAltura(altura);
        this.setBateria(bateria);
        this.setEmVoo(emVoo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float a) {
        if(a < 0.0 && a >120){
            System.out.println("Erro! Regulamentação não permite essa altura!");
        }else{
            this.altura = a;
        }
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int b) {
        if (b > 0 && b < 100){
            this.bateria = b;
        }else{
            System.out.println("Erro de Bateria!");
        }

    }

    public boolean isEmVoo() {
        return emVoo;
    }

    public void setEmVoo(boolean emVoo) {
        if (bateria >= 20){
            this.emVoo = true;
        }else{
            this.emVoo = false;
        }
    }

    private boolean testarMotores(){
        System.out.println("Testando Hélices...");
        System.out.println("Calibrando GPS...");
        int randomico = (int) (Math.random() * 10);
        if (randomico < 8){
            System.out.println("Sistema Funcionando");
            return true;
        }else{
            System.out.println("Erro! Motores com Defeito!");
            return false;
        }
    }

    public void decolar(){
        if (this.testarMotores()){
            if (bateria >= 20){
                System.out.println("Bateria Suficiente, Drone Decolando...");
                setAltura(2.0f);
                this.emVoo = true;

            }else{
                System.out.println("Bateria Insuficiente, Drone No Chão...");
                setAltura(0.0f);
                this.emVoo = false;
            }
        }
    }

    public void aumentaAltura(float x){
        if (this.altura + x > 120 || this.altura < 0.0){
            System.out.println("Erro! Regulamentação não permite essa altura!");
        }else {
            System.out.println("Aumentando Altura...");
            this.setAltura(this.altura + x);
        }
    }
    public void diminuirAltura(float y){
        if (this.altura - y > 120 || this.altura < 0.0){
            System.out.println("Erro! Regulamentação não permite essa altura!");
        }else{
            System.out.println("Diminuindo Altura");
            this.setAltura(this.altura - y);
        }
    }

    @Override
    public String toString() {
        return "Drone{" +
                "codigo='" + codigo + '\'' +
                ", altura=" + altura +
                ", bateria=" + bateria +
                ", emVoo=" + emVoo +
                '}';
    }
}
