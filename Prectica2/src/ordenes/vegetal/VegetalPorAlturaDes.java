package ordenes.vegetal;

import clases.Vegetal;
import java.util.Comparator;

public class VegetalPorAlturaDes implements Comparator<Vegetal> {
    @Override
    public int compare(Vegetal o1, Vegetal o2) {
        return (int) (o2.getAlturaDeCultivo() - o1.getAlturaDeCultivo());
    }
}
