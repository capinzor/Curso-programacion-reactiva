package collections;

import clases.Lacteo;

import java.util.ArrayList;

public class LacteoCollection {

    public static ArrayList<Lacteo> createLacteosCollection() {
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

        return lacteos;
    }
}
