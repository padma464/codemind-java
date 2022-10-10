import java.util.Scanner;
class Automorphic
{
    public static void main (String args[])
     {
        Scanner sc=new Scanner(System.in);
        int n,s=0,a,b,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=b;i+=2)
        {
            s=i*a;
            System.out.println(a+" x "+i+" = "+s);
        }
             
      }
 }
         
    
        