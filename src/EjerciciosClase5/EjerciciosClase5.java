package EjerciciosClase5;

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

    }
}
