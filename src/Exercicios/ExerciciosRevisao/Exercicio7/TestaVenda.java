package Exercicios.ExerciciosRevisao.Exercicio7;

public class TestaVenda {
    static void main(String[] args) {
        Cliente c1 = new Cliente(1, "Luciano Souza");


        Produto p1 = new Produto(1, "Refrigerante", 6.0);
        Produto p2 = new Produto(2, "Arroz 1Kg", 15.00);


        Venda v1 = new Venda(1, c1);

        v1.adicionarItemVenda(1,2, p1);
        v1.adicionarItemVenda(2, 1, p2);

        System.out.println(v1);
    }
}
