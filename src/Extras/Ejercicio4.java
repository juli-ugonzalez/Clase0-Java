package Extras;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Seleccione un numero: ");
            int num = scanner.nextInt();

            String respuesta = num % 2 == 0 ? "Es divisible por 2" : "NO es divisible por 2";
            System.out.println(respuesta);
        }
    }
}
