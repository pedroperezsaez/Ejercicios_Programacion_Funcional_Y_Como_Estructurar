package UD1POO.ex2;

import UD1POO.ex3.model.Pelicula;

public class main {
    static void main(String[] args) {
        Pelicula p=new Pelicula("Dune","villunue",2025);
        NotificacioConsola notificacioConsola=new NotificacioConsola();
        GestorEstrena g=new GestorEstrena(notificacioConsola);
        g.avisarEstrena(p);
    }


}
