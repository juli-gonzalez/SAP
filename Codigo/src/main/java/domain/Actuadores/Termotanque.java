package domain.Actuadores;

import domain.Accion;
import domain.Usuario;

public class Termotanque implements Actuador{
    private String nombre;
    private Usuario unUsuario;
    private boolean estado;

    public Termotanque(String nombre, Usuario unUsuario, boolean estado) {
        this.nombre = nombre;
        this.unUsuario = unUsuario;
        this.estado = estado;
    }

    public void encenderPorUna(Accion unaAccion){
        this.estado = true;
    }
}
