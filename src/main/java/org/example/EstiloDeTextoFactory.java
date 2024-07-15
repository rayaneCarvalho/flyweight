package org.example;

import java.util.HashMap;
import java.util.Map;

public class EstiloDeTextoFactory {

    private static EstiloDeTextoFactory instancia;
    private Map<String, EstiloDeTexto> estilos = new HashMap<>();

    private EstiloDeTextoFactory() {
    }

    public static EstiloDeTextoFactory getInstance() {
        if (instancia == null) {
            instancia = new EstiloDeTextoFactory();
        }
        return instancia;
    }

    public EstiloDeTexto getEstilo(String estilo) {
        EstiloDeTexto estiloDeTexto = estilos.get(estilo);
        if (estiloDeTexto == null) {
            estiloDeTexto = new EstiloDeTexto(estilo);
            estilos.put(estilo, estiloDeTexto);
        }
        return estiloDeTexto;
    }

    public int getTotalEstilos() {
        return estilos.size();
    }
}

