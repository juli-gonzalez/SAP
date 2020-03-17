package domain;

public class Alarma {
    private int id;
    private String nombre;
    private Usuario unUsuario;

    public Alarma(int id, String nombre, Usuario unUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.unUsuario = unUsuario;
    }

    public void notificar(){
        if(this.unUsuario.isLogeado()) {
            mostrarPopUp();
            enviarMail();
        }else
            enviarMail();


    }

    public void enviarMail(){
        this.unUsuario.recibirMail();
    }

    public void mostrarPopUp(){
        this.unUsuario.mostrarPopUp();
    }

}
