import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=n;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=m;j++)
                {
                    System.out.print(j);
                }
                m--;
                System.out.println();
            }
    }
}