
import java.util.*;

public class problemSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number is A:");
        int a = sc.nextInt();
        System.out.println("Enter the number is B");
        int b = sc.nextInt();

        // creat same calculator
        int add = a + b;
        int sub = a - b;
        int mult = a * b;
        float div = a / b;
        double modi = a % b;

        System.out.print("This is Addition of a + b: ");
        System.out.println(add);
        System.out.print("This is subtraction of a - b: ");
        System.out.println(sub);
        System.out.print("This is multipication of a * b: ");
        System.out.println(mult);
        System.out.print("This is Divition of a / b: ");
        System.out.println(div);
        System.out.print("This is modulo of a % b: ");
        System.out.println(modi);


        // ther are decalring a day to want
        System.out.println("Enter the Day to you want : ");
        int Button = sc.nextInt();
        switch (Button) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Thusday");
                break;
            case 3:
                System.out.println("wensday");
                break;
            case 4:
                System.out.println("Thausday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Not a Day find");
        }

    }
}
