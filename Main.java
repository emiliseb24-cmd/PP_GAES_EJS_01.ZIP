// Link del repositorio: https://github.com/emiliseb24-cmd/PP_GAES_EJS_01.ZIP.git
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    leerDato(numeros, scanner);
                    pausa(scanner); // <--- Ahora sí hace pausa aquí también
                    break;
                case 2:
                    mostrarPares(numeros);
                    pausa(scanner);
                    break;
                case 3:
                    mostrarCuadrados(numeros);
                    pausa(scanner);
                    break;
                case 4:
                    sumarElementos(numeros);
                    pausa(scanner);
                    break;
                case 5:
                    buscarElemento(numeros, scanner);
                    pausa(scanner);
                    break;
                case 6:
                    encontrarMaximo(numeros);
                    pausa(scanner);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 7);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n===========================");
        System.out.println("     MENÚ DE OPCIONES      ");
        System.out.println("===========================");
        System.out.println("1.- Leer dato");
        System.out.println("2.- Muestre números pares");
        System.out.println("3.- Muestre los cuadrado de los valores");
        System.out.println("4.- Suma de los elementos de la lista");
        System.out.println("5.- Buscar un elementos de la lista");
        System.out.println("6.- Encontrar valor maximo");
        System.out.println("7.- Salir");
    }

    public static void leerDato(List<Integer> lista, Scanner scanner) {
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        lista.add(numero);
        System.out.println("¡Dato agregado con éxito!");
    }

    public static void mostrarPares(List<Integer> lista) {
        System.out.print("Números pares: ");
        for (Integer num : lista) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void mostrarCuadrados(List<Integer> lista) {
        System.out.print("Cuadrados de los valores: ");
        for (Integer num : lista) {
            System.out.print((num * num) + " ");
        }
        System.out.println();
    }

    public static void sumarElementos(List<Integer> lista) {
        int suma = 0;
        for (Integer num : lista) {
            suma += num;
        }
        System.out.println("Suma total de la lista: " + suma);
    }

    public static void buscarElemento(List<Integer> lista, Scanner scanner) {
        System.out.print("Ingresa el número a buscar: ");
        int buscado = scanner.nextInt();
        if (lista.contains(buscado)) {
            System.out.println("El número " + buscado + " SÍ está en la lista.");
        } else {
            System.out.println("El número " + buscado + " NO está en la lista.");
        }
    }

    public static void encontrarMaximo(List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía. Agrega datos primero.");
            return;
        }
        int maximo = lista.get(0);
        for (Integer num : lista) {
            if (num > maximo) {
                maximo = num;
            }
        }
        System.out.println("El valor máximo es: " + maximo);
    }

    public static void pausa(Scanner scanner) {
        System.out.println("\nPresiona Enter para continuar...");
        scanner.nextLine(); // Limpiar buffer
        scanner.nextLine(); // Esperar Enter
    }
}