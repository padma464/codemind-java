import java.util.Scanner;
class diff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i;
        n=sc.nextInt();
        x=new int[n];
        int s=x[0];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            if(x[i]>s)
               s=x[i];
        }
        for(i=0;i<n;i++)
        {
            if(x[i]<s)
               s=x[i];
        }
        System.out.println(s);
        
    }
}