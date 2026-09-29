package UD1POO.ex3.repositori;

import UD1POO.ex3.model.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class main {
    static void main(String[] args) {

        List<Pelicula> pelis=new ArrayList<>();
        Pelicula p= new Pelicula("dasdas","asdasd",201);
        PeliculaRepositoryImpl peliculaRepository=new PeliculaRepositoryImpl(pelis);
        peliculaRepository.afagir(p);
        peliculaRepository.obtenirTotes();

    }
}
