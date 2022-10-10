import java.util.Scanner;
class Automorphic
{
    public static void main (String args[])
     {
        Scanner sc=new Scanner(System.in);
        int r,i,m,n;
        float s=0;
        n=sc.nextInt();
        m=n;
        String k = Integer.toString(n);  
            int c = k.length();  
        while(n>0)
        {
            r=n%10;
            s+=(int)Math.pow(r,c);
            n=n/10;
            c--;
        }
    
        if(s==m)
              System.out.println("True");
        else
             System.out.println("False");
      }
 }
         
    
        