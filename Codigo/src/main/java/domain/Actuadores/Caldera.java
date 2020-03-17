package domain.Actuadores;

import domain.Accion;
import domain.Usuario;

public class Caldera implements Actuador{
    private String nombre;
    private Usuario unUsuario;
    private boolean estado;

    public Caldera(String nombre, Usuario unUsuario, boolean estado) {
        this.nombre = nombre;
        this.unUsuario = unUsuario;
        this.estado = estado;
    }

    public void encenderPorUna(Accion unaAccion){
        this.estado = true;
    }
}
