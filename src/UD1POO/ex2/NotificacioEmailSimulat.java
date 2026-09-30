package UD1POO.ex2;

public class NotificacioEmailSimulat implements  Notificacio {
    public void enviar(String missatge){
        System.out.println("Enviant email: "+ missatge);
    }

    @Override
    public void enviarMayuscula(String missatge) {

    }

}
