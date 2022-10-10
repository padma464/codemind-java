import java.util.Scanner;
class primesbtwminandmax
{
    public static void main(String args[])
    {
        int n,s=1,i,sum=0,r,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=n;
        while(n!=0)
        {
           r=n%10;
           s=1;
           for(i=1;i<=r;i++)
           {
               s=s*i;
           }
           sum=sum+s;
           n=n/10;
          
        }
        if(sum==m)
          System.out.println("The number "+m+" is a strong number");
        else
          System.out.println("The number "+m+" is not a strong number");
    }
}