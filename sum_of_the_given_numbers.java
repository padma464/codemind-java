import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,a,b,c;
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            c=a+b;
            System.out.println(c);
        }
    }
}