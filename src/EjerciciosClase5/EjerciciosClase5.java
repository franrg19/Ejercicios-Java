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

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if ("aeiou".indexOf(letra) != -1) {
                contador++;
            }
        }
        System.out.println(" Numero de vocales" + contador);
        sc.close();

    //Ejercicio 3: Simulación de una calculadora
    // Crea un menú que permita sumar, restar, multiplicar y dividir dos números ingresados por el usuario.
        Scanner calc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("Elige una opción");

        int opcion = calc.nextInt();

        System.out.println("ingresa el primer numero");
        double num1 = calc.nextDouble();

        System.out.println("ingresa el segundo numero");
        double num2 = calc.nextDouble();

        switch (opcion){
            case 1:
                System.out.println("Resultado: " + (num1+num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1-num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1*num2));
                break;
            case 4:
                if (num2 != 0){
                    System.out.println("Resultado: " + num1 / num2);
                }else{
                    System.out.println("no se puede dividir por cero");
                }
                break;
            default:
                System.out.println("Opción no valida");
        }
        calc.close();












    }
}
