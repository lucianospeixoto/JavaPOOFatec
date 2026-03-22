package Exercicios.ExerciciosRevisao.Exercicio6;

public class TestaEdificio {
    static void main(String[] args) {
        //Criar Edificio
        Edificio edi1 = new Edificio("Santa Clara Tower","R. Dom Thomas 823");

        //Criei apartamentos
        edi1.construirApartamentos(101, 1);
        edi1.construirApartamentos(102, 1);
        edi1.construirApartamentos(201, 2);
        edi1.construirApartamentos(202, 2);
        edi1.construirApartamentos(301, 3);
        edi1.construirApartamentos(302, 3);

        //Listei os Apartamentos
        edi1.ListarApartamentos();

        //Deletei o edificio
        edi1 = null;

        System.out.println("O edificio edi1 é null. Não existe mais acesso ao seus apartamentos.");
    }
}
