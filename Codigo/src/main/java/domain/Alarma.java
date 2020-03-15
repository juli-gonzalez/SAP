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
}
