package edu.rico.tratamientoString.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String claveSecreta = "Java";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una clave");
        String clave = sc.nextLine();

        if(clave.equals(claveSecreta)){
            System.out.println("EXACTA");
        } else if (clave.equalsIgnoreCase(claveSecreta)) {
            System.out.println("CASI");
        } else{
            System.out.println("INCORRECTA");
        }


    }
}
