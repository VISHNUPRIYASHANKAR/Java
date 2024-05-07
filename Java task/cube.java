import java.util.Scanner;
public class cube {
   public static void main(String[] args)

   {
       int i,n;
   
       System.out.print("number of terms : ");
       Scanner scan = new Scanner(System.in);
             n = scan.nextInt();
   
        for(i=1;i<=n;i++)
        {
        System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));     
       }
    }
}



  
