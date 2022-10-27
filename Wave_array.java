import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int n,x[],c=-1,d=-1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
            x[i]=sc.nextInt();
        if(x[0]<x[1])
        {
         for(int i=0;i<n-2;i+=2)
          {
            if(x[i]<x[i+1] && x[i+1]>x[i+2])
              c=0;
            else
             {
                 c=1;
                 break;
             }
          }
        }
        else
        {
            for(int i=0;i<n-2;i+=2)
          {
            if(x[i]>x[i+1] && x[i+1]<x[i+2])
              d=0;
            else
             {
                 d=1;
                 break;
             }
          }
        }
        if(c==0 ||d==0)
          System.out.println("yes");
        else 
          System.out.println("no");
    }
}