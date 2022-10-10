import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        if(Math.abs(n-m)==1||(Math.abs(n-m)==9))
          System.out.println("Yes");
        else
          System.out.println("No");
    }
}