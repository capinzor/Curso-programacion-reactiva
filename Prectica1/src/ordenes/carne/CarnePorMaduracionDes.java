package ordenes.carne;

import clases.Carne;

import java.util.Comparator;

public class CarnePorMaduracionDes implements Comparator<Carne> {
    @Override
    public int compare(Carne o1, Carne o2) {
        return o2.getMaduracion().compareTo(o1.getMaduracion());
    }
}
