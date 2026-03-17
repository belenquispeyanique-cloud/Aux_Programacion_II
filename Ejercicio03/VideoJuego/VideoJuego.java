package VideoJuego;

public class VideoJuego {

    private String nombre;
    private String plataforma;
    private int jugadores;

    // Constructor 1
    public VideoJuego(String nombre, String plataforma){
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.jugadores = 0;
    }

    // Constructor 2 (sobrecarga)
    public VideoJuego(String nombre, String plataforma, int jugadores){
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.jugadores = jugadores;
    }

    // Método para agregar 1 jugador
    public void agregarJugadores(){
        jugadores++;
    }

    // Método sobrecargado para agregar varios
    public void agregarJugadores(int cantidad){
        jugadores = jugadores + cantidad;
    }

    public void mostrar(){
        System.out.println("Juego: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Jugadores: " + jugadores);
        System.out.println("----------------------");
    }
}