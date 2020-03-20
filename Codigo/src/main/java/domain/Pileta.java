package domain;

import java.util.ArrayList;
import java.util.List;

public class Pileta {
    private int id;
    private String ubicacion;
    private Gimnasio unGimnasio;
    private List<Sensor> listSensores;

    public Pileta(int id, String ubicacion, Gimnasio unGimnasio) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.unGimnasio = unGimnasio;
        this.listSensores = new ArrayList<Sensor>();
    }

    public List<Sensor> getListSensores() {
        return listSensores;
    }

    public void setListSensores(List<Sensor> listSensores) {
        this.listSensores = listSensores;
    }
}
