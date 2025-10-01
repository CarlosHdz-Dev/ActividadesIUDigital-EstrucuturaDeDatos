import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== MENÚ PRINCIPAL === ");
            System.out.println("1) S25 Actividad Ejercicios De Practica 1");
            System.out.println("0) Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    // Llama a la clase del Ejercicio 1
                    S25ActividadEjerciciosDePractica1.ejecutar(scanner);
                    break;
               
                case 0:
                    System.out.println("Cerrando...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    System.out.println("");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
