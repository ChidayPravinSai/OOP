import java.util.Scanner;
public class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number");
        n=sc.nextInt();
        int rev=0;
        int temp = n;
        while(temp>0)
        {
            rev=(rev*10+temp%10);
            temp/=10;

        }
        if(rev==n)
        {
            System.out.println("It is a palindrome!");
        }
        else
        {
            System.out.println("It is not a palindrome!");
        }
    }

}