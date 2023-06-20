package Uas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen dalam array: ");
        int size = scanner.nextInt();

        String[] texts = new String[size];

        System.out.println("Masukkan elemen-elemen array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            texts[i] = scanner.next();
        }

        List<Integer> indices = search(texts);

        if (indices.isEmpty()) {
            System.out.println("Tidak ditemukan teks yang panjangnya 5 karakter dalam array.");
        } else {
            System.out.println("Teks yang panjangnya 5 karakter ditemukan pada indeks: " + indices);
        }

        scanner.close();
    }

    public static List<Integer> search(String[] arr) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == 5) {
                indices.add(i);
            }
        }

        return indices;
    }
}
