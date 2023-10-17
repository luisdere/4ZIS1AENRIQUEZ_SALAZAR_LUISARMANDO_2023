import java.util.Scanner;

public class PalindromoChecker {
    public static void main(String[] args) {
        // Lee la palabra o frase del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase: ");
        String input = scanner.nextLine();
        scanner.close();

        // Elimina espacios en blanco y convierte a minúsculas
        String textoLimpio = input.replaceAll("\\s", "").toLowerCase();

        // Verifica si es un palíndromo
        if (esPalindromo(textoLimpio)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }

    // Función para verificar si es un palíndromo
    public static boolean esPalindromo(String texto) {
        int longitud = texto.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (texto.charAt(i) != texto.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }
}