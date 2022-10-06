import java.util.Scanner;
class diff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],c=0,s=0,d,i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(i%2==0)
              c+=x[i];
            else
              s+=x[i];
        }
        d=Math.abs(c-s);
        System.out.println(d);
    }
}