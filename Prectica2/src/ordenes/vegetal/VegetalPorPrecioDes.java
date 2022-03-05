package ordenes.vegetal;

import clases.Vegetal;

import java.util.Comparator;

public class VegetalPorPrecioDes implements Comparator<Vegetal> {
    @Override
    public int compare(Vegetal o1, Vegetal o2) {
        return (int) (o2.getPrecio() - o1.getPrecio());
    }
}
