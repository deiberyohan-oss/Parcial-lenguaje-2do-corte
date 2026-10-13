public class Persona {

    // Atributos protegidos
    protected String nombre;
    protected int edad;
    protected String documento;

    // constructor
    public Persona(String nombre, int edad, String documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    // Muestra la información básica de la persona en pantalla
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Documento: " + documento);
    }

    // Devuelve el rol de la persona. Las clases hijas lo sobrescriben.
    public String getRol() {
        return "Persona";
    }
}