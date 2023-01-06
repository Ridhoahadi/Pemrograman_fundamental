package UASRidhoAhadi;

import java.util.Scanner;

public class BelajarTerus
{
    public static void main (String []args )
    {

    Scanner input = new Scanner(System.in);

            int i,j,n;
            System.out.print("Masukkan nilai dari n = ");
            n=input.nextInt();

            for (i = n/2; i <= n ; i+=2)
            {
                for (j = 1; j < n-i; j+=2)
                {
                    System.out.print(" ");
                }
                for (j = 1; j <= i; j++)
                {
                    System.out.print("-");
                }
                for (j = 1; j<= n-i; j++)
                {
                    System.out.print(" ");
                }
                for (j = 1; j <= i; j++)
                {
                    System.out.print("-");
                }
                System.out.print("\n");
            }
            for (i = n; i >= 1; i--)
            {
                for (j = 1; j < n; j++)
                {
                    System.out.print(" ");
                }
                for (j = 1; j <= (i*2)-1;j++)
                {
                    System.out.print("-");
                }
                System.out.print("\n");
            }
        }
    }
