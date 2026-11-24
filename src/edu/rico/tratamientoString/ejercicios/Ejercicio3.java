package edu.rico.tratamientoString.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();
        System.out.println("Introduzca una palabra: ");
        String palabra = sc.nextLine();

        if(frase.contains(palabra)){
            int posicion = frase.indexOf(palabra);
            System.out.println("Sí está la palabra, en la posición " + posicion);
        }else{
            System.out.println("La palabra no está");
        }


    }
}
