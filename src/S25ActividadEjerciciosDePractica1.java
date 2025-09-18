import java.util.Scanner;

public class S25ActividadEjerciciosDePractica1 {
    public static void ejecutar(Scanner sc) {
        int[] arreglo1 = new int[7];
        int[] arreglo2 = new int[7];
        int[] arreglo3 = new int[7];
        int suma = 0;

        // Leer primer arreglo
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese número para arreglo #1 Indice [" + i + "]: ");
            arreglo1[i] = sc.nextInt();    
        }

        System.out.println("");
        
        // Leer segundo arreglo
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese número para arreglo #2 Indice [" + i + "]: ");
            arreglo2[i] = sc.nextInt();
        }

        System.out.println("");

        // Calcular diferencias y llenar el tercer arreglo
        for (int i = 0; i < 7; i++) {
            arreglo3[i] = arreglo1[i] - arreglo2[i];
            suma += arreglo3[i];
        }

        double promedio = (double) suma / 7;

        // Mostrar resultados
        System.out.println("");
        System.out.println("Elementos del arreglo #3: ");
        for (int i = 0; i < 7; i++) {
            System.out.println(arreglo3[i]);
        }

        System.out.println("");
        System.out.println("El promedio es: " + promedio);
        System.out.println("\n");
    }
}

