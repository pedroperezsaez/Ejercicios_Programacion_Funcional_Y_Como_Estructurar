package UD1POO.ex2;

public class NotificacioConsola implements Notificacio {
    @Override
    public void enviar(String missatge){
        System.out.println(missatge);
    }

}
