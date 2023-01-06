import java.util.Scanner;

public class LuasPersegi {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
                double panjang;
                double lebar;
                double luas;

                System.out.println("Luas persegi panjang");

                System.out.print("Masukkan panjang	: ");
                panjang = baca.nextDouble();

                System.out.print("Masukkan lebar		: ");
                lebar = baca.nextDouble();

                luas = panjang*lebar;

                System.out.println("Luas = "+luas + " cm2");
            }
        }

        class HitungPersegiPanjang {
            public static void main(String[] args) {

                Scanner scr = new Scanner(System.in);

                System.out.println("App Hitung Persegi Panjang");
                System.out.println("===========================");
                System.out.print("Input panjang: ");
                double panjang = scr.nextDouble();
                System.out.print("Input lebar: ");
                double lebar = scr.nextDouble();

                System.out.println("===========================");
                System.out.println("Luas = " + (panjang * lebar) + " cm2");
                System.out.println("===========================");
            }
        }

        class HitungLuasPersegi{
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int sisi,luas;

                System.out.print("Sisi = ");
                sisi = input.nextInt();

                luas = sisi*sisi;
                System.out.println("Luas : " + luas);
            }
        }