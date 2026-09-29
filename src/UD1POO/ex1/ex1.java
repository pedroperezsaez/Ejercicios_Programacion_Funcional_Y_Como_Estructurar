package UD1POO.ex1;

import UD1POO.ex3.model.Pelicula;

//POJO de domini. Crea una classe Pelicula (POJO) amb els
// atributs titol , director i anyEstrena , amb
//constructor, getters i un mètode toString()
// . Escriu un petit programa main que en creï tres instàncies i les mostri per
//consola.
public class ex1 {
    static void main(String[] args) {
        Pelicula p1=new Pelicula("Django","Tarantino",2012);
        Pelicula p2= new Pelicula("2001 Odisea en el espacio","Kubrick",1965);
        Pelicula p3= new Pelicula("Ciudad de Dios","alguien",2008);
        System.out.println(p1+" | " +p2+" | "+p3);
    }

}

