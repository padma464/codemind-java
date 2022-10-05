import java.util.Scanner;
class largest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,s=0;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            if (r>s)
            {
                s=r;
            }
            n=n/10;
        }
        System.out.println(s);
    }
}