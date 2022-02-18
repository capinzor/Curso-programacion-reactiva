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
}
