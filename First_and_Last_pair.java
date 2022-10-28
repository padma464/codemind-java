import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int n,x[];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
            x[i]=sc.nextInt();
        int c=0;
        for(int i=0;i<n/2;i++)
        {
            System.out.print(x[i]+" "+x[n-i-1]+" ");
        }
        if(n%2!=0)
          System.out.print(x[n/2]+" "+"0");
    }
}