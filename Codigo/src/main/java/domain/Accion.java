package domain;

public class Accion {
    private int id;
    private String nombre;
    private Alarma unaAlarma;

    public Accion(int id, String nombre, Alarma unaAlarma) {
        this.id = id;
        this.nombre = nombre;
        this.unaAlarma = unaAlarma;
    }
}
