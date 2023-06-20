package Uas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen dalam array: ");
        int size = scanner.nextInt();

        String[] texts = new String[size];

        System.out.println("Masukkan elemen-elemen array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Teks ke-" + (i+1) + ": ");
            texts[i] = scanner.next();
        }

        System.out.print("Masukkan panjang minimum teks: ");
        int minLength = scanner.nextInt();

        System.out.print("Masukkan panjang maksimum teks: ");
        int maxLength = scanner.nextInt();

        List<Integer> indices = search(texts, minLength, maxLength);

        if (indices.isEmpty()) {
            System.out.println("Tidak ditemukan teks dengan panjang antara " + minLength + " sampai " + maxLength + " karakter dalam array.");
        } else {
            System.out.println("Teks dengan panjang antara " + minLength + " sampai " + maxLength + " karakter ditemukan pada indeks: " + indices);
        }

        scanner.close();
    }

    public static List<Integer> search(String[] arr, int minLength, int maxLength) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int textLength = arr[i].length();
            if (textLength >= minLength && textLength <= maxLength) {
                indices.add(i);
            }
        }

        return indices;
    }
}
