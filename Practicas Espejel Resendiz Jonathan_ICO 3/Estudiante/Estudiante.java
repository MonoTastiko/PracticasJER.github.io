import java.util.Date;
//se extiende de la clase padre
public class Estudiante extends Persona {
     //Se declaran las variables
    private String IdAlumno;
    private double PromCalif;
    private String Carrera;
    private String Grado;
    private int AnioGraduacion;

    public Estudiante(String Nombre, String ApellidoPaterno, String ApellidoMaterno, Date FechaNacimiento,
                      String IdAlumno, String Carrera, String Grado, int AnioGraduacion) {
        super(Nombre, ApellidoPaterno, ApellidoMaterno, FechaNacimiento);
        this.IdAlumno = IdAlumno;
        this.Carrera = Carrera;
        this.Grado = Grado;
        this.AnioGraduacion = AnioGraduacion;
        this.PromCalif = 0.0;
    }

    public String getIdAlumno() {
        return IdAlumno;
    }

    public String getCarrera() {
        return Carrera;
    }

    public String getGrado() {
        return Grado;
    }

    public int getAnioGraduacion() {
        return AnioGraduacion;
    }

    public double obtenerPromedio() {
        return PromCalif;
    }

    public void cambiarCarrera(String NuevaCarrera) {
        this.Carrera = NuevaCarrera;
    }

    public void calcularPromedio(String[] calificaciones) {
        double suma = 0;
        for (String c : calificaciones) {
            switch (c) {
                case "A": suma += 4; break;
                case "A-": suma += 3.67; break;
                case "B+": suma += 3.33; break;
                case "B": suma += 3; break;
                case "B-": suma += 2.67; break;
                case "C+": suma += 2.33; break;
                case "C": suma += 2; break;
                case "D": suma += 1; break;
                case "F": suma += 0; break;
                default: suma += 0;
            }
        }
        this.PromCalif = suma / calificaciones.length;
    }
//se sobreescribe el metodo en una cadena de caracteres 
    @Override
    public String toString() {
        return "Estudiante: " + obtenerNombreCompleto() +
                "\nFecha Nacimiento: " + obtenerFechaNacimiento() +
                "\nID: " + IdAlumno +
                "\nPromedio: " + PromCalif +
                "\nCarrera: " + Carrera +
                "\nGrado: " + Grado +
                "\nAño de Graduación: " + AnioGraduacion;
    }
}
