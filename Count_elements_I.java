import java.util.*;
class Count
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i=0; i<a; i++)
            list.add(sc.nextInt());
        for(int i=0; i<b; i++)
            list2.add(sc.nextInt());
        for(int i : list)
        {
            if(!list1.contains(i))
                list1.add(i);
        }
        for(int i : list1)
        {
            if(Collections.frequency(list2,i) >= 1)
                c++;
        }
        System.out.println(c);
        sc.close();
    }
}