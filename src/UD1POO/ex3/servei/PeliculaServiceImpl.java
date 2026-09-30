package UD1POO.ex3.servei;

import UD1POO.ex3.model.Pelicula;
import UD1POO.ex3.repositori.PeliculaRepository;

import java.util.List;
import java.util.Optional;

public class PeliculaServiceImpl implements PeliculaService{
    PeliculaRepository peliculaRepository;
    PeliculaServiceImpl(PeliculaRepository peliculaRepository){
        this.peliculaRepository=peliculaRepository;
    }
    @Override
    public void registrarPelicula(String titol, String director, int any) {
        Pelicula p=new Pelicula(titol,director,any);
        if (p.getAnyEstrena()<1888){
            throw new IllegalArgumentException("Es menor a 1888");
        }
        peliculaRepository.afagir(p);
    }

    @Override
    public List<Pelicula> obtenirTotes() {

        return  peliculaRepository.obtenirTotes();
    }
    List<String>titolsPerDirector(String director){
        return peliculaRepository.obtenirTotes().stream().filter(p->p.getDirector().equals(director))
                .map(pelicula -> pelicula.getTitol()).sorted().toList();
    }
    Pelicula obtenirPerTitol(String titol){
        return  peliculaRepository
                .cercarPerTitol(titol)
                .orElseThrow(() -> new IllegalArgumentException("prueba"));
    }
}
