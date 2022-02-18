import java.util.Comparator;

public class VegetalPorPesoDes implements Comparator<Carne> {
    @Override
    public int compare(Carne o1, Carne o2) {
        return (int) (o2.getPesoEnGramos() - o1.getPesoEnGramos());
    }
}
