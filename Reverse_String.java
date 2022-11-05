import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str[]=s.split(" ");
        String p="";
        for(int i=str.length-1;i>=0;i--)
        {
            if(str[i]!=" ")
            p=p+str[i]+" ";
        }
        System.out.println(p.trim());
    }
}