import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        char arr[]=s.toCharArray();
        for(char a:arr)
        {
           if(a>='1'&&a<='9')
             c=c+(a-'0');
        }
        System.out.println(c);
    }
}