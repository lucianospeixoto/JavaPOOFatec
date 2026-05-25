package Exercicios.ExerciciosRevisao.Exercicio6;

import java.util.ArrayList;

public class Edificio {
    private String nome, endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio() {
        this.apartamentos = new ArrayList<>();
    }

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(ArrayList<Apartamento> apartamentos) {
        this.apartamentos = apartamentos;
    }

    public void construirApartamentos(int num, int andar){
        Apartamento apartamento1 = new Apartamento(num, andar);
        this.apartamentos.add(apartamento1);
    }

    public void ListarApartamentos(){
        System.out.println("Apartamentos no edificio - " + getNome() + ": ");
        for (int i = 0; i < apartamentos.size(); i++){
            System.out.println(apartamentos.get(i));
        }
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", apartamentos=" + apartamentos +
                '}';
    }
}
