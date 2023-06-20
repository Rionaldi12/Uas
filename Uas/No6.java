package Uas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No6 {
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

        System.out.print("Masukkan teks yang ingin dicari: ");
        String target = scanner.next();

        List<Integer> indices = search(texts, target);

        if (indices.isEmpty()) {
            System.out.println("Teks '" + target + "' tidak ditemukan dalam array.");
        } else {
            System.out.println("Teks '" + target + "' ditemukan pada indeks: " + indices);
        }

        scanner.close();
    }

    public static List<Integer> search(String[] arr, String target) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                indices.add(i);
            }
        }

        return indices;
    }
}
