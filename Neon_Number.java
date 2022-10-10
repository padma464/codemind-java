import java.util.Scanner;
class primesbtwminandmax
{
    public static void main(String args[])
    {
        int n,sum=0,r,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=n*n;
        while(m>0)
        {
            r=m%10;
            sum+=r;
            m=m/10;
        }
        if(sum==n)
          System.out.println("Neon Number");
        else
          System.out.println("Not Neon Number");
    }
}