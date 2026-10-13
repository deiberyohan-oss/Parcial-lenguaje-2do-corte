/**
 * Clase Estudiante.
 * Hereda de Persona
 */
public class Estudiante extends Persona {

    private String programa;
    private double promedio;

    // Constructor: los primeros tres datos se envían a Persona con super()
    public Estudiante(String nombre, int edad, String documento,
                      String programa, double promedio) {
        super(nombre, edad, documento);
        this.programa = programa;
        this.promedio = promedio;
    }

    // Sobrescribe mostrarInfo() para agregar los datos propios del estudiante
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // muestra nombre, edad y documento
        System.out.println("Rol: " + getRol());
        System.out.println("Programa: " + programa);
        System.out.println("Promedio: " + promedio);
    }

    // Sobrescribe getRol() para indicar que es un estudiante
    @Override
    public String getRol() {
        return "Estudiante";
    }
}