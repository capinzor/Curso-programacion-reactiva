package ordenes.lacteo;

import clases.Carne;
import clases.Lacteo;

import java.util.Comparator;

public class LacteoPorPrecioDes implements Comparator<Lacteo> {
    @Override
    public int compare(Lacteo o1, Lacteo o2) {
        return (int) (o2.getPrecio() - o1.getPrecio());
    }
}
