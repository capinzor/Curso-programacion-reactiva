package clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Vegetal {
    String nombre;
    double precio;
    double peso;
    String presentacion;
    String sueloDeCultivo;
    double alturaDeCultivo;

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public String getSueloDeCultivo() {
        return sueloDeCultivo;
    }

    public double getAlturaDeCultivo() {
        return alturaDeCultivo;
    }

    public Vegetal(String nombre, double precio, double peso, String presentacion, String sueloDeCultivo, double alturaDeCultivo) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.presentacion = presentacion;
        this.sueloDeCultivo = sueloDeCultivo;
        this.alturaDeCultivo = alturaDeCultivo;
    }

    public static void imprimirLista(ArrayList<Vegetal> vegetales){
        System.out.println("===============================================================");
        System.out.printf("%15s %7s %7s %15s %12s %10s", "NOMBRE", "PRECIO", "PESO", "PRESENTACION", "SUELO", "ALTURA");
        System.out.println();
        for(Vegetal vegetal : vegetales){
            System.out.format("%15s %7s %7s %10s %17s %10s",
                    vegetal.getNombre(), vegetal.getPrecio(), vegetal.getPeso(), vegetal.getPresentacion(),
                    vegetal.getSueloDeCultivo(), vegetal.getAlturaDeCultivo());
            System.out.println();
        }
        System.out.println();
    }

    static final String RUTA_ARCHIVO_VEGETALES="E:\\Curso-programacion-reactiva\\Prectica2\\assets\\txt\\vegetales.txt";

    public static void crearColeccionVegetales(ArrayList<Vegetal> vegetales) throws IOException {
        Path pathArchivo = Path.of(RUTA_ARCHIVO_VEGETALES);
        String coleccion = Files.readString(pathArchivo);

        String parts[] = coleccion.replaceAll("\n",",").replace("\"","").strip().split(",");

        for (int i=0;i<parts.length/6;i++){

            String nombre = parts[i*6+0];
            double precio = Double.parseDouble(parts[i*6+1]);
            double peso = Double.parseDouble(parts[i*6+2]);
            String presentacion = parts[i*6+3];
            String suelo = parts[i*6+4];
            double altura = Double.parseDouble(parts[i*6+5]);
            vegetales.add(new Vegetal(nombre, precio, peso, presentacion, suelo, altura));

        }
    }
}
