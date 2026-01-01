
import java.util.*;

public class program4 {

    public static void main(String[] args) {
        // Conditional Statements

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }

        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Event");
        } else {
            System.out.println("odd");
        }
    }
}
