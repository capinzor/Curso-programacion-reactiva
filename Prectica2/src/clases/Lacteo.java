package clases;

import java.util.ArrayList;

public class Lacteo {
    String tipo;
    double precio;
    String presentacion;
    double pesoEnGramos;

    public Lacteo(String tipo, double precio, String presentacion, double pesoEnGramos) {
        this.tipo = tipo;
        this.precio = precio;
        this.presentacion = presentacion;
        this.pesoEnGramos = pesoEnGramos;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public double getPesoEnGramos() {
        return pesoEnGramos;
    }

    public static void imprimirLista(ArrayList<Lacteo> lacteos){
        System.out.println("===============================================================");
        System.out.printf("%15s %10s %12s %s", "TIPO", "PRECIO", "PRESENTACIÓN", "PESO");
        System.out.println();
        for(Lacteo lacteo : lacteos){
            System.out.format("%15s %10s %12s %7s",
                    lacteo.getTipo(), lacteo.getPrecio(), lacteo.getPresentacion(), lacteo.getPesoEnGramos());
            System.out.println();
        }
        System.out.println();
    }
}
