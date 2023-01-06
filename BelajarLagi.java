import java.util.Scanner;

public class BelajarLagi {
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int angka = s.nextInt();

        for (int i= 1; i <= 10; i++) {
            for (int j = 1; i <= 10; j--);
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}