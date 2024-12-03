package Exercitiul5;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();
        int numar = random.nextInt(21);

        System.out.println("Numarul generat este: " + numar);

        if (esteInFibonacci(numar)) {
            System.out.println("Numarul " + numar + " apartine sirului lui Fibonacci.");
        } else {
            System.out.println("Numarul " + numar + " NU apartine sirului lui Fibonacci.");
        }
    }

    public static boolean esteInFibonacci(int numar) {
        if (numar == 0 || numar == 1) {
            return true;
        }

        int a = 0, b = 1;
        while (b < numar) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b == numar;
    }
}
