package Extras;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Bienvenido " + nombre);
        }
    }

}
