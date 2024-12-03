package Exercitiul2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        try {
            File f = new File("in.txt");
            Scanner scanner = new Scanner(f);
            int v[] = new int[6];
            for (int i = 0; i < 6; i++) {
                v[i] = scanner.nextInt();
            }
            System.out.println("Numerele sunt: ");
            for (int i = 0; i < 6; i++) {
                System.out.print(v[i] + " ");
            }
            int s = 0, min = v[0], max = v[0];
            float m_art;
            for (int i = 0; i < 6; i++) {
                s = s + v[i];
            }
            m_art = (float)s / 6;
            for (int i = 0; i < 6; i++) {
                if (v[i] <= min) {
                    min = v[i];
                }
                if (v[i] > max){
                    max = v[i];
                }
            }

            System.out.println("\nSuma: "+s+"\nMedia arit: "+m_art+"\nMinim: "+min+"\nMaxim: "+max);

            PrintWriter writer = new PrintWriter("out.txt");

            writer.println("\nSuma: "+s+"\nMedia arit: "+m_art+"\nMinim: "+min+"\nMaxim: "+max);
            writer.close();

            System.out.println("\nAm adaugat datele in fisierul out.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit " + e.getMessage());
        }

    }
}
