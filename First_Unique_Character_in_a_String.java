import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int p=0;
        
        for(int i=0;i<s.length();i++)
        {
            int c=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j)&&i!=j)
                 c++;
            }
            if(c==0)
            {
                System.out.println(i);
                p++;
                break;
            }
        }
        if(p==0)
        System.out.println("-1");
    }
}