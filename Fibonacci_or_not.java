import java.util.Scanner;
class fibonacci
{
    public static void main(String args[])
    {
        int a=0,b=1,c,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=a+b;
        for(int i=1;i<n-1;i++)
        {
            if(c==n)
            {
                break;
            }
            a=b;
            b=c;
            c=a+b;
        }
        if(c==n)
          System.out.println("True");
        else
          System.out.println("False");
    }
}