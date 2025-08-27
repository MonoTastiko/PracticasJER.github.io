//Te da accesso a las librerias de java para poder meter la fecha de nacimiento
import java.util.Date;

public class Persona {
    //Se declaran las variables
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private Date FechaNacimiento;

    public Persona(String Nombre, String ApellidoPaterno, String ApellidoMaterno, Date FechaNacimiento) {
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.FechaNacimiento = FechaNacimiento;
    }

    public String obtenerNombre() {
        return Nombre;
    }

    public String obtenerApellidoPaterno() {
        return ApellidoPaterno;
    }

    public String obtenerApellidoMaterno() {
        return ApellidoMaterno;
    }

    //Se crea un constructor para poder obtener el nombre completo 
    public String obtenerNombreCompleto() {
        return Nombre + " " + ApellidoPaterno + " " + ApellidoMaterno;
    }

    public Date obtenerFechaNacimiento() {
        return FechaNacimiento;
    }
}

