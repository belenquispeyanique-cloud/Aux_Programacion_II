package agregacion4;

public class Aplicacion {

    public static void main(String[] args) {
        // --- INCISO A: Instanciar Edificio y adicionar un Parqueo ---
        System.out.println("\nIniciando Inciso A");

        Parqueo parqueCentral = new Parqueo(35, 78.5);
        Edificio torreEmpresarial = new Edificio("Residencial Andina", 8420.0, parqueCentral);
        System.out.println("--- Edificio y Parqueo registrados correctamente ---");

        // Preparación de datos (Agregando departamentos y habitaciones)
        torreEmpresarial.addDepartamento(401, 4);
        Departamento dep401 = torreEmpresarial.getDeps().get(0);
        dep401.addHabitacion("Dormitorio Principal", 18.0);
        dep401.addHabitacion("Baño Privado", 6.5);

        torreEmpresarial.addDepartamento(402, 4);
        Departamento dep402 = torreEmpresarial.getDeps().get(1);
        dep402.addHabitacion("Dormitorio A", 11.0);
        dep402.addHabitacion("Dormitorio B", 10.5);
        dep402.addHabitacion("Sala de Estar", 16.0);

        torreEmpresarial.addDepartamento(501, 5);
        Departamento dep501 = torreEmpresarial.getDeps().get(2);
        dep501.addHabitacion("Suite Ejecutiva", 24.0);
        dep501.addHabitacion("Baño Social", 5.5);
        dep501.addHabitacion("Cocina Integral", 9.0);
        dep501.addHabitacion("Terraza", 7.5);

        // --- INCISO B: Mostrar depto con más habitaciones del piso Y ---
        System.out.println("\nIniciando Inciso B (Piso 4):");
        torreEmpresarial.mostrarDepMasHabitaciones(4);

        // --- INCISO C: Agregar un Mueble al Departamento con puerta Z del piso X ---
        System.out.println("\nIniciando Inciso C:");
        Mueble mesaVidrio = new Mueble("Mesa", "Vidrio");
        torreEmpresarial.agregarMuebleADepartamento(4, 402, "Sala de Estar", mesaVidrio);

        // --- INCISO G: Agregar un auto al parqueo si hay capacidad ---
        System.out.println("\nIniciando Inciso G:");
        torreEmpresarial.getParqueo().agregarAuto("XYZ-789");

        // --- INCISO D: Mostrar departamento(s) con más muebles ---
        System.out.println("\nIniciando Inciso D:");
        torreEmpresarial.mostrarDepsMasMuebles();

        // --- INCISO E: Mostrar habitación con más muebles del piso Z ---
        System.out.println("\nIniciando Inciso E (Piso 4):");
        torreEmpresarial.habMasMueblesEnPiso(4);

        // --- INCISO F: Eliminar departamentos con cantidad prima de habitaciones ---
        System.out.println("\nIniciando Inciso F (Eliminar habitaciones primas):");
        torreEmpresarial.eliminarDepsHabPrimas();

        // Verificación final
        System.out.println("\nEstado actualizado del Edificio:");
        System.out.println(torreEmpresarial);
    }
}