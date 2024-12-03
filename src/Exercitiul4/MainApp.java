package Exercitiul4;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt(30) + 1;
        int b = random.nextInt(30) + 1;

        System.out.println("Numere generate: " + a + " și " + b);

        int cmmdc = calculeazaCmmdc(a, b);

        System.out.println("CMMDC al numerelor " + a + " si " + b + " este: " + cmmdc);
    }

    public static int calculeazaCmmdc(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}