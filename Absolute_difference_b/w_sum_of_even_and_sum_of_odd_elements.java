import java.util.Scanner;
class obs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,s=0,c=0,d;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            if(x[i]%2==0)
               s+=x[i];
            else
               c+=x[i];
        }
        d=Math.abs(s-c);
        System.out.println(d);
    }
}