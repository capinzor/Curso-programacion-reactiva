package collections;

import clases.Carne;

import java.util.ArrayList;

public class CarneCollection {

    public static ArrayList<Carne> createCarnesCollection() {
        ArrayList<Carne> carnes = new ArrayList<>();
        carnes.add(new Carne("Cadera Res", 12000, "seco", 500));
        carnes.add(new Carne("Pierna Res", 12500, "vacio", 520));
        carnes.add(new Carne("Costilla Res", 11000, "seco", 505));
        carnes.add(new Carne("Lomo Res", 12000, "seco", 503));
        carnes.add(new Carne("Falda Res", 11000, "vacio", 500));
        carnes.add(new Carne("Pecho Res", 10500, "vacio", 600));
        carnes.add(new Carne("Brazuelo Res", 13000, "seco", 498));
        carnes.add(new Carne("Pechuga Pollo", 9000, "seco", 502));
        carnes.add(new Carne("Ala Pollo", 7000, "vacio", 550));
        carnes.add(new Carne("Pernil Pollo", 8000, "seco", 400));
        carnes.add(new Carne("Colombina Pollo", 8500, "seco", 430));
        carnes.add(new Carne("Cadera Cerdo", 9000, "vacio", 500));
        carnes.add(new Carne("Lomo Cerdo", 9200, "seco", 430));
        carnes.add(new Carne("Costilla Cerdo", 9100, "seco", 501));
        carnes.add(new Carne("Pierna Cerdo", 9200, "seco", 500));
        carnes.add(new Carne("Mojarra", 7000, "seco", 520));
        carnes.add(new Carne("Bagre", 7200, "seco", 560));
        carnes.add(new Carne("Robalo", 9000, "vacio", 512));
        carnes.add(new Carne("Robalo", 9000, "seco", 512));
        carnes.add(new Carne("Robalo", 8000, "vacio", 512));
        carnes.add(new Carne("Robalo", 8500, "vacio", 512));
        carnes.add(new Carne("Cierra", 7500, "vacio", 490));

        return carnes;
    }
}
