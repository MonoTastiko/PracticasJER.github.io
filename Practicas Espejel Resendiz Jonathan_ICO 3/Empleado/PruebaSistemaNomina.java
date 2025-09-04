public class PruebaSistemaNomina {
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado =
            new EmpleadoAsalariado("Gerardo", "Caballero", "234-23-9872", 600.00);
        EmpleadoPorHoras empleadoPorHoras =
            new EmpleadoPorHoras("Carlos", "Arturo", "210-98-2038", 14.50, 30);
        EmpleadoPorComision empleadoPorComision =
            new EmpleadoPorComision("Edson", "Gamboa", "318-56-1628", 90000, .04);
        EmpleadoBaseMasComision empleadoBaseMasComision =
            new EmpleadoBaseMasComision("Jaziel", "Gonzales", "492-09-7592", 7000, .07, 280);

        System.out.println("Empleados procesados por separado:\n");

        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoAsalariado,
                "ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoPorHoras,
                "ingresos", empleadoPorHoras.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoPorComision,
                "ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoBaseMasComision,
                "ingresos", empleadoBaseMasComision.ingresos());

        Empleado[] empleados = new Empleado[4];
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        System.out.println("Empleados procesados en forma polimórfica:\n");

        for (Empleado empleadoActual : empleados) {
            System.out.println(empleadoActual);
//intacia de (instancia=objeto)
            if (empleadoActual instanceof EmpleadoBaseMasComision) {
                //conversion descendente, siempre y cuando tenga las caracteristicas de empleadobasemascomision
                //se hace un casting
                EmpleadoBaseMasComision empleado =
                        (EmpleadoBaseMasComision) empleadoActual;
                        //
                empleado.establecerSalarioBase(
                        1.10 * empleado.obtenerSalarioBase());
                System.out.printf("nuevo salario base con 10%% de aumento es: $%,.2f%n",
                        empleado.obtenerSalarioBase());
            }

            System.out.printf("ingresos $%,.2f%n%n", empleadoActual.ingresos());
        }

        for (int j = 0; j < empleados.length; j++)
            System.out.printf("El empleado %d es un %s%n", j,
                    empleados[j].getClass().getName());
    }
}