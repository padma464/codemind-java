import java.util.Scanner;
 class Pattern4  
{              
    public static void main(String[] args)   
    { 
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 1; i <= n; i++)  
        {  
            for (int j = 1; j<= n - i; j++)   
            {   
                System.out.print(" ");   
            }   
            for (int k = i; k >= 1; k--)  
            {  
                System.out.print(i);  
            }  
            for (int l = 2; l <= i; l++)   
            {  
                System.out.print(i);   
            }   
            
          System.out.println();   
        } 
    }
}