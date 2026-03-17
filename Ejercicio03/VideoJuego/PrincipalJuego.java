package VideoJuego;

public class PrincipalJuego {

    public static void main(String[] args) {

        VideoJuego v1 = new VideoJuego("Zelda", "Switch",2);
        VideoJuego v2 = new VideoJuego("Halo", "Xbox", 4);

        System.out.println("Estado inicial:");
        v1.mostrar();
        v2.mostrar();

        // Agregar un jugador al primer juego
        v1.agregarJugadores();
        v1.mostrar();

        // Agregar varios jugadores al segundo juego
        int nuevosJugadores = 7;
        v2.agregarJugadores(nuevosJugadores);
        v2.mostrar();
    }
}