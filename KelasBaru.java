import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class KelasBaru {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        int apa = baca.nextInt();

        for (int i = 0; i < apa ; i++) {
            int ini = baca.nextInt();
            int hitung =0;
            for (int j = 1; j < ini ; j++) {
                if (ini % j == 0){
                    hitung++;

                }
            }
            if (hitung == 2) {
                System.out.println("Prime");
            }else{
                System.out.println("Notprime");
            }
        }
    }
}
