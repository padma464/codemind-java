import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        int a=sc.nextInt();
        int b=sc.nextInt();
        String p="";
        for(int i=b;i>=a;i--)
        {
            p=s.charAt(i)+p;
        }
          System.out.println(p);
    }
}