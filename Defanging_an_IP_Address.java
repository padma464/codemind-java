import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String p="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.')
               p=p+"[.]";
            else
              p=p+s.charAt(i);
        }
        System.out.println(p);
    }
}