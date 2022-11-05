import java.util.*;
class Palindromestr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        String p="";
        for(String i:arr)
        {
            char arr1[]=i.toCharArray();
            String t="";
            for(char j:arr1)
                 t=j+t;
            p=p+t+" ";
        }
        System.out.println(p.trim());
    }
}