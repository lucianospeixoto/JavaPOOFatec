package AgregacaoComposicao;

import java.util.Date;

public class testaEcommerce {
    public static void main(String[] args){
        Cliente cli1 = new Cliente("44715090805", "Luciano", "Franca");
        carrinhoCompra car1 = new carrinhoCompra(1, new Date(), cli1);


        Produto prod1 = new Produto(1, "Placa de Video", "8 GB", 2000);
        Produto prod2 = new Produto(2, "Processador", "I5 12th Geração", 2000);

        car1.adicionaItemCarrinho(1, 1, prod1);
        car1.adicionaItemCarrinho(1, 2, prod2);


        System.out.println(car1.toString());
        car1.calculaTotalCompra();
    }
}
