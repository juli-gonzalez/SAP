package domain;

public class Regla {
    private int id;
    private String nombre;
    private float valor;
    private Sensor unSensor;
    private Accion unaAccion;
    private boolean mayor;

    public Regla(int id, String nombre, float valor, Sensor unSensor, Accion unaAccion, boolean mayor) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.unSensor = unSensor;
        this.unaAccion = unaAccion;
        this.mayor = mayor;
    }
}
