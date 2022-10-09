import java.util.Scanner;
class polygon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int a;
        n=sc.nextInt();
        a=(int)n*(n-3)/2;
        System.out.println(a);
    }
}