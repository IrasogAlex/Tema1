package Exercitiul3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți un număr natural: ");
        int n = scanner.nextInt();

        boolean estePrim = true;
        System.out.println("Divizorii numărului " + n + " sunt:");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != 1 && i != n) {
                    estePrim = false;
                }
            }
        }

        if (estePrim & n > 1) {
            System.out.println("\nNumărul " + n + " este prim.");
        } else {
            System.out.println("\nNumărul " + n + " nu este prim.");
        }
    }
}