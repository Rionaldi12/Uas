package Uas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class No10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen dalam array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Masukkan elemen-elemen array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        List<Integer> multiplesOf5 = searchMultiplesOf5(numbers);

        if (multiplesOf5.isEmpty()) {
            System.out.println("Tidak ditemukan angka kelipatan 5 dalam array.");
        } else {
            Collections.sort(multiplesOf5);
            System.out.println("Angka-angka kelipatan 5 yang ditemukan (diurutkan dari terkecil ke terbesar):");
            for (int num : multiplesOf5) {
                System.out.println(num);
            }
        }

        scanner.close();
    }

    public static List<Integer> searchMultiplesOf5(int[] arr) {
        List<Integer> multiplesOf5 = new ArrayList<>();

        for (int num : arr) {
            if (num % 5 == 0) {
                multiplesOf5.add(num);
            }
        }

        return multiplesOf5;
    }
}
