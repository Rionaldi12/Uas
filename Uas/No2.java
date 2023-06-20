package Uas;

import java.util.Scanner;
public class No2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah teks: ");
        String teks = scanner.nextLine();

        if (teks.length() == 5) {
            System.out.println("Panjang teks adalah 5 karakter.");
        } else {
            System.out.println("Panjang teks bukan 5 karakter.");
        }
    }
}
