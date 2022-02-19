package collections;

import clases.Vegetal;

import java.util.ArrayList;

public class VegetalCollection {

    public static ArrayList<Vegetal> createVegetalCollection() {
        ArrayList<Vegetal> vegetales = new ArrayList<Vegetal>();
        vegetales.add(new Vegetal("Lechuga", 2000, 500,  "A", "Neutro",1800 ));
        vegetales.add(new Vegetal("Espinaca", 2200, 520,  "B", "Acido",1700 ));
        vegetales.add(new Vegetal("Papa", 2500, 510,  "C", "Alcalino",2500 ));
        vegetales.add(new Vegetal("Papa", 2400, 514,  "C", "Alcalino",2500 ));
        vegetales.add(new Vegetal("Papa", 2300, 514,  "C", "Alcalino",2500 ));
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

        return vegetales;
    }
}
