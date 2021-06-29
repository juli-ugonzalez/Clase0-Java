package Docs;

import java.util.Scanner;

public class Ejercicio2 {

    public static boolean checkMultiplos(int num, int numDos) {
        return num % numDos == 0;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Ingrese la cantidad de numeros");

            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            System.out.println("Ingrese el numero para chequear sus multiplos");
            int numDos = scanner.nextInt();

            int contMultiplos = 0;

            for (int i = 0; contMultiplos < num; i++) {
                if (checkMultiplos(i, numDos)) {
                    contMultiplos++;
                    System.out.println("El numero " + i + " es multiplo de " + numDos);
                }
            }
        }
    }
}
