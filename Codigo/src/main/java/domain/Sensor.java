package domain;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private int id;
    private String tipoSensor;
    private double valor;
    private Pileta unaPileta;
    private List<Regla> listReglas;

    public Sensor(int id, String tipoSensor, Pileta unaPileta) {
        this.id = id;
        this.tipoSensor = tipoSensor;
        this.unaPileta = unaPileta;
        this.listReglas = new ArrayList<Regla>();
        this.valor = 0;
    }

    public void agregarRegla(Regla unaRegla){
        this.listReglas.add(unaRegla);
    }

    public int contarCantidadReglas(){
        return this.listReglas.size();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
