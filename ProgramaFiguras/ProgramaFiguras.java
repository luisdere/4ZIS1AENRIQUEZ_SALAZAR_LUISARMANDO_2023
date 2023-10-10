import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero = 0;

        do {
            try {
                System.out.print("Ingresa un número: ");
                numero = scanner.nextDouble();

                // Verificar si es un número válido
                if (esNumeroValido(numero)) {
                    System.out.println("Número válido ingresado: " + numero);
                    break; // Salir del bucle si el número es válido
                } else {
                    System.out.println("Número no válido. Inténtalo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                scanner.next(); // Limpiar el búfer de entrada
            }
        } while (true);

        // Realizar alguna operación con el número válido
        // Ejemplo: imprimir el cuadrado del número
        double cuadrado = numero * numero;
        System.out.println("El cuadrado de " + numero + " es " + cuadrado);

        scanner.close();
    }

    // Método para verificar si un número es válido (puedes personalizar esta lógica)
    private static boolean esNumeroValido(double numero) {
        return numero >= 0; // Por ejemplo, se considera válido si es un número no negativo
    }
}