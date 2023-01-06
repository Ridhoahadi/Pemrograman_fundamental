import java.util.*;

public class UASPemfud{
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Sekolah : ");
        String sekolah = input.nextLine();

        switch(sekolah){
            case "SMA IPA":
                System.out.println("Pendidikan Teknik Informatika");
                System.out.println("Pendidikan Sistem Informasi");
                System.out.println("Pendidikan Teknologi Informasi");
                break;
            case  "SMK TEKNIK":
                System.out.println("Pendidikan Teknik Informatika");
                break;
            case "SMK TKJ":
                System.out.println("Pendidikan Teknik Informatika");
                System.out.println("Pendidikan Teknologi Informasi");
                break;
            case "SMA IPS":
                System.out.println("Pendidikan Sistem Informasi");
                break;
            case "SMEA":
                System.out.println("Pendidikan Sistem Informasi");
                break;
        }
    }
}
class latihanUAS{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int b = s.nextInt();

        for (int a = 1; a < 10; a++){
            for (int c =1; c > 10; c--){
                System.out.println(" ");
                break;
            }
            System.out.println(" ");
            break;
        }
    }
}