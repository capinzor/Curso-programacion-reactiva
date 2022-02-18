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
}
