package Heranca;

import java.util.ArrayList;

public class testaDesenvolvedor {
    public static void exibeDados(Desenvolvedor camaleao){
        camaleao.codar();
        System.out.println(camaleao.toString() + "Bônus " + camaleao.calculaBonus());
    }
    static void main(String[] args) {
        Junior jr = new Junior("Thales", "Luciano", "Java", 4000);
        exibeDados(jr);

        Pleno pl = new Pleno(0, "Gabriel", "Java", 6000);
        exibeDados(pl);

        Senior sr = new Senior(30000, "Thales", "Java", 9000);
        exibeDados(sr);


        // vetor dev
        ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<Desenvolvedor>();
        // adiciona dev
        desenvolvedores.add(jr);
        desenvolvedores.add(pl);
        desenvolvedores.add(sr);

    }
}
