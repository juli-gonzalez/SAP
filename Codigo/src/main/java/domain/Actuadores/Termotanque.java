package domain.Actuadores;

import domain.Usuario;

public class Termotanque {
    private String nombre;
    private Usuario unUsuario;
    private boolean estado;

    public Termotanque(String nombre, Usuario unUsuario, boolean estado) {
        this.nombre = nombre;
        this.unUsuario = unUsuario;
        this.estado = estado;
    }
}
