package Exercitiul1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lungime = ");
        int lungime = scanner.nextInt();
        System.out.println("Latime = ");
        int latime = scanner.nextInt();
        scanner.close();
        int perimetru = 2 * (latime + lungime);
        int aria = latime * lungime;
        System.out.println("Perimetrul = "+perimetru+"\nAria = "+aria);

    }
}
