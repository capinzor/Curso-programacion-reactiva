package ordenes.vegetal;

import clases.Vegetal;
import java.util.Comparator;

public class VegetalPorNombreDes implements Comparator<Vegetal> {
    @Override
    public int compare(Vegetal o1, Vegetal o2) {
        return o2.getNombre().compareTo(o1.getNombre());
    }
}
