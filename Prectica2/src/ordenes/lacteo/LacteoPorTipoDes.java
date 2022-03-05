package ordenes.lacteo;

import clases.Lacteo;

import java.util.Comparator;

public class LacteoPorTipoDes implements Comparator<Lacteo> {
    @Override
    public int compare(Lacteo o1, Lacteo o2) {
        return o2.getTipo().compareTo(o1.getTipo());
    }
}
