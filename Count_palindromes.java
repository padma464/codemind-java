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
        int n,x[],c=0,i;
        n=sc.nextInt();
        x=new int[n];
        for (i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            if(ispalindrome(x[i]))
              c++;
        }
        System.out.println(c);
        
    }
}