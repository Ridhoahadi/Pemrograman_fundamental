import java.util.Scanner;

public class BelajarPercabangan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan Nilai Anda : ");
        int nilai= s.nextInt();

        if (nilai >= 55 && nilai <= 100){
            System.out.println("Lulus");
        }else {
            System.out.println("Gagal");
        }
    }
}

class  StatementIf {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        int nilai = n.nextInt();

        if (nilai >= 90){
            System.out.println("sangat baik");
        }else if (nilai >= 60){
            System.out.println("baik");
        } else {
            System.out.println("kurang baik");
        }
    }
}


