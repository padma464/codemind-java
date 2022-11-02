import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char arr[]=s.toCharArray();
        char a=sc.next().charAt(0);
        int c=0;
        for(char i:arr)
        {
           if(i==a)
             c++;
        }
        if(c>0)
        System.out.println(c);
        else
        System.out.println("-1");
    }
}