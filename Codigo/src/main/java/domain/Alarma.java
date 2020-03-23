package domain;

public class Alarma {
    private int id;
    private String descripcion;
    private Usuario unUsuario;

    public Alarma(int id, String descripcion, Usuario unUsuario) {
        this.id = id;
        this.descripcion = descripcion;
        this.unUsuario = unUsuario;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void notificar(Usuario unUsuario){
        if(unUsuario.isLogeado()) {
            mostrarPopUp();
            enviarMail();
        }else
            enviarMail();


    }

    private void enviarMail(){ {
        Mail unMail = new Mail(this.unUsuario.getMail(),this.unUsuario.getNombre() + " " + this.unUsuario.getApellido() + ", ha recibido una nueva alerta",this.descripcion);
        unMail.enviarMail();
    }}

    private void mostrarPopUp(){
        PopUp unPopUp = new PopUp();
        unPopUp.infoBox(descripcion,"Alarma");
    }

}
