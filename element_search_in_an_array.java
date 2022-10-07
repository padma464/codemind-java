import java.util.Scanner;
class diff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],a,i,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
        a=sc.nextInt();
        for(i=0;i<n;i++)
        {
            c=x[i];
            if(x[i]==a)
            {
              c=x[i];
              break;
            }
        }
        if(c==a)
            System.out.println("True");
        else
            System.out.println("False");
    }
}