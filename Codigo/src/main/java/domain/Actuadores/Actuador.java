package domain.Actuadores;

import domain.Accion;

public interface Actuador {
    public void encenderPorUna(Accion unaAccion);
    public void apagarPorUna(Accion unaAccion);
}
