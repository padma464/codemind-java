import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char arr[]=s.toCharArray();
        int c=0;
        for(char i:arr)
        {
           if(i>='0'&&i<='9')
             c++;
        }
        if(c>0)
        System.out.println("Contains "+c+" digit");
        else
        System.out.println("Doesn't contain digit");
    }
}