import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c,v=0,w=0,d=0,C=0;
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
              v++;
            else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
              v++;
            else if(c==' ')
             w++;
            else if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0')
              d++;
            else
              C++;
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+C);
        System.out.println("Digits: "+d);
        System.out.println("White spaces: "+w);
    }
}