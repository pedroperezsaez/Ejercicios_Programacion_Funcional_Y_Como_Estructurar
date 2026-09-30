package UD1POO.ex2;

import UD1POO.ex3.model.Pelicula;

import java.util.Locale;

public class main {
    static void main(String[] args) {
        Pelicula p=new Pelicula("Dune","villunue",2025);
        NotificacioConsola notificacioConsola=new NotificacioConsola();
        GestorEstrena g=new GestorEstrena(notificacioConsola);
        g.avisarEstrena(p);

        Notificacio notificacio=missatge -> System.out.println(missatge.toUpperCase());
        GestorEstrena gm=new GestorEstrena(notificacio);
        gm.avisarEstrena(p);

    }


}
