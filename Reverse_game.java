import java.util.Scanner;
class palindrome
{
    public static  int reverse(int n)
    {
      int sum=0,r;
      while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        } 
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,x[];
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            System.out.print(reverse(x[i])+" ");
        }
    }
}