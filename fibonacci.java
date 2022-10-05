import java.util.Scanner;
class fib
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c;
        n=sc.nextInt();
        c=a+b;
        System.out.print(a+" "+b+" ");
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}