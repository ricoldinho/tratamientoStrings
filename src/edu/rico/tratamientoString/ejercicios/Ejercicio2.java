package edu.rico.tratamientoString.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un nombre:");
        //String nombre = sc.nextLine().trim();
        String nombre = sc.nextLine();
        String nombreSinEspacios = nombre.trim();
        System.out.println(nombreSinEspacios);
        System.out.println(nombreSinEspacios.toUpperCase());
        System.out.println(nombreSinEspacios.toLowerCase());
    }
}
