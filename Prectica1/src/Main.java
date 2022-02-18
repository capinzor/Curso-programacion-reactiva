import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collection.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carne> carnes = new ArrayList<Carne>();
        carnes.add(new Carne("Cadera Res", 12000, "seco", 500));
        carnes.add(new Carne("Pierna Res", 12500, "seco", 520));
        carnes.add(new Carne("Costilla Res", 12200, "seco", 505));
        carnes.add(new Carne("Lomo Res", 12000, "seco", 503));
        carnes.add(new Carne("Falda Res", 11000, "seco", 500));
        carnes.add(new Carne("Pecho Res", 10500, "seco", 600));
        carnes.add(new Carne("Brazuelo Res", 13000, "seco", 498));
        carnes.add(new Carne("Pechuga Pollo", 9000, "seco", 502));
        carnes.add(new Carne("Ala Pollo", 7000, "seco", 550));
        carnes.add(new Carne("Pernil Pollo", 8000, "seco", 400));
        carnes.add(new Carne("Colombina Pollo", 8500, "seco", 430));
        carnes.add(new Carne("Cadera Cerdo", 9000, "seco", 500));
        carnes.add(new Carne("Lomo Cerdo", 9200, "seco", 430));
        carnes.add(new Carne("Costilla Cerdo", 9100, "seco", 501));
        carnes.add(new Carne("Pierna Cerdo", 9200, "seco", 500));
        carnes.add(new Carne("Mojarra", 7000, "seco", 520));
        carnes.add(new Carne("Bagre", 7200, "seco", 560));
        carnes.add(new Carne("Robalo", 9000, "seco", 512));
        carnes.add(new Carne("Cierra", 7500, "seco", 490));

        ArrayList<Vegetal> vegetales = new ArrayList<Vegetal>();
        vegetales.add(new Vegetal("Lechuga", 2000, 500,  "A", "Neutro",1800 ));
        vegetales.add(new Vegetal("Espinaca", 2200, 520,  "B", "Acido",1700 ));
        vegetales.add(new Vegetal("Papa", 2500, 514,  "C", "Alcalino",2500 ));
        vegetales.add(new Vegetal("Zanahoria", 1800, 510,  "A", "Neutro",1800 ));
        vegetales.add(new Vegetal("Tomate", 2000, 500,  "D", "Neutro",2000 ));
        vegetales.add(new Vegetal("Yuca", 1800, 490,  "B", "Neutro",1000 ));
        vegetales.add(new Vegetal("Cebolla", 1500, 502,  "D", "Acido",2100 ));
        vegetales.add(new Vegetal("Pimenton", 1600, 600,  "C", "Acido",2000 ));
        vegetales.add(new Vegetal("Lenteja", 2100, 550,  "B", "Alcalino",1500 ));
        vegetales.add(new Vegetal("Frijol", 4000, 490,  "A", "Neutro",2100 ));
        vegetales.add(new Vegetal("Garbanzo", 2800, 500,  "F", "Alcalino",1400 ));
        vegetales.add(new Vegetal("Arroz", 2400, 508,  "C", "Neutro",1100 ));
        vegetales.add(new Vegetal("Calabaza", 1300, 506,  "A", "Acido",2200 ));
        vegetales.add(new Vegetal("Remolacha", 1400, 500,  "A", "Neutro",2150 ));
        vegetales.add(new Vegetal("Pepino", 1900, 600,  "B", "Acido",1700 ));

        ArrayList<Lacteo> lacteos = new ArrayList<Lacteo>();
        lacteos.add(new Lacteo("Leche",4000,"Bolsa",1000));
        lacteos.add(new Lacteo("Yogurt",9000,"Botella",950));
        lacteos.add(new Lacteo("Postre",15000,"Caja",1200));
        lacteos.add(new Lacteo("Cuajada",5000,"Caja",1000));
        lacteos.add(new Lacteo("Queso",5000,"Caja",1500));
        lacteos.add(new Lacteo("Mantequilla",8000,"Cubo",600));
        lacteos.add(new Lacteo("Leche",7000,"Bolsa",1100));
        lacteos.add(new Lacteo("Leche",4500,"Botella",1000));
        lacteos.add(new Lacteo("Leche",4200,"Caja",1200));
        lacteos.add(new Lacteo("Queso",5000,"Cubo",800));
        lacteos.add(new Lacteo("Yogurt",11000,"Bolsa",2000));
        lacteos.add(new Lacteo("Yogurt",9000,"Botella",700));
        lacteos.add(new Lacteo("Queso",8000,"Lonja",900));
        lacteos.add(new Lacteo("Leche",4300,"Bolsa",1200));
        lacteos.add(new Lacteo("Mantequilla",7000,"Cubo",500));

        for(Carne carne : carnes){
            System.out.println(carne.getNombre() + " " + carne.getPrecio() + " " + carne.getMaduracion() + " " + carne.getPesoEnGramos());
        }

        Collections.sort(carnes, new CarnePorPrecio());
        Collections.sort(carnes, new CarnePorPesoDes());
        System.out.println();
        System.out.println("Ordenado");
        System.out.println();

        for(Carne carne : carnes){
            System.out.println(carne.getNombre() + " " + carne.getPrecio() + " " + carne.getMaduracion() + " " + carne.getPesoEnGramos());
        }


    }
}
