package VideoJuegos2;

// Superclase abstracta
public abstract class VideoJuegos2{
    private String nombre;
    private int ventas;
    private String clasificacion;

    // Constructor
    public VideoJuegos2(String nombre, int ventas, String clasificacion) {
        this.nombre = nombre;
        this.ventas = ventas;
        this.clasificacion = clasificacion;
    }

    // Getters (Encapsulamiento)
    public String getNombre() {
        return nombre;
    }

    public int getVentas() {
        return ventas;
    }

    public String getClasificacion() {
        return clasificacion;
    }


    // Método abstracto que cada subclase debe implementar
    public abstract void mostrarInfo();
}
