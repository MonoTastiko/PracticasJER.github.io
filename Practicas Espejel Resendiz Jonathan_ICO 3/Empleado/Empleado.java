// se crea la clase principal con metodos abstractos
public abstract class Empleado {
    //se crean las variables variables
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;

    // constructor
    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
// se crean los getters
    public String obtenerPrimerNombre() { 
        return primerNombre; 
        }
    public String obtenerApellidoPaterno() { 
        return apellidoPaterno; 
        }
    public String obtenerNumeroSeguroSocial() {
         return numeroSeguroSocial; 
        }
//se sobreescribe de la clase object
    @Override
    public String toString() {
        return String.format("%s %s%nnumero de seguro social: %s",
                obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial());
    }

    // método abstracto sobrescrito por las subclases
    public abstract double ingresos();
}
