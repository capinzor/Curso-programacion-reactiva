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
}
