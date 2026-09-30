package UD1POO.ex2;

import UD1POO.ex3.model.Pelicula;

public class GestorEstrena implements Notificacio {
    private Notificacio notificacio;
    public GestorEstrena(Notificacio notificacio){
        this.notificacio=notificacio;
    }

    public Notificacio getNotificacio() {
        return notificacio;
    }

    public void setNotificacio(Notificacio notificacio) {
        this.notificacio = notificacio;
    }
    public  void avisarEstrena(Pelicula p){
         notificacio.enviar("la pelicula "+p.getTitol()+" se ha estrenado");
    }

    @Override
    public void enviar(String missatge) {

    }

    @Override
    public void enviarMayuscula(String missatge) {

    }
}
