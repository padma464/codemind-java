import java.util.Scanner;
class diff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],s=0,i,c=0;
        float d;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            s+=x[i];
            c++;
        }
        d=(float)s/c;
        System.out.format("%.2f",d);
    }
}