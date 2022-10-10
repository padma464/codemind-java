import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,a,b,c,d;
        float e,f;
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
           a=sc.nextInt();
           b=sc.nextInt();
           c=sc.nextInt();
           d=sc.nextInt();
           e=(float)c/a;
           f=(float)d/b;
           if(e<f)
             System.out.println("-1");
           else if(e>f)
             System.out.println("1");
           else
             System.out.println("0");
        }
    }
}