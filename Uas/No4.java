package Uas;

import java.util.Scanner;
public class No4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("Masukkan 10 teks:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Teks ke-" + i + ": ");
            String text = scanner.nextLine();

            if (text.length() == 5) {
                count++;
            }
        }

        System.out.println("Jumlah teks yang memiliki panjang 5 karakter: " + count);
    }
}
