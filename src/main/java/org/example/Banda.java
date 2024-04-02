package org.example;


import java.util.ArrayList;

public class Banda {

    private String nome;
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private int numeroIntegrantes;


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

//    public void setPessoas(ArrayList<Pessoa> pessoas) {
//        this.pessoas = pessoas;
//    }

    public int getNumeroIntegrantes(){
        return numeroIntegrantes;
    }

    public void setNumeroIntegrantes(int numeroIntegrantes){
        this.numeroIntegrantes = numeroIntegrantes;
    }

    public void adicionarIntegrante(Pessoa integrante){
        if(pessoas.size() == numeroIntegrantes) {
            System.out.println("Tentativa de adicionar integrante suspeito: " + integrante.getNome());
            throw new IllegalStateException("Número de integrantes excedido");
        }
        pessoas.add(integrante);
    }

}
