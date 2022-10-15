import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,p,v;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        p=2*a*b*c*512;
        v=p/1024;
        System.out.println(v+"KB");
    }
}