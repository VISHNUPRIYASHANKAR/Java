import java.util.Scanner;

public class area{
    int length;
    int breadth;
    area(int a, int b)
    {
         length = a;
         breadth = b;
    }
    int area1()
    {
        return length * breadth;
    }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a,b;
            System.out.println("Area of Rectangle");
            System.out.println("Enter the lenght of Recatangle : ");
             a = scan.nextInt();
              scan.nextLine();
            System.out.println("Enter the breadth of Recatangle : ");
             b = scan.nextInt();
            area lb = new area(a,b);
            System.out.println("Area = "+ lb.area1());
        }
    }
     




