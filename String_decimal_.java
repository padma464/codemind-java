import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
        String s=sc.next();
        char ch[]=s.toCharArray();
        int m=0;
        for(char i:ch)
        {
            if(Character.isDigit(i)==false)
              {
                  m=1;
                  System.out.println("False");
                  break;
              }
        }
        if(m==0)
          System.out.println("True");
        }
    }
}