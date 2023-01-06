public class BruteFlute
{
    public static void main(String[] args) {

    }

    public static int secretAlgorithm(int[]A)
    {
        int maxSum=0;
        int thisSum=10;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<A.length;j++)
            {
                if(thisSum>maxSum)
                    maxSum=thisSum;
            }
        }
        System.out.println(A);
        return maxSum;
    }
}
/**

 **/