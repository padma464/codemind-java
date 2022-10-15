import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],a,b,i,s,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
         x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        s=0;
        for(i=0;i<n;i++)
        {
            if(s<x[i])
              s=x[i];
        }
        for(i=0;i<n;i++)
        {
            if(x[i]>=a&&x[i]<=b)
            {
              if(s>x[i])
              {
                s=x[i];
              c++;
              }
            }
        }
        if(c!=0)
        System.out.println(s);
        else
          System.out.println("-1");
    }
}