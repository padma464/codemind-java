import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],k,i,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
         x[i]=sc.nextInt();
        k=sc.nextInt();
        
        for(i=0;i<n;i++)
        {
            c+=x[i];
            if(k==x[i])
             break;
        }
        System.out.println(c);
        
    }
}