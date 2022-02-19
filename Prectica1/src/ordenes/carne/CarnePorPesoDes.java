package ordenes.carne;

import clases.Carne;

import java.util.Comparator;

public class CarnePorPesoDes implements Comparator<Carne> {
    @Override
    public int compare(Carne o1, Carne o2) {
        return (int) (o2.getPesoEnGramos() - o1.getPesoEnGramos());
    }
}
