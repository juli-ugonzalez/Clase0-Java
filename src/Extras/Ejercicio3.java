package Extras;

import java.util.Scanner;

public class Ejercicio3 {

    private static final int EXPONENTE = 2;

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el radio del circulo: ");
            double radio = scanner.nextDouble();

            double area = Math.PI * Math.pow(radio, EXPONENTE);
            System.out.println(area);
        }
    }
}
