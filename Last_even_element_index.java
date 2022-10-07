import java.util.Scanner;
class diff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],s=0,i,m;
        n=sc.nextInt();
        m=n;
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            if(x[i]%2==0)
            {
               s=i;
            }
        }
            System.out.println(s);
    }
}