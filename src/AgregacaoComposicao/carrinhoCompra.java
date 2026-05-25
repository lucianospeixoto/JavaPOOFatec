package AgregacaoComposicao;

import java.util.ArrayList;
import java.util.Date;

public class carrinhoCompra {
    private int id;
    private Date data;
    private Cliente cliente;
    private ArrayList<itemCarrinho> itemCarrinhos;
    private ArrayList<Produto> produtos;

    // esse construtor caracteriza uma agregação
    // motivo: cliente já veio criado, é independente
    public carrinhoCompra(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itemCarrinhos = new ArrayList<>();
    }

    public void adicionaItemCarrinho(int id, float qtde, Produto produto){
        itemCarrinho aux = new itemCarrinho(id, qtde, produto);
        this.itemCarrinhos.add(aux);


    }


    public carrinhoCompra() {
        this.itemCarrinhos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void calculaTotalCompra(){
        float valorTotal = 0;
        for(itemCarrinho aux: this.itemCarrinhos){
            valorTotal += aux.getQtde() * aux.getProduto().getPreco();

        }
        System.out.println("Valor total da compra foi: " + valorTotal);


    }

    @Override
    public String toString() {
        return "carrinhoCompra{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=\n" + cliente +
                ", Itens do Carrinho=\n" + itemCarrinhos +
                '}';
    }
}
