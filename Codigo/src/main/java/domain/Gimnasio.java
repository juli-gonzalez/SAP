package domain;

import java.util.ArrayList;
import java.util.List;

public class Gimnasio {
    private int id;
    private String nombre;
    private String direccion;
    private int telefono;
    private List<Pileta> listPiletas;
    private List<Usuario> listUsuarios;

    public Gimnasio(int id, String nombre, String direccion, int telefono, List<Pileta> listPiletas, List<Usuario> listUsuarios) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listPiletas = new ArrayList<Pileta>();
        this.listUsuarios = new ArrayList<Usuario>();
    }
}
