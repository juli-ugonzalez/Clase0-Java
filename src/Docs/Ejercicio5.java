package Docs;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresa la cantidad de numeros:");
            int quantNums = scanner.nextInt();

            System.out.println("Digitos minimos:");
            int minDigits = scanner.nextInt();

            System.out.println("Ingresa el digito a buscar:");
            int searchedDigit = scanner.nextInt();

            int contEncontrados = 0;

            for (int i = 0; contEncontrados < quantNums; i++) {

                char[] numActual = String.valueOf(i).toCharArray();

                int contDigActuales = 0;
                for (char x : numActual) {
                    if (Integer.parseInt(Character.toString(x)) == searchedDigit) {
                        contDigActuales++;
                    }
                }
                if (contDigActuales >= minDigits) {
                    System.out.println(i);
                    contEncontrados++;
                }
            }
        }
    }

}
