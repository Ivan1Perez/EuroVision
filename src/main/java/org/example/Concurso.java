package org.example;

import java.util.*;

public class Concurso {

    private static final String[][] datos = {
            {"España", "Blanca Paloma"},
            {"Alemania", "Sin candidato"},
            {"Francia", "La Zarra"},
            {"Italia", "Marco Mengoni"},
            {"Reino Unido", "Los Brexit"},
            {"Ucrania", "Tvorchi"},
            {"Azerbaiyan", "ekdvje"},
            {"Croacia", "Let 3"},
            {"Finlandia", "Uno cualquiera"},
            {"Irlanda", "Wild Youth"},
            {"Israel", "Noa kirel"},
            {"Letonia", "Sudden Lights"},
            {"Malta", "The Buster"},
            {"Noruega", "Alessandra"},
            {"Albania", "Albina Kelmendi"},
            {"Armenia", "Brunette"}

    };
    private Set<Pais> paises;

    public Concurso() {
        paises = new TreeSet<>();
        rellenarPaises();
    }

    private void rellenarPaises() {
        for(String[] dato : datos){
            paises.add(new Pais(dato[0], dato[1]));
        }
    }

    public void realizarVotaciones(){
        for(Pais p : paises){
            p.votar(paises);
        }

        for(Pais p : paises){
            Map<Integer, Pais> votos = p.devolverVoto();
            for(Integer puntuacion : votos.keySet()){
                Pais pais = votos.get(puntuacion);
                pais.recibirVoto(puntuacion, p);
            }
        }

    }

    public List<Pais> obtenerListadoPaisesPorPuntuacion(){
        List<Pais> paisList = new ArrayList<>(paises);

        paisList.sort(Comparator.comparingInt(Pais::obtenerPuntuacion));

        return paisList;
    }
//
//    public List<Pais> obtenerListadoPaisesAlfabeticamente(){
//
//    }
//
//    public Map<Pais, Map<Integer,Pais>> obtenerListadoPaisesYPuntuacionesEmitidas(){
//
//    }
//
    public List<String> obtenerListadoAlfabeticoCantantes(){

    }


    @Override
    public String toString() {
        return "Concurso{\n" +
                "paises=\n" + paises +
                '}';
    }
}
