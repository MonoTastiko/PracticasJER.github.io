package VideoJuegos2;

// Subclase Deportes
class Deportes extends VideoJuegos2 {
    //variables de la clase
    private int añoLanzamiento;
    //metodo constructor
    public Deportes(String nombre,  int ventas, String clasificacion, int añoLanzamiento) {
        super(nombre, ventas, clasificacion);
        this.añoLanzamiento=añoLanzamiento;
    }

 public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

//Aqui se sobre escribe el motodo abstracto 
    @Override
    public void mostrarInfo() {
        System.out.println("Juego de Deportes: " + getNombre() +
                "| ventas:" + getVentas() +
                " | Clasificación: " + getClasificacion()+ 
                "| Año de Lanzamiento: "+ getAñoLanzamiento());
    }
}






   