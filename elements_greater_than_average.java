import java.util.Scanner;
class diff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,count=0,s=0;
        float d;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
          s+=x[i]; 
        }
        d=(int)s/n;
        for(i=0;i<n;i++)
        {
            if(x[i]>=d)
              count++;
        }
        System.out.println(count);
    }
}