package Exercicios.Encapsulamento.Exercicio1;

public class ArCondicionado {
    private String marca, modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado() {
    }

    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTemperatura(temperatura);
        this.setLigado(ligado);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.length() >= 3){
            this.marca = marca;
        }else{
            System.out.println("Erro! Tamanho minimo de letras no nome não foi atingida!");
        }

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int t) {
        if(t >= 16 && t <= 30){
            this.temperatura = t;
        }else{
            System.out.println("Temperatura fora da faixa");
            System.out.println("Desligando o AR...");
            isDesligado();
        }

    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isDesligado(){
        return ligado = false;
    }

    public void setLigado(boolean ligado) {
        if (this.temperatura >= 16 && this.temperatura <= 30){
            this.ligado = ligado;
        }else{
            this.ligado = false;
        }
    }

    private boolean verificarCompressor(){
        System.out.println("Verificando Compressor...");
        int randomico = (int) (Math.random() * 10);
        if (randomico > 2){
            System.out.println("Sistema funcionando!");
            return true;
        }else{
            System.out.println("Erro no Sistema de Compressão!");
            return this.ligado = false;

        }

    }

    public void ativarModoTurbo(){
        if (this.verificarCompressor()){
            System.out.println("Ativando o modo turbo!");
            setTemperatura(16);

        }else{
            System.out.println("Não foi possivel ativar modo turbo! Erro no compressor");
        }

    }

    @Override
    public String toString() {
        return "ArCondicionado{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", temperatura=" + temperatura +
                ", ligado=" + ligado +
                '}';
    }
}
