package UASRidhoAhadi;

import java.util.Scanner;
public class Riddle
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka = ");
        int n = input.nextInt();
        int s = 0;

        for (int i=1; i<n; i++)
        {
           s =  s + i * i;
        }
        System.out.println(s);

    }
}
/*
class Riddle{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [][] A ={{5,6,7,8},
                    {1,2,3,4}};

        for (int i = 1; i< A.length-2;i++){
            for (int j = 0; j < A.length-1;j++){
                if (A[i,j] != A[j,i]}){
                    int j=;
                    A[i,j]
                    System.out.println("False");
                }
                System.out.println(A[i+j]);
                return;
            }
        }
    }
}

 */