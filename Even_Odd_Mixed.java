import java.util.Scanner;
class primesbtwminandmax
{
    public static void main(String args[])
    {
        int n,i,r,m=0,s=0,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            m++;
            if(r%2==0)
               c++;
            else
               s++;
            n=n/10;
        }
        if(m==c)
          System.out.println("Even");
        else if(m==s)
          System.out.println("Odd");
        else
          System.out.println("Mixed");
            
    }
}