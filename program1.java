
import java.util.*;

public class program1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
// find the some odd or even number
        if (x % 2 == 0) {
            System.out.println("Event");
        } else {
            System.out.println("Odd");
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
// find the greater number is or not
        if (a == b) {
            System.out.println("Equal");
        } else if (a < b) {
            System.out.println("a is greater");
        } else {
            System.out.println("a is less");
        }

        System.out.print("Enter the number is :");
        int Button = sc.nextInt();
// find the you'r languag to say hello
        if (Button == 1) {
            System.out.println("Hello");
        } else if (Button == 2) {
            System.out.println("Namaste");
        } else if (Button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Nikal lawade");
        }
    }
}
