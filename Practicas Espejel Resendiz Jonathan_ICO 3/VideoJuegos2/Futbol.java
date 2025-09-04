package VideoJuegos2;

// Sub-subclase Fútbol (hereda de Deportes)
class Futbol extends Deportes {
    private String torneo;

    public Futbol(String nombre, int ventas, String clasificacion, int añoLanzamiento, String torneo) {
        super(nombre, ventas, clasificacion, añoLanzamiento);
        this.torneo = torneo;
    }

    public String getTorneo() {
        return torneo;
    }

    public void setTorneo(String torneo) {
        this.torneo = torneo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Juego de Fútbol: " + getNombre() +
                "| ventas:" + getVentas() +
                " | Clasificación: " + getClasificacion() +
                "|Año de lanzamiento: "+ getAñoLanzamiento()+
                " | Liga: " + torneo);
    }
}
