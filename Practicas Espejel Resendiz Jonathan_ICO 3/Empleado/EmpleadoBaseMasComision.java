public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    //se declaran las variables
    private double salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno,
                                   String numeroSeguroSocial,
                                   double ventasBrutas, double tarifaComision, double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    public void establecerSalarioBase(double salarioBase) {
        //si alguien escribe un valor menor a 0 se lanza la excepcion
        if (salarioBase < 0.0)
        //se lanza una excepcion a errores que ocurran 
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        this.salarioBase = salarioBase;
    }

    public double obtenerSalarioBase() { 
        return salarioBase; 
    }
//se vuelve a sobreescribir el metodo y se manda a llamar al metodo ingresos de la super clase
    @Override
    public double ingresos() {
        return obtenerSalarioBase() + super.ingresos();
    }

    @Override
    public String toString() {
        return String.format("Empleado con base más comisión: %s%nSalario base: $%,.2f",
                super.toString(), obtenerSalarioBase());
    }
}
