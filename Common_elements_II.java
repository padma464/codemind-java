import java.util.*;
class Count
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        for(int i=0; i<a; i++)
            list1.add(sc.nextInt());
        for(int i=0; i<b; i++)
            list2.add(sc.nextInt());
        for(int i : list1)
        {
            if(!list3.contains(i))
                list3.add(i);
        }
        for(int i : list2)
        {
            if(!list4.contains(i))
                list4.add(i);
        }
        for(int i : list3)
        {
            if(!list4.contains(i))
               System.out.print(i+" "); 
        }
        for(int i : list4)
        {
            if(!list3.contains(i))
                System.out.print(i+" ");
        }
    }
}