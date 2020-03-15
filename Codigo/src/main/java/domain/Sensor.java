package domain;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private int id;
    private String tipoSensor;
    private float valor;
    private Pileta unaPileta;
    private List<Regla> listReglas;

    public Sensor(int id, String tipoSensor, float valor, Pileta unaPileta, List<Regla> listReglas) {
        this.id = id;
        this.tipoSensor = tipoSensor;
        this.valor = valor;
        this.unaPileta = unaPileta;
        this.listReglas = new ArrayList<Regla>();
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
