
import java.util.Scanner;


public class program3 {
    public static void main(String[] args) {
        // Input 
        Scanner SC =new Scanner(System.in);
        String name = SC.nextLine();
        // nextInput()
        // nextFloat()
        System.out.println("Enter you'r name is:");
        System.out.println(name);

        int a = SC.nextInt();
        int b = SC.nextInt();

        int sum = a + b;

        System.out.print("The multiply the two number is:");
        System.out.println(sum);

    }
}
