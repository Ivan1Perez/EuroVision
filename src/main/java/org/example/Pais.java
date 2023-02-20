package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Pais implements Comparable<Pais>{

    private static final int[] PUNTOS = {1,2,3,4,5,6,7,8,9,10,12};
    private String nombrePais;
    private String cantante;
    private Map<Pais,Integer> puntuacionRecibida;
    private Map<Integer, Pais> puntuacionEmitida;

    public Pais(String nombrePais, String cantante) {
        this.nombrePais = nombrePais;
        this.cantante = cantante;
        puntuacionRecibida = new HashMap<>();
        puntuacionEmitida = new TreeMap<>();
    }

    public void recibirVoto(Integer puntuacion, Pais pais){
        puntuacionRecibida.put(pais, puntuacion);
    }

    public void votar(Set<Pais> paises){
        List<Pais> paisList = new ArrayList<>(paises);
        Collections.shuffle(paisList);

        for(int punto : PUNTOS)
            puntuacionEmitida.put(punto, paisList.remove(0));
    }

    public int obtenerPuntuacionStreams(){

        return puntuacionRecibida.values().stream()
                .collect(Collectors.summingInt(Integer::intValue));

    }

    public int obtenerPuntuacionIterator(){
        int suma = 0;

        Iterator<Integer> iterator = puntuacionRecibida.values().iterator();
        while(iterator.hasNext())
            suma+=iterator.next();

        return suma;
    }

    public int obtenerPuntuacion(){
        int suma = 0;
        for(Integer punto : puntuacionRecibida.values())
            suma+=punto;

        return suma;
    }

    public Map<Integer, Pais> devolverVoto(){
        return puntuacionEmitida;
    }


    @Override
    public int compareTo(Pais o) {
        return nombrePais.compareToIgnoreCase(o.nombrePais);
    }

    @Override
    public String toString() {
        return nombrePais + ",Puntuación: " + puntuacionRecibida +"\n";
    }
}
