import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nama ="Ridho Ahadi";
        String nim = "12150115196";
        String matkul = "Pemrograman Fundamental";


        System.out.println("Nama Mahasiswa :" + nama);
        System.out.println("NIM Mahasiswa :" + nim);
        System.out.println("Mata Kuliah :" + matkul);


        System.out.print("Masukkan nilai Tugas = ");
        int tugas = input.nextInt();
        System.out.print("Masukkan nilai UTS = ");
        int uts = input.nextInt();

        System.out.print("Masukkan nilai UAS ");
        int uas = input.nextInt();

        // Untuk membuat nilai rata rata adalah sebagai berikut:
        double akhir = (tugas+uts+uas)/3;

        System.out.println("Nilai rata-rata " + nama+ " adalah = " + akhir);

    }
}
