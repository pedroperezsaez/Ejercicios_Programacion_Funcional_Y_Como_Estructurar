package UD1POO.ex3.repositori;

import UD1POO.ex3.model.Pelicula;

import java.util.List;

public interface PeliculaRepository {
    List<Pelicula> obtenirTotes();
    void afagir(Pelicula p);
}
