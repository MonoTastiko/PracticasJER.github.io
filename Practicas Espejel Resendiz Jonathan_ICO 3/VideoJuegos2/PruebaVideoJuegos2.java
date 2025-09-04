package VideoJuegos2;

public class PruebaVideoJuegos2 {

    public static void main(String[] args) {
        // Polimorfismo: arreglo de tipo Videojuego
        VideoJuegos2[] juegos = new VideoJuegos2[4];
        juegos[0] = new Accion("Call of Duty", 21000,"M",  5);
        juegos[1] = new Aventura("The Legend of Zelda",33000 , "E10+", 3);
        juegos[2] = new Deportes("NBA 2K25",7890, "E", 2024);
        juegos[3] = new Futbol("FIFA 25",19023, "E",2024, "Champions League");

        // Procesamiento polimórfico
        for (VideoJuegos2 v : juegos) {
            v.mostrarInfo(); // Cada objeto ejecuta su versión de mostrarInfo()
        }

for (int j = 0; j < juegos.length; j++)
            System.out.printf("El Juego %d es de  %s%n", j,
                    juegos[j].getClass().getSimpleName());
    }
}

