/**
 * Clase Profesor.
 * También hereda de Persona.
 */
public class Profesor extends Persona {

    // Atributos privados (- en el diagrama UML)
    private String area;
    private double salarioBase;
    private int horasCatedra;

    // Constructor: usa super() para guardar los datos de Persona
    public Profesor(String nombre, int edad, String documento,
            String area, double salarioBase, int horasCatedra) {
        super(nombre, edad, documento);
        this.area = area;
        this.salarioBase = salarioBase;
        this.horasCatedra = horasCatedra;
    }

    // Calcula el salario total: salario base x horas de cátedra
    public double calcularSalario() {
        return salarioBase * horasCatedra;
    }

    // Sobrescribe mostrarInfo() para agregar los datos propios del profesor
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // muestra nombre, edad y documento
        System.out.println("Rol: " + getRol());
        System.out.println("Área: " + area);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Horas de cátedra: " + horasCatedra);
        System.out.println("Salario total: $" + calcularSalario());
    }

    // Sobrescribe getRol() para indicar que es un profesor
    @Override
    public String getRol() {
        return "Profesor";
    }
}