package UD1POO.ex3.repositori;

import UD1POO.ex3.model.Pelicula;

import java.util.List;

public class PeliculaRepositoryImpl implements PeliculaRepository {
    private List<Pelicula> peliculas;
    PeliculaRepositoryImpl(List<Pelicula> peliculas){
        this.peliculas=peliculas;
    }

    @Override
    public List<Pelicula> obtenirTotes() {
        return List.of();
    }

    @Override
    public void afagir(Pelicula p) {
        peliculas.add(p);
    }
}
