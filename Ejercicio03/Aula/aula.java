package Aula;

public class aula {

    private String nombreAula;
    private int piso;
    private String[] estudiantes;
    private int[] notas;

    public aula(String nombreAula, int piso, String[] estudiantes, int[] notas){
        this.nombreAula = nombreAula;
        this.piso = piso;
        this.estudiantes = estudiantes;
        this.notas = notas;
    }

    // Método 1 mostrar datos
    public void mostrar(){
        System.out.println("Aula: " + nombreAula);
        System.out.println("Piso: " + piso);

        for(int i=0;i<estudiantes.length;i++){
            System.out.println(estudiantes[i] + " - Nota: " + notas[i]);
        }
    }

    // Método sobrecargado
    public void mostrar(boolean estado){

        for(int i=0;i<estudiantes.length;i++){

            String resultado;

            if(notas[i] >= 51){
                resultado = "APROBADO";
            }else{
                resultado = "REPROBADO";
            }

            System.out.println(estudiantes[i] + " -> " + resultado);
        }
    }
}