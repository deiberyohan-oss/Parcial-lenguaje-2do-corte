import java.util.Scanner;

/**
 * Clase principal.
 * El menú se repite hasta que el usuario elija la opción de salir.
 */
public class Main {
    public static void main(String[] args) {

        // Scanner para leer lo que el usuario escribe en la consola
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        // El ciclo se repite mientras el usuario NO elija 3 (Salir)
        while (opcion != 3) {

            // ---------- MENÚ ----------
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Estudiante");
            System.out.println("2. Profesor");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1 || opcion == 2) {

                // ---------- DATOS COMUNES (Persona) ----------
                System.out.print("\nNombre: ");
                String nombre = sc.nextLine();

                System.out.print("Edad: ");
                int edad = Integer.parseInt(sc.nextLine());

                System.out.print("Documento: ");
                String documento = sc.nextLine();

                // Variable de tipo Persona: puede guardar un Estudiante o un Profesor
                Persona persona;

                if (opcion == 1) {
                    // ---------- DATOS DEL ESTUDIANTE ----------
                    System.out.print("Programa: ");
                    String programa = sc.nextLine();

                    // Se pregunta cuántas notas tiene para poder calcular el promedio
                    System.out.print("¿Cuántas notas desea ingresar?: ");
                    int cantidadNotas = Integer.parseInt(sc.nextLine());

                    double suma = 0; // aquí se van acumulando las notas
                    for (int i = 1; i <= cantidadNotas; i++) {
                        System.out.print("Nota " + i + ": ");
                        double nota = Double.parseDouble(sc.nextLine());
                        suma = suma + nota; // se suma la nota a la suma total
                    }

                    // El promedio se calcula en el programa: suma total / cantidad de notas
                    double promedio = suma / cantidadNotas;

                    persona = new Estudiante(nombre, edad, documento, programa, promedio);

                } else {
                    // ---------- DATOS DEL PROFESOR ----------
                    System.out.print("Área: ");
                    String area = sc.nextLine();

                    System.out.print("Salario base: ");
                    double salarioBase = Double.parseDouble(sc.nextLine());

                    System.out.print("Horas de cátedra: ");
                    int horasCatedra = Integer.parseInt(sc.nextLine());

                    // El salario total lo calcula el método calcularSalario() de Profesor
                    persona = new Profesor(nombre, edad, documento, area, salarioBase, horasCatedra);
                }

                // ---------- RESULTADO ----------
                // Polimorfismo: se ejecuta la versión de mostrarInfo() según el rol
                System.out.println("\n----------------------------");
                persona.mostrarInfo();
                System.out.println("----------------------------");

            } else if (opcion == 3) {
                System.out.println("Programa finalizado.");
            } else {
                System.out.println("Opción inválida, intente de nuevo.");
            }
        }

        sc.close(); // se cierra el Scanner al terminar
    }
}