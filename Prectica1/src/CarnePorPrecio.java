import java.util.Comparator;

public class CarnePorPrecio implements Comparator<Carne> {
    @Override
    public int compare(Carne o1, Carne o2) {
        return (int) (o1.getPrecio() - o2.getPrecio());
    }
}
