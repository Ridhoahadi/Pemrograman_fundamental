package UASRidhoAhadi;

public class UASPL
{
    public static void main(String[] args) {
        String[] A ={"S", "O", "R", "T", "E", "X", "A", "M", "P", "L",
                "E"};
        String v;
        int j,k,i;

        for ( i = 1; i < A.length; i++)
        {
            v = A[i];
            j = i - 1;
            while (j > 0 && A[j-1].compareTo(A[i]) > 0)
            {
                A[j] = A[j-1];
                j--;
                // j = j-1 sama artinya dengan j--
            }
            A[j] = v;
        }
        System.out.println("Setelah diurutkan Descending: ");
        for ( k = 0;k < A.length-1; k++)
        {
            System.out.print(A[k] + " ");
        }
    }
}
