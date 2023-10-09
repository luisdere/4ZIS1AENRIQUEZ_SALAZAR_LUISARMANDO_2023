import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Lista de palabras para el juego
        String[] palabras = {"java", "programacion", "computadora", "inteligencia", "artificial"};

        // Seleccionar una palabra aleatoria
        String palabraSeleccionada = palabras[random.nextInt(palabras.length)];

        // Convertir la palabra en un arreglo de caracteres
        char[] letras = palabraSeleccionada.toCharArray();

        // Variables del juego
        int intentos = 3;
        int puntaje = 0;
        StringBuilder palabraAdivinada = new StringBuilder("_".repeat(letras.length));

        System.out.println("¡Bienvenido al juego de Ahorcado!");
        System.out.println("Tienes 3 pistas para adivinar la palabra.");
        System.out.println("Pista 1: La palabra tiene " + letras.length + " letras.");
        System.out.println("Pista 2: La primera letra de la palabra es '" + letras[0] + "'.");
        System.out.println("Pista 3: La última letra de la palabra es '" + letras[letras.length - 1] + "'.\n");

        while (intentos > 0) {
            System.out.println("Palabra actual: " + palabraAdivinada.toString());
            System.out.print("Ingresa una letra: ");
            char letra = scanner.nextLine().charAt(0);

            if (palabraSeleccionada.contains(String.valueOf(letra))) {
                System.out.println("¡Adivinaste una letra!");
                puntaje += 10;

                // Actualizar la palabra adivinada con la letra adivinada
                for (int i = 0; i < letras.length; i++) {
                    if (letras[i] == letra) {
                        palabraAdivinada.setCharAt(i, letra);
                    }
                }

                if (palabraAdivinada.toString().equals(palabraSeleccionada)) {
                    System.out.println("\n¡Felicidades! Has adivinado la palabra correctamente: '" + palabraSeleccionada + "'");
                    System.out.println("Tu puntaje final es: " + puntaje);
                    break;
                }
            } else {
                System.out.println("Letra incorrecta. Pierdes 1 intento.");
                intentos--;
            }
        }

        if (intentos == 0) {
            System.out.println("\n¡Has agotado todos tus intentos! La palabra correcta era: '" + palabraSeleccionada + "'");
            System.out.println("Tu puntaje final es: " + puntaje);
        }
    }
}