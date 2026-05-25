package Exercicios.ClasseObjeto.Exercicio1;

public class TestaConta {
    public static void main(String args[]){
        Conta obj1 = new Conta("João Silva", 12345, 67890);

        //Deposito C1
        obj1.depositar(500);
        System.out.println(obj1);
        System.out.println(" ");

        // Sacar C1
        obj1.sacar(200);
        System.out.println(obj1);
        System.out.println(" ");


        // Tentar Encerrar CONTA com Saldo
        obj1.encerrarConta();
        System.out.println(obj1);
        System.out.println(" ");


        // Retirar o Saldo e Encerrar CONTA
        obj1.sacar(300);
        System.out.println(obj1);
        obj1.encerrarConta();
        System.out.println(obj1);
        System.out.println(" ");


        // Imprimir Dados
        System.out.println(obj1);
        System.out.println(" ");


        Conta obj2 = new Conta("Maria Souza", 230309, 67890);

        // Sacar 50 sem Saldo
        obj2.sacar(50);


    }
}
