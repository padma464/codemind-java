import java.util.Scanner;
 class Pattern4  
{              
    public static void main(String[] args)   
    {  
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        
         for (int i = 1; i <=n; i++)  
        {  
              for (int j = 1; j<= n - i; j++)   
              {   
                       System.out.print(" ");   
              }   
              for (int k = i-1; k >= 0; k--)  
               {  
                          System.out.print(k);  
               }  
              for (int l = 1; l <= i-1; l++)   
               {  
                         System.out.print(l);   
                }   
          System.out.println();   
         }   
    }
}