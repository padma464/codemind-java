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
    public static boolean ispalindrome(int m)
    {
        int sum=0,r,temp=m;
        while(m>0)
        {
            r=m%10;
            sum=sum*10+r;
            m=m/10;
        }
        if(sum==temp)
           return true;
        else
           return false;
    }
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n+1;;i++)
        {
            if(isprime(i) && ispalindrome(i))
            {
               System.out.println(i);
               break;
            }
        }
            
    }
}