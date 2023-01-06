package UASRidhoAhadi;

import java.util.Scanner;

public class UASRidho03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String jurusan;
        int gajiPokok;
        double pajak;
        double totalGaji;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jurusan: ");
        jurusan = input.nextLine();

        switch(jurusan) {
            case "TIF":
                gajiPokok = 3000000;
                pajak = 0.05;
                totalGaji = gajiPokok - (gajiPokok * pajak);
                System.out.print("gaji bersih dari " + jurusan + " adalah " + totalGaji);
                break;
            case "TE":
                gajiPokok = 3200000;
                pajak = 0.035;
                totalGaji = gajiPokok - (gajiPokok * pajak);
                System.out.print("gaji bersih dari " + jurusan + "adalah " + totalGaji);
                break;
            case "MT":
                gajiPokok = 2850000;
                pajak = 0.035;
                totalGaji = gajiPokok - (gajiPokok * pajak);
                System.out.print("gaji bersih dari " + jurusan + "adalah " + totalGaji);
                break;
            default:
                gajiPokok = 2500000;
                pajak = 0.035;
                totalGaji = gajiPokok - (gajiPokok * pajak);
                System.out.print("gaji bersih dari " + jurusan + "adalah " + totalGaji);
                break;

        }

    }
}

