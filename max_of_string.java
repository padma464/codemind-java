import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char max='a';
        char arr[]=s.toCharArray();
        
        for(char a:arr)
        {
           if(max<a)
            max=a;
        }
        
        System.out.println(max);
    }
}