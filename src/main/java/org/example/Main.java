package org.example;

public class Main {

    //20 cantantes

    //clases: pais(nombrePais,cantante, voto),
    public static void main(String[] args) {

        Concurso c = new Concurso();

        c.realizarVotaciones();

        System.out.println(c);


    }
}