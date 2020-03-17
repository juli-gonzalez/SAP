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
            this.unaAlarma.notificar();
        }
    }
}
