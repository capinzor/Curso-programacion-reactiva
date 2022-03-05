package clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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

    static final String RUTA_ARCHIVO_LACTEOS="E:\\Curso-programacion-reactiva\\Prectica2\\assets\\txt\\lacteos.txt";

    public static void crearColeccionLacteos(ArrayList<Lacteo> lacteos) throws IOException {
        Path pathArchivo = Path.of(RUTA_ARCHIVO_LACTEOS);
        String coleccion = Files.readString(pathArchivo);

        String parts[] = coleccion.replaceAll("\n",",").replace("\"","").strip().split(",");

        for (int i=0;i<parts.length/4;i++){

            String tipo = parts[i*4+0];
            double precio = Double.parseDouble(parts[i*4+1]);
            String presentacion = parts[i*4+2];
            double pesoEnGramos = Double.parseDouble(parts[i*4+3]);
            lacteos.add(new Lacteo( tipo, precio, presentacion, pesoEnGramos));

        }
    }
}
