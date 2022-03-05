package clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Carne {
    private String nombre;
    private double precio;
    private String maduracion;
    private double pesoEnGramos;

    public Carne(String nombre, double precio, String maduracion, double pesoEnGramos) {
        this.nombre = nombre;
        this.precio = precio;
        this.maduracion = maduracion;
        this.pesoEnGramos = pesoEnGramos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMaduracion() {
        return maduracion;
    }

    public void setMaduracion(String maduracion) {
        this.maduracion = maduracion;
    }

    public double getPesoEnGramos() {
        return pesoEnGramos;
    }

    public void setPesoEnGramos(double pesoEnGramos) {
        this.pesoEnGramos = pesoEnGramos;
    }

    public static void imprimirLista(ArrayList<Carne> carnes){
        System.out.println("===============================================================");
        System.out.printf("%15s %10s %12s %s", "NOMBRE", "PRECIO", "MADURACIÓN", "PESO");
        System.out.println();
        for(Carne carne : carnes){
            System.out.format("%15s %10s %12s %7s",
                    carne.getNombre(), carne.getPrecio(), carne.getMaduracion(), carne.getPesoEnGramos());
            System.out.println();
        }
        System.out.println();
    }

    static final String RUTA_ARCHIVO_CARNES="E:\\Curso-programacion-reactiva\\Prectica2\\assets\\txt\\carnes.txt";

    public static void crearColeccionCarnes(ArrayList<Carne> carnes) throws IOException {
        Path pathArchivo = Path.of(RUTA_ARCHIVO_CARNES);
        String coleccion = Files.readString(pathArchivo);

        String parts[] = coleccion.replaceAll("\n",",").replace("\"","").strip().split(",");

        for (int i=0;i<parts.length/4;i++){

            String nombre = parts[i*4+0];
            double precio = Double.parseDouble(parts[i*4+1]);
            String maduracion = parts[i*4+2];
            double pesoEnGramos = Double.parseDouble(parts[i*4+3]);
            carnes.add(new Carne( nombre, precio, maduracion, pesoEnGramos));
        }
    }

}
