package org.example;

import javax.xml.transform.stream.StreamSource;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //listar as bandas e seus integrantes

        Banda coldplay = new Banda();
        coldplay.setNome("Coldplay");
        coldplay.setNumeroIntegrantes(5);

        Pessoa chris = new Pessoa("Chris");
        Pessoa guy = new Pessoa("Guy");
        Pessoa phil = new Pessoa("Phil");
        Pessoa jonny = new Pessoa("Jonny");
        Pessoa will = new Pessoa("Will");

        coldplay.adicionarIntegrante(chris);
        coldplay.adicionarIntegrante(guy);
        coldplay.adicionarIntegrante(phil);
        coldplay.adicionarIntegrante(jonny);
        coldplay.adicionarIntegrante(will);

        Banda beatles = new Banda();
        beatles.setNome("The Beatles");
        beatles.setNumeroIntegrantes(4);

        Pessoa john = new Pessoa("John");
        Pessoa paul = new Pessoa("Paul");
        Pessoa george = new Pessoa("George");
        Pessoa ringo = new Pessoa("Ringo");

        beatles.adicionarIntegrante(john);
        beatles.adicionarIntegrante(paul);
        beatles.adicionarIntegrante(george);
        beatles.adicionarIntegrante(ringo);

        System.out.println("Banda 1: " + coldplay.getNome());
        System.out.println("Número de integrantes: " + coldplay.getNumeroIntegrantes());
        System.out.println("Integrantes: ");
        for (int i=0; i<coldplay.getPessoas().size(); i++){
            Pessoa nomes = coldplay.getPessoas().get(i);
            System.out.println(nomes.getNome());
        }


        System.out.println("Banda 2: " + beatles.getNome());
        System.out.println("Número de integrantes: " + beatles.getNumeroIntegrantes());
        for(int i=0; i<beatles.getPessoas().size(); i++){
            Pessoa nomes = beatles.getPessoas().get(i);
            System.out.println("Integrantes: " + nomes.getNome());
        }


    }
}