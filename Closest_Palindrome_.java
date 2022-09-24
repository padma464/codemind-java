import java.util.Scanner;
class palindrome
{
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
        Scanner sc=new Scanner(System.in);
        int n,i,s,d;
        n=sc.nextInt();
        
        for(i=n+1;;i++)
        {
            if(ispalindrome(i))
            {
                s=i;
                break;
            }
        }
        for(i=n-1;;i--)
        {
            if(ispalindrome(i))
            {
                d=i;
                break;
            }
        }
        if(Math.abs(n-s)>Math.abs(n-d))
           System.out.print(d);
        else if(Math.abs(n-d)==Math.abs(n-s))
           System.out.print(d+" "+s); 
        else
          System.out.print(s);
        
        
    }
}