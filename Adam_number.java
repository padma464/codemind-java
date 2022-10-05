import java.util.Scanner;
class adam
{
    
    public static int reverse(int n)
    {
        int r,s=0;
        while(n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,m,f,h;
        n=sc.nextInt();
        d=n*n;
        m=reverse(n);
        f=m*m;
        h=reverse(f);
        if(d==h)
           System.out.println("True");
        else
           System.out.println("False");
    }
}