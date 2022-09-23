import java.util.Scanner;
class fibonacci
{
    public static void main(String args[])
    {
        int a=0,b=1,c,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=a+b;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<n-1;i++)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
            
        }
    }
}