import java.util.Scanner;
class diff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],s,i,sum=0;
        n=sc.nextInt();
        x=new int[n];
        for (i=0 ;i<n;i++)
          x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]!=-999 &&x[i]%2==0)
            {
                for(int j=0;j<n;j++)
                {
                    if(x[i]==x[j] && i!=j)
                    {
                        x[j]=-999;
                    }
                }
                sum++;
            }
        }
        System.out.println(sum);
    }
}