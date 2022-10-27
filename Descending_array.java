import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int n,x[];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
            x[i]=sc.nextInt();
        int c=0;
        for(int i=0;i<n-1;i+=2)
        {
            if(x[i]>x[i+1])
             c=0;
            else
              {
                  c=1;
                  break;
              }
        }
        if(c==0)
          System.out.println("yes");
        else 
         System.out.println("no");
    }
}