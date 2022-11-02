import java.util.*;
class Palindromestr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,t;
        s=sc.next();
        t=sc.next();
        String r=s+t;
        char x[]=r.toCharArray();
        Arrays.sort(x);
        System.out.println(x);
    }
}