import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s,b;
        n=sc.nextInt();
        s=n;
        n=(int)Math.sqrt(n);
        b=(n*n);
        if(s==b)
           System.out.println("True");
        else
           System.out.println("False");
    }
}