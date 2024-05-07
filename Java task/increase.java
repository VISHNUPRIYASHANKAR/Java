import java.util.Scanner;
public class increase {
   public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("first number: ");
        double x = scan.nextDouble();
        System.out.print("second number: ");
        double y = scan.nextDouble();
       System.out.print("third number: ");
        double z = scan.nextDouble();
        if (x < y && y < z)
        {
            System.out.println("Increasing order");
        }
        else if (x > y && y > z)
        {
            System.out.println("Decreasing order");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}