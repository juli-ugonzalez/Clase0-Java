package Extras;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Seleccione el primer numero");
            int num = scanner.nextInt();

            System.out.println("Seleccione el segundo numero");
            int numDos = scanner.nextInt();

            printAll(num, numDos);
        }
    }

    public static void printAll(int numUno, int numDos) {
        System.out.println("El resultado de la suma es: " + suma(numUno, numDos));
        System.out.println("El resultado de la resta es: " + resta(numUno, numDos));
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion(numUno, numDos));
        System.out.println("El resultado de la division es: " + division(numUno, numDos));
        System.out.println("El resultado del resto es: " + resto(numUno, numDos));
    }

    public static int suma(int numUno, int numDos) {
        return numUno + numDos;
    }

    public static int resta(int numUno, int numDos) {
        return numUno - numDos;
    }

    public static int multiplicacion(int numUno, int numDos) {
        return numUno * numDos;
    }

    public static int division(int numUno, int numDos) {
        return numDos == 0 ? 0 : numUno / numDos;
    }

    public static double resto(int numUno, int numDos) {
        return numDos == 0 ? 0 : numUno % numDos;
    }
}
