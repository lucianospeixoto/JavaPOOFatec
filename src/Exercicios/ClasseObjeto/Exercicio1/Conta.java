package Exercicios.ClasseObjeto.Exercicio1;

public class Conta{

    public String nomeCliente;
    public int numeroConta, agencia;
    public float saldo;
    public boolean status;

    public Conta(){

    }

    public Conta(String nomeCliente, int numeroConta, int agencia){
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = 0;
        this.status = true;
    }

    public void depositar(float valor){
        if (this.status = true){
            this.saldo += valor;
            System.out.println("Valor Depositado. Novo Saldo: " + this.saldo);
        }
    }

    public void sacar(float valor){
        if (this.status = true){
            if (valor > this.saldo){
                System.out.println("Erro! O valor solicitado é maior que o saldo da conta)");
            }
            else {
                this.saldo -= valor;
                System.out.println("Saque Realizado! Saldo Atual: " + this.saldo);
            }
        }
        else{
            System.out.println("Saldo Insuficiente/ou Conta Inátiva");
        }
    }

    public void encerrarConta(){
        if (this.saldo > 0){
            System.out.println("Você não pode finalizar a conta pois ainda tem Saldo");
        }
        else if (this.status){
            this.status = false;
            System.out.println("Conta Finalizada!");

        }
    }


    @Override
    public String toString() {
        return "Conta: " +
                "nome do Cliente: " + this.nomeCliente  +
                ", numero da Conta: " + this.numeroConta +
                ", agencia: " + this.agencia +
                ", saldo R$: " + this.saldo +
                ", status: " + (this.status ? "Ativa" : "Desativada");
    }
}