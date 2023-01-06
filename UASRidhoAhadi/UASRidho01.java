package UASRidhoAhadi;

import java.util.Scanner;

public class UASRidho01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int [5];
        int i;

        System.out.print("Masukkan bilangan ke 1: ");
        a[1] = scan.nextInt();
        System.out.print("Masukkan bilangan ke 2: ");
        a[2] = scan.nextInt();
        System.out.print("Masukkan bilangan ke 3: ");
        a[3] = scan.nextInt();

        System.out.println("Hasil sebelum dihapus: " + a[1]+ "" +a[2]+ "" +a[3] + "\n");

        System.out.print("Pilih angka yang ingin dihapus: ");
        i = scan.nextInt();


        if (i ==a[1]){
            System.out.println("Hasil setelah dihapus: "+ a[2] + ""+ a[3]);
        } else if (i == a[2]) {
            System.out.println("Hasil setelah dihapus: " + a[1] + "" + a[3]);
            }else if (i == a[3]) {
            System.out.println("Hasil setelah dihapus: " + a[2] + "" + a[1]);
            } else {
            System.out.println("Salah");
        }
    }
}
