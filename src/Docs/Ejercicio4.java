package Docs;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa un numero:");

            int cantPrimos = scanner.nextInt();
            printPrimos(cantPrimos);
        }
    }

    private static void printPrimos(int cantPrimos) {
        int contPrimos = 0;
        for (int i = 0; contPrimos < cantPrimos; i++) {
            if (Ejercicio3.esPrimo(i)) {
                System.out.println("El numero " + i + " es primo.");
                contPrimos++;
            }
        }
    }

}
