package Docs;

import java.util.Scanner;

public class Ejercicio1 {

    public static Boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresa la cantidad de numeros pares a mostrar: ");
            int n = scanner.nextInt();

            for (int i = 0; i <= n; i++) {
                if (esPar(i)) {
                    System.out.println("Numero: " + i);
                }
            }

        }
    }

}
