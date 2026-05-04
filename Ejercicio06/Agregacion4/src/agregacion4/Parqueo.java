
package agregacion4;

public class Parqueo {
    private int capacidad ;
    private int cantAuto;
    private String[]parqueo ; //placas
    private double precioH;
    
    public Parqueo( int capacidad, double precioH){
        this.capacidad = capacidad;
        this.precioH = precioH;
        this.parqueo = new String[capacidad];
        this.cantAuto = 0;
       
    }
    public int getcapacidad(){
        return this.capacidad;
    }
    public int getcantauto(){
        return this.cantAuto;
    }
    public void agregarAuto( String Placa){
        if (cantAuto < capacidad){
            parqueo[cantAuto] = Placa;
            cantAuto ++; 
            System.out.println( "Auto Registrado" );
            
        }else{
          System.out.println("Capacidad llena");
        }
    }
    public String toString(){
        return "Parqueo{cantAuto = "+this.cantAuto+"capacidad="+ this.capacidad+"precioH= "+this.precioH+"}";
    }
}
