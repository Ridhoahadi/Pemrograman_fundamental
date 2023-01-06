package UASRidhoAhadi;

import java.util.Scanner;

public class UASRidho02 {
    public static void main(String[] args) {
        Scanner apa = new Scanner(System.in);
        int a;
        String[] buah = {"Error", "Mangga", "Pisang", "Melon", "Markisa", "Pepaya", "Durian", "Apel", "Pir", "Anggur"};

        System.out.print("Masukkan nama buah: ");
        String b = apa.next();


        for (a = 0; a < buah.length; a++) {
            System.out.println("Buah " +buah[a]+ "Ditemukan pada posisi indeks ke-"+a);
        }
    }
}  