
package agregacion4;
import java.util.ArrayList;

public class Habitacion {
    private String nombre;
    private double tamanio;
    private int cantMuebles;
    private ArrayList<Mueble> muebles;
    
    public Habitacion(String nombre, double tamanio){
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.muebles = new ArrayList<>(100);
        this.cantMuebles = this.muebles.size();
    }
    public String getnombre(){
        return nombre;
        
    }
    public int getcantidad(){
        return cantMuebles;
    }
    public void agregarMueble(Mueble m){
        this.muebles.add(m);
        this.cantMuebles = this.muebles.size();
    }

    @Override
    public String toString() {
        return "Habitacion{" + "nombre=" + nombre + ", tamanio=" + tamanio + ", cantMuebles=" + cantMuebles + ", muebles=" + muebles + '}';
    }
}
