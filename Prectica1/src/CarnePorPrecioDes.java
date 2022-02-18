import java.util.Comparator;

public class CarnePorPrecioDes implements Comparator<Carne> {
    @Override
    public int compare(Carne o1, Carne o2) {
        return (int) (o2.getPrecio() - o1.getPrecio());
    }
}
