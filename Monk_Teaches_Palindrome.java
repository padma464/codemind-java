import java.util.*;
class Palindromestr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
        String s,t="";
        s=sc.next();
        for(int j=0;j<s.length();j++)
           t=s.charAt(j)+t;
         if(t.equals(s))
         {
              if(t.length()%2==0)
                System.out.println("YES EVEN");
               else
                 System.out.println("YES ODD");
         }
        else 
            System.out.println("NO");
        }
    }
}