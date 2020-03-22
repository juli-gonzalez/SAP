package domain;

public class Regla {
    private int id;
    private String descripcion;
    private double valor;
    private Sensor unSensor;
    private Accion unaAccion;
    private Condicion valorEs;

    public Regla(int id, String descripcion, double valor, Sensor unSensor, Accion unaAccion, Condicion valorEs) {
        this.id = id;
        this.descripcion = descripcion;
        this.valor = valor;
        this.unSensor = unSensor;
        this.unaAccion = unaAccion;
        this.valorEs = valorEs;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void accionar(double unaMedicion){
        if (soyCumplida(unaMedicion)){
            this.unaAccion.activarAlarma();
        }
    }

    public boolean soyCumplida(double unaMedicion){
        if(this.valorEs == Condicion.MAYOR){
            return unaMedicion > this.getValor();
        }
        else if(this.valorEs == Condicion.MENOR){
            return unaMedicion < this.getValor();
        }
        else if(this.valorEs == Condicion.IGUAL){
            return unaMedicion == this.getValor();
        }
        return false;
    }


}
