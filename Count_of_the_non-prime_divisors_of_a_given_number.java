import java.util.Scanner;
class prime
{
    public static boolean isprime(int n)
    {
        if(n<2)
        return false;
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
          return true;
        else
          return false;
    }
    public static void main(String args[])
    {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
            if(!isprime(i))
              count++;
            }
        }
        System.out.println(count);
            
    }
}