public class FigurasTest {
     public static void main(String[] args) {
        Triangulo oTriangulo = new Triangulo(0, 0, 12, 4, 6);
        System.out.println("El área del triángulo es: " + oTriangulo.calcularAreaTriangulo());
        System.out.println("EL perímetro del triángulo es: " + oTriangulo.calcularPerimetroTriangulo());

        Cuadrado oCuadrado = new Cuadrado(0,0, 10);
        System.out.println("El área del cuadrado es: " + oCuadrado.calcularAreaCuadrado());
        System.out.println("El perímetro del cuadrado es: " + oCuadrado.calcularPerimetroCuadrado());

        Circulo oCirculo = new Circulo(0, 0, 5);
        System.out.println("El área del círculo es: " + oCirculo.calcularAreaCirculo());
        System.out.println("El perímetro del círculo es: " + oCirculo.calcularPerimetroCirculo());
}
}
