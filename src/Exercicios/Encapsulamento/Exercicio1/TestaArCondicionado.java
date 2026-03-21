package Exercicios.Encapsulamento.Exercicio1;

public class TestaArCondicionado {
    public static void main (String[] args){
        ArCondicionado ar1 = new ArCondicionado("Samsung", "Super Freeze", 19, true);
        System.out.println(ar1.toString());
        ar1.ativarModoTurbo();
        System.out.println(ar1.toString());
    }
}
