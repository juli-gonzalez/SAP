package domain;

public class Usuario {
    private String nombre;
    private String apellido;
    private String login;
    private String mail;
    private boolean logeado;
    private Alarma unaAlarma;

    public Usuario(String nombre, String apellido, String login, String mail, boolean logeado, Alarma unaAlarma) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.login = login;
        this.mail = mail;
        this.logeado = logeado;
        this.unaAlarma = unaAlarma;
    }
}
