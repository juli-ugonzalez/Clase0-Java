package Docs;

import java.util.Scanner;

public class Ejercicio3 {

    public static boolean esPrimo(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        boolean esPrimo = false;
        if (contador == 2) {
            esPrimo = true;
        }
        return esPrimo;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un numero para chequear si es primo");

            int num = scanner.nextInt();

            String response;
            response = esPrimo(num) ? "El numero es primo" : "El numero no es primo";
            System.out.println(response);
        }
    }
}
