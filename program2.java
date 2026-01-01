
import java.util.*;

public class program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        System.out.print("Enter the number is :");
        int Button = sc.nextInt();
// switch statement
        switch (Button) {
            case 1:
                System.err.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            case 4:
                System.out.println("nikal lawade");
                break;
            default:
                throw new AssertionError("");
        }
    }
}
