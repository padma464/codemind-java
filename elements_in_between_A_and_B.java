import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],a,b,i,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
         x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
              System.out.print(x[i]+" ");
              c++;
            }
        }
        if(c==0)
          System.out.println("-1");
    }
}