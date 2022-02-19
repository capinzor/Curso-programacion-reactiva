import clases.Carne;
import clases.Lacteo;
import clases.Vegetal;
import collections.CarneCollection;
import collections.LacteoCollection;
import collections.VegetalCollection;
import ordenes.carne.*;
import ordenes.lacteo.LacteoPorPrecioDes;
import ordenes.lacteo.LacteoPorTipoDes;
import ordenes.vegetal.*;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        ArrayList<Carne> carnes = CarneCollection.createCarnesCollection();
        ArrayList<Vegetal> vegetales = VegetalCollection.createVegetalCollection();
        ArrayList<Lacteo> lacteos = LacteoCollection.createLacteosCollection();

        Collections.sort(carnes, new CarnePorPrecio());
        Collections.sort(carnes, new CarnePorPesoDes());
        System.out.println("Listado de carnes ordenado por peso de forma descendente y precio de forma ascendente");
        Carne.imprimirLista(carnes);

        Collections.sort(carnes, new CarnePorMaduracionDes());
        Collections.sort(carnes, new CarnePorPrecioDes());
        Collections.sort(carnes, new CarnePorNombreDes());
        System.out.println("Listado de carnes ordenado por nombre de forma descendente, precio de forma descendente\n" +
                " y maduracion de forma descendente");
        Carne.imprimirLista(carnes);

        Collections.sort(lacteos, new LacteoPorPrecioDes());
        Collections.sort(lacteos, new LacteoPorTipoDes());
        System.out.println("Listado de lacteos por tipo de forma descendente y precio de forma descendente");
        Lacteo.imprimirLista(lacteos);

        Collections.sort(vegetales, new VegetalPorPrecioDes());
        Collections.sort(vegetales, new VegetalPorPesoDes());
        Collections.sort(vegetales, new VegetalPorNombreDes());
        System.out.println("Listado de vegetales ordenados por nombre, peso y precio de forma descendente");
        Vegetal.imprimirLista(vegetales);

        Collections.sort(vegetales, new VegetalPorPrecioDes());
        Collections.sort(vegetales, new VegetalPorAlturaDes());
        Collections.sort(vegetales, new VegetalPorSuelo());
        System.out.println("Listado de vegetales ordenado por suelo de cultivo de forma ascendente, altura de \n" +
                "cultivo de forma descendente y precio de forma descendente.");
        Vegetal.imprimirLista(vegetales);
    }
}
