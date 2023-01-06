import java.util.Scanner;
import java.util.Stack;

public class Palindrome
{
    public static void main(String[] args)
    {

        System.out.print("Masukkan teks = ");
        Scanner a = new Scanner(System.in);
        String inputString = a.nextLine();
        Stack stack = new Stack();

        for (int i = 0; i < inputString.length(); i++)
        {
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";

        while(!stack.isEmpty())
        {
            reverseString = reverseString+stack.pop();
        }

        if(inputString.equals(reverseString))
        {
            System.out.println("Teks ini palindrom");
        }
        else
        {
            System.out.println("Teks ini tidak palindrom");
        }
    }
}