package domain.Actuadores;

import domain.Accion;
import domain.Usuario;

public class TanqueCloro implements Actuador{
    private String nombre;
    private boolean estado;

    public TanqueCloro(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void activarPorUna(Accion unaAccion){
        this.estado = true;
    }
}
