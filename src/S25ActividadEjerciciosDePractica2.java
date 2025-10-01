import java.util.Random;
import java.util.Stack;

public class S25ActividadEjerciciosDePractica2 {

    // Clase interna para la pila con arreglo
    static class PilaArreglo {
        private int[] datos;
        private int tope;

        public PilaArreglo(int tamaño) {
            datos = new int[tamaño];
            tope = -1;
        }

        public boolean estaLlena() {
            return tope == datos.length - 1;
        }

        public boolean estaVacia() {
            return tope == -1;
        }

        public void apilar(int valor) {
            if (!estaLlena()) {
                datos[++tope] = valor;
            } else {
                System.out.println("La pila está llena.");
            }
        }

        public int desapilar() {
            if (!estaVacia()) {
                return datos[tope--];
            } else {
                System.out.println("La pila está vacía.");
                return -1;
            }
        }

        public int tamañoActual() {
            return tope + 1;
        }

        public int espacioDisponible() {
            return datos.length - tamañoActual();
        }

        public void mostrarEspacioDisponible() {
            if (estaLlena()) {
                System.out.println("La pila está llena. No se pueden agregar más datos.");
            } else {
                System.out.println("Se pueden agregar " + espacioDisponible() + " datos a la pila.");
            }
        }
    }

    public static void main(String[] args) {
        // PARTE 1: Pila con arreglo
        PilaArreglo pila = new PilaArreglo(9);
        Random rand = new Random();

        System.out.println("Apilando 5 valores aleatorios:");
        for (int i = 0; i < 5; i++) {
            int valor = rand.nextInt(100);
            pila.apilar(valor);
            System.out.println("Valor apilado: " + valor);
        }

        System.out.println("\nTamaño actual de la pila: " + pila.tamañoActual());

        int eliminado = pila.desapilar();
        System.out.println("\nDato eliminado: " + eliminado);

        System.out.println("\nTamaño actual de la pila: " + pila.tamañoActual());

        pila.mostrarEspacioDisponible();

        // PARTE 2: Usando Stack
        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();

        for (int i = 0; i < 7; i++) {
            int valor = rand.nextInt(100);
            pila1.push(valor);
        }

        System.out.println("\nPila 1: " + pila1);

        while (!pila1.isEmpty()) {
            pila2.push(pila1.pop());
        }

        System.out.println("\nPila 2 (inversa): " + pila2);
        System.out.println("\n");
    }
}