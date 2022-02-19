package ordenes.carne;

import clases.Carne;

import java.util.Comparator;

public class CarnePorNombreDes implements Comparator<Carne> {
    @Override
    public int compare(Carne o1, Carne o2) {
        return o2.getNombre().compareTo(o1.getNombre());
    }
}
