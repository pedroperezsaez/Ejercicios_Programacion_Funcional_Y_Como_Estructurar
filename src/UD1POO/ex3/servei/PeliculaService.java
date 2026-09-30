package UD1POO.ex3.servei;

import UD1POO.ex3.model.Pelicula;

import java.util.List;

public interface PeliculaService {
    void registrarPelicula(String titol, String director, int any);
    List<Pelicula> obtenirTotes();
}
