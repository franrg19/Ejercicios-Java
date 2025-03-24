package EjerciciosClase5;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosClase5 {
    public static void main(String[] args) {
    //Ejercicio 1: Clasificación de edad
    //Pide al usuario su edad e imprime si es menor de edad, adulto o adulto mayor.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();

        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Eres un adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }
        scanner.close();

    //Ejercicio 2: Contador de vocales
    // Pide al usuario una palabra y cuenta cuántas vocales tiene.
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una palabra");
        String palabra = sc.nextLine().toLowerCase();

        int contador = 0;

        for (int i = 0; i < palabra.length();i++) {
            char letra = palabra.charAt(i);
            if ("aeiou".indexOf(letra) != -1){
                contador++;
            }
        }
        System.out.println(" Numero de vocales" + contador);
        sc.close();

    //Ejercicio 3. Crea una calculadora
        Scanner scn = new Scanner(System.in);

        System.out.println("Menú:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Elige una opción: ");

        int opcion = scn.nextInt();

        System.out.print("Ingresa el primer número: ");
        double num1 = scn.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scn.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();



    //Ejercicio 4: Números pares hasta N
    //Pide un número al usuario y muestra todos los números pares desde 1 hasta ese número.
        Scanner cs =new Scanner(System.in);
        System.out.println("introduce un numero: ");
        int numero = cs.nextInt();

        for (int i = 2; i <= numero; i += 2) {
            System.out.print(i + " ");
        }
        cs.close();



    //Ejercicio 5: Contraseña con intentoss limitados
    // Pide al usuario una contraseña. Solo tiene 3 intentoss antes de bloquearse.
        Scanner nscanner = new Scanner(System.in);
        final String contrasena_correcta = "1409";
        int intentos = 3;

        while(intentos > 0 ){
            System.out.println("ingrese la contraseña: ");
            String entradaUsuario = nscanner.nextLine();
            if (entradaUsuario.equals(contrasena_correcta)){
                System.out.println("contraseña correcta");
                return;
            } else {
                intentos --;
                if ((intentos>0)){
                    System.out.println("contraseña incorrecta. Intentos restantes: " + intentos);
                }else {
                    System.out.println("Acceso bloqueado. Has superado el numero de intentoss.");
                }
            }

        }

        nscanner.close();

    //Ejercicio 6: Adivina el número
      // Genera un número aleatorio entre 1 y 100 y deja que el usuario lo adivine con pistas.

        Scanner scanner5 = new Scanner(System.in);

        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Generar un número aleatorio entre 1 y 100
        int numeroSecreto = random.nextInt(100) + 1;

        // Variable para almacenar el intento del usuario
        int intento;

        // Variable para contar los intentoss
        int intentoss = 0;

        System.out.println("¡Bienvenido al juego de Adivina el Número!");
        System.out.println("He generado un número entre 1 y 100. ¡Adivina cuál es!");

        // Bucle para que el usuario siga intentando hasta adivinar el número
        do {
            System.out.print("Introduce tu intento: ");
            intento = sc.nextInt();
            intentoss++; // Contamos cada intento

            // Comprobamos si el intento es correcto
            if (intento < numeroSecreto) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentoss + " intentoss.");
            }
        } while (intento != numeroSecreto); // El bucle continúa hasta que el usuario adivine el número

        sc.close(); // Cerramos el objeto Scanner
    }

}
