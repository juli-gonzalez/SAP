package domain;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private String login;
    private String mail;
    private boolean logeado;
    private List<Gimnasio> listGimnasios;
    private List<Alarma> listAlarmas;

    public Usuario(String nombre, String apellido, String login, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.login = login;
        this.mail = mail;
        this.logeado = false;
        this.listGimnasios = new ArrayList<Gimnasio>();
        this.listAlarmas = new ArrayList<Alarma>();
    }

    public void agregarAlarma(Alarma unaAlarma){
        this.listAlarmas.add(unaAlarma);
    }

    public void agregarGimnasio(Gimnasio unGimnasio){
        this.listGimnasios.add(unGimnasio);
    }

    public boolean isLogeado() {
        return logeado;
    }

    public void setLogeado(boolean logeado) {
        this.logeado = logeado;
    }
}
