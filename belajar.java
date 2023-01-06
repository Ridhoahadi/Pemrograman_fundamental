import UASRidhoAhadi.BelajarTerus;

import java.util.Scanner;

public class belajar {
    public static void main(String[] args) {

        int bil;
        for (bil = 1; bil <= 99999; bil++){
            if (bil % 9==0){
                System.out.println(bil);
            }
        }
    }
}
class Satudua{
    public static void main(String[] args) {

        int jumlah = 0;

        for (int bil = -100; bil <= 999; bil++){
            if (bil % 3==0){
                System.out.println(bil);
                jumlah = jumlah + 1;
                bil++;
            }
        }
        System.out.println("Jumlah = " + jumlah);
    }
}

class Libur {
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang= ");
        int price = on.nextInt();

        if (price <= 12000){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
    }
}
