package VideoJuegos2;

// Subclase Aventura
class Aventura extends VideoJuegos2 {
 private int graficos;


    public Aventura(String nombre,  int ventas, String clasificacion, int graficos) {
        super(nombre, ventas, clasificacion);
        this.graficos=graficos;
    }


    public int getGraficos() {
        //Se aplica una excepcion para no exedender la dimension de los graficos
if( graficos < 2 || graficos > 3)
 throw new IllegalArgumentException("Los graficos deben ser 2D o 3D");
        return graficos;
    }


    public void setGraficos(int graficos) {
        this.graficos = graficos;

    }



    
    @Override
    public void mostrarInfo() {
        System.out.println("Juego de Aventura: " + getNombre() +
                "| ventas:" + getVentas() +
                " | Clasificación: " + getClasificacion()+
                "| Graficos: " + getGraficos()+"D" );
    }





}