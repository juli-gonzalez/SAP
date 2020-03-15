package domain;

import java.util.ArrayList;
import java.util.List;

public class Pileta {
    private int id;
    private String ubicacion;
    private Gimnasio unGimnasio;
    private List<Sensor> listSensores;

    public Pileta(int id, String ubicacion, List<Sensor> listSensores, Gimnasio unGimnasio) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.unGimnasio = unGimnasio;
        this.listSensores = new ArrayList<Sensor>();
    }
}
