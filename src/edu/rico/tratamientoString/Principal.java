package edu.rico.tratamientoString;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //tipo   ref     objeto
        String nombre = "Álvaro";

        nombre.toUpperCase();

        //los métodos se invocan utilizando "." -> SOLO INVOCA UN MÉTODO UNA CLASE O UN OBJETO
        int numero = 10;
        int numero3 = 10;
        int numero2 = 27;
        //Esto convierte el 10 numérico en una cadena de texto "10"
        System.out.println(String.valueOf(numero));
        String nombreMinusculas = nombre.toLowerCase();
        System.out.println(nombreMinusculas);

        String numeroTexto = "10";
        int numeroInt = Integer.parseInt(numeroTexto);
        boolean logico = true;
        double decimal = 10.0;
        char caracter = 'l';
        String letra = "\"l\"";
        System.out.println(letra);

        System.out.println(caracter + 1);
        System.out.println(letra + 1);
        /*
        if(caracter == letra){
            System.out.println("Soy lo mismo");
        }*/

        //Tipo  ref      objeto creado con "new"
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String cadena = new String("Mateo");







    }
}
