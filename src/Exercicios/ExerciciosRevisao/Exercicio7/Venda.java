package Exercicios.ExerciciosRevisao.Exercicio7;

import Exercicios.ExerciciosRevisao.Exercicio4.Programador;

import java.util.ArrayList;

public class Venda {
    private int id;
    private Cliente cliente;
    private ArrayList<ItemVenda> itemVendas;

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itemVendas = new ArrayList<>();
    }

    public Venda(int id) {
        this.id = id;
        this.itemVendas = new ArrayList<>();
    }

    public void adicionarItemVenda(int id, int quantidade, Produto produto){
        ItemVenda i = new ItemVenda(id, quantidade, produto);
        this.itemVendas.add(i);
    }

    public double totalVenda(){
        double valorTotal = 0;
        for (ItemVenda item : itemVendas){
            valorTotal += item.getQuantidade() * item.getProduto().getPreco();
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "======= CUPOM FISCAL =======\n" +
                "Venda nº: " + id + "\n" +
                "Cliente: " + cliente.getNome() + "\n" +
                "Itens: " + itemVendas + "\n" +
                "Total: R$" + totalVenda() + "\n" +
                "============================";
    }
}
