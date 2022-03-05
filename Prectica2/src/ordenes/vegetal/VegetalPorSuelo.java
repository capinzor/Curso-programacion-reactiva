package ordenes.vegetal;

import clases.Vegetal;
import java.util.Comparator;

public class VegetalPorSuelo implements Comparator<Vegetal> {
    @Override
    public int compare(Vegetal o1, Vegetal o2) {
        return o1.getSueloDeCultivo().compareTo(o2.getSueloDeCultivo());
    }
}
