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

    public boolean soyCumplida(){
        if(this.valorEs == Condicion.MAYOR){
            return this.unSensor.getValor() > this.getValor();
        }
        else if(this.valorEs == Condicion.MENOR){
            return this.unSensor.getValor() < this.getValor();
        }
        else if(this.valorEs == Condicion.IGUAL){
            return this.unSensor.getValor() == this.getValor();
        }
        return false;
    }

    public void accionar(){
        if (soyCumplida()){
            this.unaAccion.activarAlarma();
        }
    }
}
