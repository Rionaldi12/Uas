package Uas;
import java.util.Scanner;
public class No3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        int count = 0;

        System.out.println("Masukkan 10 angka:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 5 == 0) {
                count++;
            }
        }

        System.out.println("Banyak angka yang merupakan kelipatan 5: " + count);

        scanner.close();
    }
}
