package org.example;

import java.util.Map;

public class Main {

    //20 cantantes

    //clases: pais(nombrePais,cantante, voto),
    public static void main(String[] args) {

        Concurso c = new Concurso();
        c.rellenarPaises("/home/iperezsalameroh/IdeaProjects/EuroVision/informacion.txt");
        c.realizarVotaciones();
        c.save("concurso");
//        c.imprimirListadoPaisesAlfabeticamente("listadoPaisesAlfabeticamente.txt");
//        c.imprimirListadoPaisesPuntEmitidas("listadoPaises.................");
//        Map<Pais, Map<Integer,Pais>> aux = c.obtenerListadoPaisesYPuntuacionesEmitidas();
//        for(Pais p : aux.keySet()){
//            System.out.println(p);
//            Map<Integer,Pais> votos = aux.get(p);
//            for(Integer i : votos.keySet())
//                System.out.print(i + " -> " + votos.get(i).getNombrePais() +", ");
//            System.out.println();
//        }


    }
}