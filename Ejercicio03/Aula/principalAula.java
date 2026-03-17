package Aula;

public class principalAula {

    public static void main(String[] args) {

        String[] estudiantes = {"Luis","Aracely"};
        int[] notas = {67,89};

        aula a1 = new aula("Aula 101",2,estudiantes,notas);

        System.out.println("Datos del aula");
        a1.mostrar();

        System.out.println("\nEstado de estudiantes");
        a1.mostrar(true);
    }
}