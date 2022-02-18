import java.util.Comparator;

public class CarnePorPeso implements Comparator<Carne> {
    @Override
    public int compare(Carne o1, Carne o2) {
        return (int) (o1.getPesoEnGramos() - o2.getPesoEnGramos());
    }
}
