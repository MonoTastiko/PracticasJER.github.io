public class PruebaEmpleadoPorComision {
    public static void main(String[] args) {
        EmpleadoPorComision empleado = 
            new EmpleadoPorComision("Ernesto", "Solis", "5554-4556-4321", 4000, .3);

        System.out.printf("%s%n%s: $%,.2f%n",
                empleado, "ingresos", empleado.ingresos());
    }
}
