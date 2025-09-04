package VideoJuegos2;

// Subclase Acción
class Accion extends VideoJuegos2 {
    private int nivelViolencia;
    public Accion(String nombre, int ventas, String clasificacion, int nivelViolencia) {
        super(nombre, ventas, clasificacion);
        this.nivelViolencia=nivelViolencia;
    }

    
//Se crean getters y setters 
    public int getNivelViolencia() {
        //se aplica un excepcion para no exeder el nivel de violencia
        if (nivelViolencia<0 | nivelViolencia>5)
 throw new IllegalArgumentException("El nivel de violencia se mide de 1 a 5");
        return nivelViolencia;
    }


    public void setNivelViolencia(int nivelViolencia) {
        this.nivelViolencia = nivelViolencia;
    }

    //Aqui se sobre escribe el metodo abstracto 
    @Override
    public void mostrarInfo() {
        System.out.println(" Juego de Acción: " + getNombre() +
                "| ventas:" + getVentas() +
                " | Clasificación: " + getClasificacion() +
                "| Nivel de violencia:" + getNivelViolencia()) ;
    }

}