import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s,d=0,r;
        n=sc.nextInt();
        s=n;
        while(n>0)
        {
            r=n%10;
            d=d*10+r;
            n=n/10;
        }
        if(d==s)
           System.out.println("True");
        else
          System.out.println("False");
    }
}