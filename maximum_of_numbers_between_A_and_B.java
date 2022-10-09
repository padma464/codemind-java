import java.util.Scanner;
class diff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],a,i,s=0,r=0,c=0,b;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
          x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        r=x[0];
        for(i=0;i<n;i++)
        {
           if((x[i]>=a) && (x[i]<=b))
           {
              if(r<x[i])
              {
                r=x[i];
                c++;
              }
           }
        }
        if(c>0)
        System.out.println(r);
        else
          System.out.println("-1");
    }
}