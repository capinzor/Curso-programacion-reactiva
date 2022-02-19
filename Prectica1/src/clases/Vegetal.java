package clases;

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
}
