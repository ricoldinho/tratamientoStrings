package edu.rico.tratamientoString.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");

        String palabra = sc.nextLine();
        int tamanhoPalabra = palabra.length();
        System.out.println("La longitud de la palabra es: " + tamanhoPalabra);

        char primeraLetra = palabra.charAt(0);
        //convertir el char en un String
        //String primeraLetraEnCadena = Character.toString(primeraLetra);
        String primeraLetraEnCadena = String.valueOf(primeraLetra);
        System.out.println("El primer caracter de la palabra es: " + primeraLetra);
        //char ultimaLetra = palabra.charAt(tamanho-1);
        //char ultimaLetra = palabra.charAt(palabra.length()-1);
        int posicionUltimaLetra = palabra.length()-1;
        char ultimaLetra = palabra.charAt(posicionUltimaLetra);
    }
}
