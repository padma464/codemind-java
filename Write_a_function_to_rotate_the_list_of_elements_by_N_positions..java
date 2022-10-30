import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
          list.add(sc.nextInt());
        int k=sc.nextInt();
        Collections.rotate(list,k);
        for(int j:list)
           System.out.print(j+" ");
    }
}