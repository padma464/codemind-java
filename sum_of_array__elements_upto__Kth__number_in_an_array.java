import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],a,i,s=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
         x[i]=sc.nextInt();
        a=sc.nextInt();
        for(i=0;i<n;i++)
        {
            s+=x[i];
            if(x[i]==a)
              break;
        }
          System.out.println(s);
    }
}