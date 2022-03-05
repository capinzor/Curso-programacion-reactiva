import clases.Carne;
import clases.Lacteo;
import clases.Vegetal;
import collections.CarneCollection;
import collections.LacteoCollection;
import collections.VegetalCollection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        ArrayList<Carne> carnes = CarneCollection.createCarnesCollection();
        ArrayList<Vegetal> vegetales = VegetalCollection.createVegetalCollection();
        ArrayList<Lacteo> lacteos = LacteoCollection.createLacteosCollection();

        Comparator<Carne> comparadorCarnes1= Comparator
                                                .comparing(Carne::getPesoEnGramos).reversed()
                                                .thenComparing(Comparator.comparing(Carne::getPrecio));
        Comparator<Carne> comparadorCarnes2= Comparator
                                                .comparing(Carne::getNombre).reversed()
                                                .thenComparing(Comparator.comparing(Carne::getPrecio).reversed())
                                                .thenComparing(Comparator.comparing(Carne::getMaduracion).reversed());;
        ArrayList<Carne> carnesOrden1 = (ArrayList<Carne>) carnes.stream()
                                                .sorted(comparadorCarnes1).collect(Collectors.toList());
        ArrayList<Carne> carnesOrden2 = (ArrayList<Carne>) carnes.stream()
                                                .sorted(comparadorCarnes2).collect(Collectors.toList());
        System.out.println("Listado de carnes ordenado por peso de forma descendente y precio de forma ascendente");
        Carne.imprimirLista(carnesOrden1);

        System.out.println("Listado de carnes ordenado por nombre de forma descendente, precio de forma descendente\n" +
                " y maduracion de forma descendente");
        Carne.imprimirLista(carnesOrden2);

        Comparator<Lacteo> comparadorLacteos1= Comparator
                .comparing(Lacteo::getTipo).reversed()
                .thenComparing(Comparator.comparing(Lacteo::getPrecio).reversed());
        ArrayList<Lacteo> lacteosOrden1 = (ArrayList<Lacteo>) lacteos.stream()
                .sorted(comparadorLacteos1).collect(Collectors.toList());

        System.out.println("Listado de lacteos por tipo de forma descendente y precio de forma descendente");
        Lacteo.imprimirLista(lacteosOrden1);

        Comparator<Vegetal> comparadorVegetales1= Comparator
                .comparing(Vegetal::getNombre).reversed()
                .thenComparing(Comparator.comparing(Vegetal::getPeso).reversed())
                .thenComparing(Comparator.comparing(Vegetal::getPrecio).reversed());
        Comparator<Vegetal> comparadorVegetales2= Comparator
                .comparing(Vegetal::getSueloDeCultivo)
                .thenComparing(Comparator.comparing(Vegetal::getAlturaDeCultivo).reversed())
                .thenComparing(Comparator.comparing(Vegetal::getPrecio).reversed());;
        ArrayList<Vegetal> vegetalesOrden1 = (ArrayList<Vegetal>) vegetales.stream()
                .sorted(comparadorVegetales1).collect(Collectors.toList());
        ArrayList<Vegetal> vegetalesOrden2 = (ArrayList<Vegetal>) vegetales.stream()
                .sorted(comparadorVegetales2).collect(Collectors.toList());

        System.out.println("Listado de vegetales ordenados por nombre, peso y precio de forma descendente");
        Vegetal.imprimirLista(vegetalesOrden1);

        System.out.println("Listado de vegetales ordenado por suelo de cultivo de forma ascendente, altura de \n" +
                "cultivo de forma descendente y precio de forma descendente.");
        Vegetal.imprimirLista(vegetalesOrden2);
    }
}
