package UD1POO.ex3.model;

public class Pelicula{
    private String titol;
    private String director;
    private int anyEstrena;
    public Pelicula(String titol, String director, int anyEstrena){
        this.titol=titol;
        this.director=director;
        this.anyEstrena=anyEstrena;
    }

    public String getDirector() {
        return director;
    }
    public int getAnyEstrena(){
        return anyEstrena;
    }
    public String getTitol(){
        return titol;

    }

   @Override
    public String toString(){
        return "Director "+director+" titol "+titol+" anyEstrena " +anyEstrena;
   }

}
