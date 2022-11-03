import java.util.Scanner;
class diff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],j,i,c=0,r,m=0,s;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        s=sc.nextInt();
        for(i=0;i<n;i++)
        {
            r=x[i];
            if(x[i]!=-999)
            {
                c++;
               for(j=0;j<n;j++)
               {
                   if(x[j]==x[i] && i!=j)
                   {
                       c++;
                       x[j]=-999;
                   }
                }
                if(c==s)
                {
                  System.out.print(x[i]+" ");
                  m++;
                }
                c=0;
            }
        }
        if(m==0)
          System.out.println("-1");
    }
}