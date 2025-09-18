// Programa de prueba de la interfaz PorPagar que procesa objetos
// Factura y Empleado mediante el polimorfismo
public class PruebaInterfazPorPagar {
    public static void main(String[] args) {

        // crea arreglo PorPagar con cuatro elementos
        PorPagar[] objetosPorPagar = new PorPagar[4];

        // Llama el arreglo con objetos que implementan la interfaz PorPagar
        objetosPorPagar[0] = new Factura("32482", "Mesa", 7, 200.00);
        objetosPorPagar[1] = new Factura("08126", "Sillas", 5, 98.00);
        objetosPorPagar[2] = new EmpleadoAsalariado("Jhon", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barns", "888-88-8888", 1200.00);

        System.out.println("Facturas y Empleados procesados en forma polimorfica:");

        // procesa en forma genérica cada elemento en el arreglo objetosPorPagar
        for (PorPagar porPagarActual : objetosPorPagar) {
            // Imprime porPagarActual y su monto de pago apropiado
            System.out.printf("%n%s %n%s: $%,.2f%n",
                    porPagarActual.toString(), "pago vencido", porPagarActual.obtenerMontoPago());
        }
    }
}
