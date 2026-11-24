package edu.rico.tratamientoString.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String email;
        do{
            System.out.println("Introduzca un email");
            email = teclado.nextLine();
        }while(!email.contains("@"));

        int posicionArroba = email.indexOf("@");
        String nombre = email.substring(0, posicionArroba);
        String dominio = email.substring(posicionArroba + 1);
        System.out.println("El nombre del email es: " + nombre);
        System.out.println("El dominio del email es: " + dominio);

    }
}
