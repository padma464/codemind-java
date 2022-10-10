import java.util.Scanner;
class primesbtwminandmax
{
    public static void main(String args[])
    {
        int n,l,a,b,i;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
           a=sc.nextInt();
           b=sc.nextInt();
           if(a<l || b<l)
             System.out.println("UPLOAD ANOTHER");
           else if(a>=l && b>=l && a==b)
             System.out.println("ACCEPTED");
           else
             System.out.println("CROP IT");
        }
    }
}