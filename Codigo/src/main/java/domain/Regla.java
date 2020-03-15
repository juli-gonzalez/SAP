package domain;

public class Regla {
    private int id;
    private String nombre;
    private float valor;
    private Sensor unSensor;
    private Accion unaAccion;
    private Valores valorEs;

    public Regla(int id, String nombre, float valor, Sensor unSensor, Accion unaAccion, Valores valorEs) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.unSensor = unSensor;
        this.unaAccion = unaAccion;
        this.valorEs = valorEs;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean soyCumplida(){
        if(this.valorEs == Valores.MAYOR){
            return unSensor.getValor() > this.getValor();
        }
        else if(this.valorEs == Valores.MENOR){
            return unSensor.getValor() < this.getValor();
        }
        else if(this.valorEs == Valores.IGUAL){
            return unSensor.getValor() == this.getValor();
        }
        return false;
    }
}
