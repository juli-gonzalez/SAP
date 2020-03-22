package domain;

import domain.Actuadores.Actuador;

public class Accion {
    private int id;
    private String nombre;
    private Alarma unaAlarma;
    private Actuador unActuador;

    public Accion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Actuador getUnActuador() {
        return unActuador;
    }

    public void setUnActuador(Actuador unActuador) {
        this.unActuador = unActuador;
    }

    public Alarma getUnaAlarma() {
        return unaAlarma;
    }

    public void setAlarma(Alarma unaAlarma) {
        this.unaAlarma = unaAlarma;
    }

    public boolean chequearAlarmaExistente(){
        return this.getUnaAlarma() != null;
    }

    public void activarAlarma(){
        if(chequearAlarmaExistente()){
            this.unaAlarma.notificar(this.unaAlarma.getUnUsuario());
            this.unActuador.activarPorUna(this);
        }
    }
}