import java.util.Scanner;
class imp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        float s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+((float)1/i);
        }
        System.out.format("%.2f",s);
    }
}