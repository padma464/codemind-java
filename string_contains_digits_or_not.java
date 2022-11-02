import java.util.*;
class Palindromestr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
        String s=sc.next();
        int r=0;
         for(int i=0;i<s.length();i++)
         {
             char c=s.charAt(i);
             if(Character.isDigit(s.charAt(i)))
               r=1;
         }
         if(r==0)
           System.out.println("No");
         else
           System.out.println("Yes");
         t--;
        }
        sc.close();
    }
}