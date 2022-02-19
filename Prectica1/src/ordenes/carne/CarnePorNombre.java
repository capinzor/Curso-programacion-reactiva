package ordenes.carne;

import clases.Carne;

import java.util.Comparator;

public class CarnePorNombre implements Comparator<Carne> {
    @Override
    public int compare(Carne o1, Carne o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
