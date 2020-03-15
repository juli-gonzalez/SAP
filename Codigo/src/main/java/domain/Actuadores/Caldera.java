package domain.Actuadores;

import domain.Usuario;

public class Caldera {
    private String nombre;
    private Usuario unUsuario;
    private boolean estado;

    public Caldera(String nombre, Usuario unUsuario, boolean estado) {
        this.nombre = nombre;
        this.unUsuario = unUsuario;
        this.estado = estado;
    }
}
